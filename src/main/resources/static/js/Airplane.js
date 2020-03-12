var airplanelist;
$(document).ready(function () {
 $("#getairplane").click(getPlane);
 $("#createairplane").click(addPlane);
airplanelist = $("datetable").DataTable();

});

function getPlane() {
    $.get("/api/airline", function (plane) {
        airplanelist.clear();
       for(i=0; i<plane.length; i++) {
            const air = plane[i];
            airplanelist.row.add(
            $(
               '<tr id="row'+air.id+'"><td>'+air.id+ '</td>'+
               '<td>'+air.airplaneName+'</td>'+
               '<td>'+air.airport+'</td>'+
               '<td>'+air.FeulAmount+'</td>'+

               '<td><button class="btn btn-success" onclick="removePlne('+air.id+');">Delete</button></td></tr>'
            ));
        }
        airplanelist.draw();

        });
}

function addPlane() {

    var newplane = {
        airplaneName: $("#airplaneName").val(),
        airport: $("#airport").val(),
        FeulAmount: $("#FeulAmount").val(),


    }

    var jsonoject = JSON.stringify(newresvation);
    $.ajax({
        url: "api/resevation/Addplane",
        contentType: "application/json",
        type: "POST",
        data: jsonoject,

        success: function () {
            alert("doen successflly");
            getPlane();
        },
        error: function () {
            alert("doen not successflly");
        }
    });
}
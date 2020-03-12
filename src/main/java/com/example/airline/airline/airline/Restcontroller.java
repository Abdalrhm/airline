package com.example.airline.airline.airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airline")
public class Restcontroller {
    @Autowired
    private AirplineRepository airplineRepository;

    @GetMapping
    @ResponseBody
    public List<Airplane> getAllAirplane() {
        return airplineRepository.findAll();
    }

    @PostMapping("/Addplane")
    public void postAirplane(@RequestBody Airplane newAirplane) {
        airplineRepository.save(newAirplane);

    }

    @DeleteMapping("/{id}")
    public void deleteAirplane(@PathVariable Long id) {
        airplineRepository.deleteById(id);


    }
}

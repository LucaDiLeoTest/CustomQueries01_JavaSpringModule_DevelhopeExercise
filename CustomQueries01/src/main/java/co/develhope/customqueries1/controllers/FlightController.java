package co.develhope.customqueries1.controllers;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("/all")
    public ResponseEntity<List<Flight>> getAllFlights(){
        return ResponseEntity.ok(flightService.getAllFlights());
    }

    @PostMapping("/")
    public ResponseEntity<String> createFlights(){
        return ResponseEntity.ok(flightService.createFlights());
    }


}
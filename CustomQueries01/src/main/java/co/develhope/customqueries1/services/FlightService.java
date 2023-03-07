package co.develhope.customqueries1.services;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.entities.FlightStatus;
import co.develhope.customqueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public String createFlights(){
        for(int i=0;i<50;i++){
            Random random = new Random();
            Flight flight = new Flight();
            flight.setDescription(String.valueOf(random.ints()));
            flight.setFromAirport(String.valueOf(random.ints()));
            flight.setToAirport(String.valueOf(random.ints()));
            flight.setFlightStatus(FlightStatus.ONTIME);
            flightRepository.save(flight);
        }
        return "All flights have been created!";
    }

    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }
}

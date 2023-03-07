package co.develhope.customqueries1.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_flight")
    private Long id;

    @Column(name="description")
    private String description;
    @Column(name="from_airport")
    private String fromAirport;
    @Column(name="to_airport")
    private String toAirport;

    @Enumerated(EnumType.STRING)
    private FlightStatus flightStatus;

    /**
     * No args contructor
     */
    public Flight() {
    }

    /**
     * All args constructor
     * @param description
     * @param fromAirport
     * @param toAirport
     * @param flightStatus
     */
    public Flight(String description, String fromAirport, String toAirport, FlightStatus flightStatus) {
        this.description = description;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.flightStatus = flightStatus;
    }

    //----------Getter and Setter----------
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }
}
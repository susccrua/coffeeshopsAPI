package com.example.coffeeshops.coffeeshop;

import javax.persistence.*;

@Entity
@Table
public class Coffeeshop {
    @Id
    @SequenceGenerator(
            name="coffeeshop_sequence",
            sequenceName="coffeeshop_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy=GenerationType.SEQUENCE,
            generator="coffeeshop_sequence"
    )
    private Long id;
    private String name;
    private Double longitude;
    private Double latitude;
    private int rating;

    public Coffeeshop() {
    }

    public Coffeeshop(Long id, String name, Double longitude, Double latitude, int rating) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.rating = rating;
    }

    public Coffeeshop(String name, Double longitude, Double latitude, int rating) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Coffeeshop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", rating=" + rating +
                '}';
    }
}

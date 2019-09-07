package com.bikeyxe.bikes.bicycle;

import javax.persistence.*;

@Entity
@Table(name="bicycle")
public class Bicycle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="serial_number")
    private String serialNumber;

    @Column(name="brand")
    private String brand;

    @Column(name="bike_model")
    private String bikeModel;

    @Column(name="color")
    private String color;

    @Column(name="image_url")
    private String imageUrl;

    public Bicycle() {
    }

    public Bicycle(String serialNumber, String brand, String bikeModel, String color, String imageUrl) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.bikeModel = bikeModel;
        this.color = color;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

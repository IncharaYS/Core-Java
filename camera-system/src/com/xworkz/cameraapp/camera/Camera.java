package com.xworkz.cameraapp.camera;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Camera {
    private String cameraId;
    private String brand;
    private String model;
    private double price;
    private String type;
    private boolean waterproof;

    @Override
    public String toString() {
        return "Camera{" +
                "cameraId='" + cameraId + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", waterproof=" + waterproof +
                '}';
    }
}

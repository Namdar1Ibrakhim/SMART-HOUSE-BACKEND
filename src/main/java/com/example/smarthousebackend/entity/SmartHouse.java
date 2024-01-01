package com.example.smarthousebackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "smart_house")
public class SmartHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double humidity;

    private Double pressure;

    private Double temperature;

    private String macAddress;

    private Date updatedAt;

    private Double co2;

    private Integer door;

    private Integer motion;

    @OneToOne
    @JoinColumn(name = "settings_id", referencedColumnName = "id")
    private Settings settings;


}

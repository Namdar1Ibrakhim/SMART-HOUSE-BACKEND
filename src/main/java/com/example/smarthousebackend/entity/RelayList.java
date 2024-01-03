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
@Table(name = "relayList")
public class RelayList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer switch1;

    private Integer switch2;

    private Integer switch3;

    private Integer switch4;

    private Integer humidifier;

    private Integer alarm;

    private Integer airflow;

    private Integer pump;

    private Integer heating;

    private Date localDate;

    private Integer mode;

    private Integer security;
}
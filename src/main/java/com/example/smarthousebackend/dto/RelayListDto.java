package com.example.smarthousebackend.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class RelayListDto {

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

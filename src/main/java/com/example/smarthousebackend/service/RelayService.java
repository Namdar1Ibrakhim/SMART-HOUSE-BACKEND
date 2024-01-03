package com.example.smarthousebackend.service;

import com.example.smarthousebackend.dto.RelayDto;
import com.example.smarthousebackend.dto.RelayListDto;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface RelayService {

    void clickButton(Integer device, Integer val);

    RelayDto getValue() throws ExecutionException, InterruptedException;

    void editMode(Integer id);

    List<RelayListDto> getAll();
}

package com.example.smarthousebackend.service.impl;

import com.example.smarthousebackend.dto.RelayDto;
import com.example.smarthousebackend.dto.RelayListDto;
import com.example.smarthousebackend.entity.Relay;
import com.example.smarthousebackend.entity.RelayList;
import com.example.smarthousebackend.mapper.RelayListMapper;
import com.example.smarthousebackend.mapper.RelayMapper;
import com.example.smarthousebackend.repository.Firebase;
import com.example.smarthousebackend.repository.RelayListRepository;
import com.example.smarthousebackend.repository.RelayRepository;
import com.example.smarthousebackend.service.RelayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Slf4j
@Service
@RequiredArgsConstructor
public class RelayServiceImpl implements RelayService {

    private final Firebase firebase;
    private final RelayRepository relayRepository;
    private final RelayListRepository relayListRepository;
    private final RelayListMapper relayListMapper;
    private final RelayMapper relayMapper;



    @Override
    public void clickButton(Integer device, Integer val) {
        switch (device){
            case 0:
                firebase.switch1(val);
                break;
            case 1:
                firebase.switch2(val);
                break;
            case 2:
                firebase.switch3(val);
                break;
            case 3:
                firebase.switch4(val);
                break;
            case 4:
                firebase.humidifier(val);
                break;
            case 5:
                firebase.alarm(val);
                break;
            case 6:
                firebase.airflow(val);
                break;
            case 7:
                firebase.pump(val);
                break;
            case 8:
                firebase.heating(val);
                break;
            default:
                break;
        }
    }

    @Override
    public RelayDto getValue() throws ExecutionException, InterruptedException {
        Relay relay = relayRepository.findById(1).get();
        return relayMapper.toDto(relay);
    }

    @Override
    public void editMode(Integer id) {
        firebase.editMode(id);
    }

    @Override
    public List<RelayListDto> getAll() {
        List<RelayList> relayList = relayListRepository.findAll();
        return relayListMapper.toDtoList(relayList);
    }
}

package com.example.smarthousebackend.mapper;

import com.example.smarthousebackend.dto.RelayDto;
import com.example.smarthousebackend.dto.RelayListDto;
import com.example.smarthousebackend.entity.Relay;
import com.example.smarthousebackend.entity.RelayList;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RelayListMapper extends Mappable<RelayList, RelayListDto> {

    RelayListDto toDto(RelayList relayList);

    RelayList toEntity(RelayListDto relayListDto);

    List<RelayListDto> toDtoList(List<RelayList> relayLists);
}

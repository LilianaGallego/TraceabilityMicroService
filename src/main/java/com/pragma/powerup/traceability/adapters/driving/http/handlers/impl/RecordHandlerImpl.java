package com.pragma.powerup.traceability.adapters.driving.http.handlers.impl;

import com.pragma.powerup.traceability.adapters.driving.http.dto.request.RecordRequestDto;
import com.pragma.powerup.traceability.adapters.driving.http.dto.response.RecordResponseDto;
import com.pragma.powerup.traceability.adapters.driving.http.handlers.IRecordHandler;
import com.pragma.powerup.traceability.adapters.driving.http.mapper.IRecordRequestMapper;
import com.pragma.powerup.traceability.adapters.driving.http.mapper.IRecordResponseMapper;
import com.pragma.powerup.traceability.domain.api.IRecordServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RecordHandlerImpl implements IRecordHandler {

    private final IRecordServicePort recordServicePort;
    private final IRecordRequestMapper recordRequestMapper;

    private final IRecordResponseMapper recordResponseMapper;

    @Override
    public void saveRecord(RecordRequestDto recordRequestDto) {
        recordServicePort.saveRecord(recordRequestMapper.toRecord(recordRequestDto));
    }

    @Override
    public List<RecordResponseDto> getAllRecordsByClient(Long idClient) {
       return recordResponseMapper.toResponseList(recordServicePort.getAllRecordsByClient(idClient));
    }
}

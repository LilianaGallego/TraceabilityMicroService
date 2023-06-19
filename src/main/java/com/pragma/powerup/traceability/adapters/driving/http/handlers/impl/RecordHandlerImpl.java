package com.pragma.powerup.traceability.adapters.driving.http.handlers.impl;

import com.pragma.powerup.traceability.adapters.driving.http.dto.request.RecordRequestDto;
import com.pragma.powerup.traceability.adapters.driving.http.handlers.IRecordHandler;
import com.pragma.powerup.traceability.adapters.driving.http.mapper.IRecordRequestMapper;
import com.pragma.powerup.traceability.domain.api.IRecordServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class RecordHandlerImpl implements IRecordHandler {

    private final IRecordServicePort orderServicePort;
    private final IRecordRequestMapper orderRequestMapper;


    @Override
    public void saveRecord(RecordRequestDto orderRequestDto) {
        orderServicePort.saveRecord(orderRequestMapper.toOrder(orderRequestDto));
    }
}

package com.pragma.powerup.traceability.adapters.driving.http.handlers;

import com.pragma.powerup.traceability.adapters.driving.http.dto.request.RecordRequestDto;

public interface IRecordHandler {
    void saveRecord(RecordRequestDto orderRequestDto);
}

package com.pragma.powerup.traceability.adapters.driving.http.handlers;

import com.pragma.powerup.traceability.adapters.driving.http.dto.request.RecordRequestDto;
import com.pragma.powerup.traceability.adapters.driving.http.dto.response.RecordResponseDto;

import java.util.List;

public interface IRecordHandler {
    void saveRecord(RecordRequestDto recordRequestDto);
    List<RecordResponseDto> getAllRecordsByClient(Long idClient);
}

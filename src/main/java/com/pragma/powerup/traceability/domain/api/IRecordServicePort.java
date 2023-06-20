package com.pragma.powerup.traceability.domain.api;

import com.pragma.powerup.traceability.domain.model.Record;

import java.util.List;

public interface IRecordServicePort {
    void saveRecord(Record order);
    List<Record> getAllRecordsByClient(Long idClient);

}

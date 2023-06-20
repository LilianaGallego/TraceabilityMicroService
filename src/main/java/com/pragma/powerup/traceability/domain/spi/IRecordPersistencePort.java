package com.pragma.powerup.traceability.domain.spi;

import com.pragma.powerup.traceability.domain.model.Record;

import java.util.List;


public interface IRecordPersistencePort {

    void saveRecord(Record records);
    List<Record> getAllRecordsByClient(Long idClient);




}

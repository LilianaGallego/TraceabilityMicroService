package com.pragma.powerup.traceability.domain.usecase;

import com.pragma.powerup.traceability.domain.model.Record;
import com.pragma.powerup.traceability.domain.spi.IRecordPersistencePort;
import com.pragma.powerup.traceability.domain.api.IRecordServicePort;

import java.util.List;

public class RecordUseCase implements IRecordServicePort {
    private final IRecordPersistencePort recordPersistencePort;

    public RecordUseCase(IRecordPersistencePort recordPersistencePort) {
        this.recordPersistencePort = recordPersistencePort;
    }


    @Override
    public void saveRecord(Record records) {
        recordPersistencePort.saveRecord(records);
    }

    @Override
    public List<Record> getAllRecordsByClient(Long idClient) {
        return recordPersistencePort.getAllRecordsByClient(idClient);
    }

}

package com.pragma.powerup.traceability.domain.usecase;

import com.pragma.powerup.traceability.domain.model.Record;
import com.pragma.powerup.traceability.domain.spi.IRecordPersistencePort;
import com.pragma.powerup.traceability.domain.api.IRecordServicePort;

import java.util.List;

public class RecordUseCase implements IRecordServicePort {
    private final IRecordPersistencePort orderPersistencePort;

    public RecordUseCase(IRecordPersistencePort orderPersistencePort) {
        this.orderPersistencePort = orderPersistencePort;
    }


    @Override
    public void saveRecord(Record order) {
        orderPersistencePort.saveRecord(order);
    }

    @Override
    public List<Record> getAllOrders() {
        return null;
    }
}

package com.pragma.powerup.traceability.domain.spi;

import com.pragma.powerup.traceability.domain.model.Record;



public interface IRecordPersistencePort {

    void saveRecord(Record order);



}

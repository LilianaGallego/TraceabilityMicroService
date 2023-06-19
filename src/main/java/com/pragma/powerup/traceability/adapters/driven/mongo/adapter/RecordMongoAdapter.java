package com.pragma.powerup.traceability.adapters.driven.mongo.adapter;

import com.pragma.powerup.traceability.adapters.driven.mongo.mappers.IRecordCollectionMapper;
import com.pragma.powerup.traceability.adapters.driven.mongo.repositories.IRecordRepository;
import com.pragma.powerup.traceability.domain.model.Record;
import com.pragma.powerup.traceability.domain.spi.IRecordPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class RecordMongoAdapter implements IRecordPersistencePort {
    private final IRecordRepository orderRepository;
    private final IRecordCollectionMapper orderCollectionMapper;


    @Override
    public void saveRecord(Record order) {
        orderRepository.save(orderCollectionMapper.toCollection(order));

    }
}

package com.pragma.powerup.traceability.adapters.driven.mongo.adapter;

import com.pragma.powerup.traceability.adapters.driven.mongo.mappers.IRecordCollectionMapper;
import com.pragma.powerup.traceability.adapters.driven.mongo.repositories.IRecordRepository;
import com.pragma.powerup.traceability.domain.model.Record;
import com.pragma.powerup.traceability.domain.spi.IRecordPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
public class RecordMongoAdapter implements IRecordPersistencePort {
    private final IRecordRepository recordRepository;
    private final IRecordCollectionMapper recordCollectionMapper;


    @Override
    public void saveRecord(Record records) {
        recordRepository.save(recordCollectionMapper.toCollection(records));

    }

    @Override
    public List<Record> getAllRecordsByClient(Long idClient) {
        return recordCollectionMapper.toRecordList(recordRepository.getAllRecordsByIdClient(idClient));
    }
}

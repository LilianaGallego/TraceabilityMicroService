package com.pragma.powerup.traceability.adapters.driven.mongo.repositories;

import com.pragma.powerup.traceability.adapters.driven.mongo.collection.RecordCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IRecordRepository extends MongoRepository<RecordCollection,String> {
    List<RecordCollection> getAllRecordsByIdClient(Long idClient);

}

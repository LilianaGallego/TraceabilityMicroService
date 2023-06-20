package com.pragma.powerup.traceability.adapters.driven.mongo.mappers;

import com.pragma.powerup.traceability.adapters.driven.mongo.collection.RecordCollection;
import com.pragma.powerup.traceability.domain.model.Record;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRecordCollectionMapper {
    RecordCollection toCollection(Record records);

    List<Record> toRecordList(List<RecordCollection> recordCollectionList);

}

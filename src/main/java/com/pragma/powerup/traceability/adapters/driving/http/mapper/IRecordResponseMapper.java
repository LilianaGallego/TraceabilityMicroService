package com.pragma.powerup.traceability.adapters.driving.http.mapper;

import com.pragma.powerup.traceability.adapters.driving.http.dto.response.RecordResponseDto;
import com.pragma.powerup.traceability.domain.model.Record;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRecordResponseMapper {

    List<RecordResponseDto> toResponseList(List<Record> recordList);
}

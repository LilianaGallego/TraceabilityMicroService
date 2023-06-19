package com.pragma.powerup.traceability.adapters.driving.http.mapper;

import com.pragma.powerup.traceability.domain.model.Record;
import com.pragma.powerup.traceability.adapters.driving.http.dto.request.RecordRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRecordRequestMapper {

    Record toOrder(RecordRequestDto restaurantRequestDto);
}

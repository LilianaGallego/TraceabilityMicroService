package com.pragma.powerup.traceability.configuration;

import com.pragma.powerup.traceability.adapters.driven.mongo.adapter.RecordMongoAdapter;
import com.pragma.powerup.traceability.adapters.driven.mongo.mappers.IRecordCollectionMapper;
import com.pragma.powerup.traceability.adapters.driven.mongo.repositories.IRecordRepository;
import com.pragma.powerup.traceability.domain.api.IRecordServicePort;
import com.pragma.powerup.traceability.domain.spi.IRecordPersistencePort;
import com.pragma.powerup.traceability.domain.usecase.RecordUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IRecordRepository recordRepository;
    private final IRecordCollectionMapper recordCollectionMapper;

    @Bean
    public IRecordServicePort recordServicePort() {
        return new RecordUseCase(recordPersistencePort());
    }
    @Bean
    public IRecordPersistencePort recordPersistencePort() {
        return new RecordMongoAdapter(recordRepository, recordCollectionMapper);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

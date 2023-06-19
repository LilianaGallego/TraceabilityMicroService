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

    private final IRecordRepository orderRepository;
    private final IRecordCollectionMapper orderCollectionMapper;

    @Bean
    public IRecordServicePort orderServicePort() {
        return new RecordUseCase(orderPersistencePort());
    }
    @Bean
    public IRecordPersistencePort orderPersistencePort() {
        return new RecordMongoAdapter(orderRepository, orderCollectionMapper);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

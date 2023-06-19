package com.pragma.powerup.traceability.domain.usecase;

import com.pragma.powerup.traceability.domain.api.IRecordServicePort;
import com.pragma.powerup.traceability.domain.spi.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecordUseCaseTest {

    @Mock
    private IRecordPersistencePort recordPersistencePort;

    private IRecordServicePort recordServicePort;
    @BeforeEach
    void setUp() {
        recordServicePort = new RecordUseCase(recordPersistencePort);
    }

}
package com.pragma.powerup.traceability.domain.usecase;

import com.pragma.powerup.traceability.domain.api.IRecordServicePort;
import com.pragma.powerup.traceability.domain.spi.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.pragma.powerup.traceability.domain.model.Record;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RecordUseCaseTest {

    @Mock
    private IRecordPersistencePort recordPersistencePort;

    private IRecordServicePort recordServicePort;
    @BeforeEach
    void setUp() {
        recordServicePort = new RecordUseCase(recordPersistencePort);
    }



    @Test
    void testSaveRecord() {
        // Arrange
        Record record = new Record("1jejdjjd", 10L, 1L, "email@gmail.com", LocalDate.now(), "EARNING","PREPARATION",1L, "email@gmail.com");

        // Act
        recordServicePort.saveRecord(record);

        // Assert
        verify(recordPersistencePort, times(1)).saveRecord(record);
    }

    @Test
    void testGetAllRecordsByClient() {
        // Arrange
        Long idClient = 1L;
        List<Record> expectedRecords = new ArrayList<>();
        // Add expected records to the list

        when(recordPersistencePort.getAllRecordsByClient(idClient)).thenReturn(expectedRecords);

        // Act
        List<Record> actualRecords = recordServicePort.getAllRecordsByClient(idClient);

        // Assert
        assertEquals(expectedRecords, actualRecords);
        verify(recordPersistencePort, times(1)).getAllRecordsByClient(idClient);
    }
}
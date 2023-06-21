package com.pragma.powerup.traceability.adapters.driving.http.controller;

import com.pragma.powerup.traceability.adapters.driving.http.dto.request.RecordRequestDto;
import com.pragma.powerup.traceability.adapters.driving.http.dto.response.RecordResponseDto;
import com.pragma.powerup.traceability.adapters.driving.http.handlers.IRecordHandler;
import com.pragma.powerup.traceability.configuration.Constants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RecordRestControllerTest {

    @Mock
    private IRecordHandler recordHandler;

    @InjectMocks
    private RecordRestController restController;

    private RecordRequestDto recordRequestDto;

    @BeforeEach
    void setUp() {


        restController = new RecordRestController(recordHandler);
    }

    @Test
    void testSaveRecord() {
        // Arrange
        RecordRequestDto recordRequestDto = new RecordRequestDto(/* Initialize recordRequestDto with required data */);
        Map<String, String> expectedResponse = Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.RECORD_CREATED_MESSAGE);

        // Act
        ResponseEntity<Map<String, String>> response = restController.saveRecord(recordRequestDto);

        // Assert
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(expectedResponse, response.getBody());
        verify(recordHandler, times(1)).saveRecord(recordRequestDto);
    }


    @Test
    void testGetAllRecordsByClient() {
        // Arrange
        Long idClient = 1L;
        List<RecordResponseDto> expectedRecords = new ArrayList<>();
        // Add expected records to the list

        when(recordHandler.getAllRecordsByClient(idClient)).thenReturn(expectedRecords);

        // Act
        ResponseEntity<List<RecordResponseDto>> response = restController.getAllRecordsByClient(idClient);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedRecords, response.getBody());
        verify(recordHandler, times(1)).getAllRecordsByClient(idClient);
    }

}
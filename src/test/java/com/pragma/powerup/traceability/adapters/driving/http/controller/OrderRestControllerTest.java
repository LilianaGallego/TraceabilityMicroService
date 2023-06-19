package com.pragma.powerup.traceability.adapters.driving.http.controller;

import com.pragma.powerup.traceability.adapters.driving.http.dto.request.RecordRequestDto;
import com.pragma.powerup.traceability.adapters.driving.http.handlers.IRecordHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class OrderRestControllerTest {

    @Mock
    private IRecordHandler orderHandler;

    @InjectMocks
    private RecordRestController restController;

    private RecordRequestDto orderRequestDto;

    @BeforeEach
    void setUp() {

    }

}
package com.pragma.powerup.traceability.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class RecordResponseDto {
    private Long idOrder;
    private Long idClient;
    private LocalDate date;
    private String stateOld;
    private String stateNew;
    private String urlLogo;
    private Long idEmployee;
    private String email;
}

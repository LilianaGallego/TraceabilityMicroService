package com.pragma.powerup.traceability.adapters.driving.http.controller;

import com.pragma.powerup.traceability.adapters.driving.http.dto.request.RecordRequestDto;
import com.pragma.powerup.traceability.adapters.driving.http.dto.response.RecordResponseDto;
import com.pragma.powerup.traceability.adapters.driving.http.handlers.IRecordHandler;
import com.pragma.powerup.traceability.configuration.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/traceability")
@RequiredArgsConstructor
public class RecordRestController {
    private final IRecordHandler recordHandler;
    @SecurityRequirement(name = "jwt")
    @Operation(summary = "Add a new order record",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Record created",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "409", description = "Record already exists",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
            })
    @PostMapping("/record")
    public ResponseEntity<Map<String, String>> saveRecord(@RequestBody RecordRequestDto recordRequestDto) {
        recordHandler.saveRecord(recordRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.RECORD_CREATED_MESSAGE));
    }

    @SecurityRequirement(name = "jwt")
    @Operation(summary = "Get all records by client",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Records by client",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "404", description = "Records not found ",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
            })
    @GetMapping("/records/client/{idClient}")
    public ResponseEntity<List<RecordResponseDto>> getAllRecordsByClient(@PathVariable Long idClient) {

        return ResponseEntity.ok(recordHandler.getAllRecordsByClient(idClient));
    }

}


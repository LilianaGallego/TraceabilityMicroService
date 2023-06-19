package com.pragma.powerup.traceability.configuration;

import com.pragma.powerup.traceability.adapters.driven.mongo.exceptions.NoDataFoundException;
import com.pragma.powerup.traceability.configuration.security.exception.TokenException;
import com.pragma.powerup.traceability.configuration.security.exception.UserNotRoleAuthorized;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.Collections;
import java.util.Map;

import static com.pragma.powerup.traceability.configuration.Constants.*;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoDataFoundException(NoDataFoundException noDataFoundException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, Constants.NO_DATA_FOUND_MESSAGE));
    }


    @ExceptionHandler(UserNotRoleAuthorized.class)
    public ResponseEntity<Map<String, String>> handleUserNotRoleAuthorized(
            UserNotRoleAuthorized userNotRoleAuthorized) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, Constants.USER_NOT_ROLE_AUTHORIZED));

    }

    @ExceptionHandler(TokenException.class)
    public ResponseEntity<Map<String, String>> handleTokenException(
            TokenException tokenException) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, Constants.RESPONSE_ERROR_MESSAGE_TOKEN));
    }
}

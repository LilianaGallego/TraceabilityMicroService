package com.pragma.powerup.traceability.domain.model;

import java.time.LocalDate;

public class Record {
    private String id;
    private Long idOrder;
    private Long idClient;
    private String emailClient;
    private LocalDate date;
    private String stateOld;
    private String stateNew;
    private Long idEmployee;
    private String emailEmployee;

    public Record() {
    }

    public Record(String id, Long idOrder, Long idClient, String emailClient, LocalDate date, String stateOld, String stateNew, Long idEmployee, String emailEmployee) {
        this.id = id;
        this.idOrder = idOrder;
        this.idClient = idClient;
        this.emailClient = emailClient;
        this.date = date;
        this.stateOld = stateOld;
        this.stateNew = stateNew;
        this.idEmployee = idEmployee;
        this.emailEmployee = emailEmployee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStateOld() {
        return stateOld;
    }

    public void setStateOld(String stateOld) {
        this.stateOld = stateOld;
    }

    public String getStateNew() {
        return stateNew;
    }

    public void setStateNew(String stateNew) {
        this.stateNew = stateNew;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }
}

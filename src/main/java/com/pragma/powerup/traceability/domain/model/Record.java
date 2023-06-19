package com.pragma.powerup.traceability.domain.model;

import java.time.LocalDate;

public class Record {
    private String id;
    private Long idOrder;
    private Long idClient;
    private LocalDate date;
    private String stateOld;
    private String stateNew;
    private String urlLogo;
    private Long idEmployee;
    private String email;

    public Record() {
    }

    public Record(String id, Long idOrder, Long idClient, LocalDate date, String stateOld, String stateNew,
                  String urlLogo, Long idEmployee, String email) {
        this.id = id;
        this.idOrder = idOrder;
        this.idClient = idClient;
        this.date = date;
        this.stateOld = stateOld;
        this.stateNew = stateNew;
        this.urlLogo = urlLogo;
        this.idEmployee = idEmployee;
        this.email = email;
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

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

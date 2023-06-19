package com.pragma.powerup.traceability.adapters.driven.mongo.collection;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Records")
public class RecordCollection {
    @Id
    private String id;
    private Long idOrder;
    private Long idClient;
    private LocalDate date;
    private String stateOld;
    private String stateNew;
    private String urlLogo;
    private Long idEmployee;
    private String email;

}

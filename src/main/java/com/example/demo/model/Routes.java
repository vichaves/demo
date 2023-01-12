package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "routes")
public class Routes {

    @Id
    private String id;

    @Field("src_airport")
    private String srcAirport;

    @Field("dst_airport")
    private String dstAirport;

    private String codeshare;
    private String stops;
    private String airplane;


}

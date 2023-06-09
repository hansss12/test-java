package com.test.test.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class KomponentGaji {

    private String name;
    private String type;
    private Long amount;

}

package com.test.test.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Employee {

    private String name;
    private String sex;
    private MaritalStatus marital_status;
    private int childs;
    private CountryEnum country;

}

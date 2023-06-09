package com.test.test.dto;

import com.test.test.entity.Employee;
import com.test.test.entity.KomponentGaji;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Payload {
    private Employee employee;
    private List<KomponentGaji> komponentGajis;
}

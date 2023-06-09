package com.test.test.service;

import com.test.test.entity.CountryEnum;
import com.test.test.entity.Employee;
import com.test.test.entity.MaritalStatus;
import org.springframework.stereotype.Service;

@Service
public class PTKPService {

    public long getPtkp(Employee employee) {

        if(CountryEnum.indonesia.equals(employee.getCountry())) {
            if(MaritalStatus.not_maried.equals(employee.getMarital_status())) {
                return 25l;
            }

            if(MaritalStatus.maried.equals(employee.getMarital_status()) && employee.getChilds() == 0) {
                return 50l;
            }

            // maried dan sudah pnya anak
            return 75l;
        }else if(CountryEnum.vietnam.equals(employee.getCountry())) {
            if(MaritalStatus.not_maried.equals(employee.getMarital_status())) {
                return 15l;
            }

            return 50l;
        }

        return 0l;
    }

}

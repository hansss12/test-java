package com.test.test.service;

import com.test.test.dto.Payload;
import com.test.test.entity.KomponentGaji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxCalculation {

    @Autowired private PTKPService ptkpService;

    public long getNetIncome(Payload payload) {
        final long ptkp = ptkpService.getPtkp(payload.getEmployee());
        if(ptkp == 0l) {
            throw new RuntimeException("silahkan pilih dlu");
        }
        long brutoEarning = getBrutoEarning(payload.getKomponentGajis());

        long netEarning = brutoEarning - ptkp;

        // TODO
        // CARI PAJAK PERTAHUN
        // CARI PAJAK PERBULAN


    }

    private long getBrutoEarning(List<KomponentGaji> komponentGajis) {
        long temp = 0l;
        for(KomponentGaji komponentGaji: komponentGajis) {
            if("earning".equalsIgnoreCase(komponentGaji.getType())) {
                temp += komponentGaji.getAmount();
            }
        }
        return temp;
    }

}

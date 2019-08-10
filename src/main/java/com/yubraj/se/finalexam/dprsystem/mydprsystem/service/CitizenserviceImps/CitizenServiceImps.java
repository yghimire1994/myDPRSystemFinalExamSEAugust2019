package com.yubraj.se.finalexam.dprsystem.mydprsystem.service.CitizenserviceImps;

import com.yubraj.se.finalexam.dprsystem.mydprsystem.model.Citizen;
import com.yubraj.se.finalexam.dprsystem.mydprsystem.repository.CitizenRepository;
import com.yubraj.se.finalexam.dprsystem.mydprsystem.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImps implements CitizenService {

    @Autowired
    private CitizenRepository repository;

    @Override
    public List<Citizen> getAllCitizen() {
        return repository.findAll(Sort.by("lastName"));
    }

    @Override
    public Citizen saveCitizen(Citizen citizen) {
        return repository.save(citizen);
    }

    @Override
    public double getWholeNationalYearlyIncome(List<Citizen> citizen) {
        double netIncome = 0.0;
        for(Citizen cit : citizen) {
            netIncome += cit.getYearlyIncome();
        }
        return netIncome;
    }
}

package com.yubraj.se.finalexam.dprsystem.mydprsystem.service;

import com.yubraj.se.finalexam.dprsystem.mydprsystem.model.Citizen;

import java.util.List;

public interface CitizenService {
List<Citizen> getAllCitizen();
Citizen saveCitizen(Citizen citizen);
    double getWholeNationalYearlyIncome(List<Citizen> citizen);

}

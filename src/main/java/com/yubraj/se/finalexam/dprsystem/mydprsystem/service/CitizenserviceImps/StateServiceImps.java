package com.yubraj.se.finalexam.dprsystem.mydprsystem.service.CitizenserviceImps;

import com.yubraj.se.finalexam.dprsystem.mydprsystem.model.State;
import com.yubraj.se.finalexam.dprsystem.mydprsystem.repository.StateRepository;
import com.yubraj.se.finalexam.dprsystem.mydprsystem.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImps implements StateService
{
    @Autowired
    private StateRepository repository;

    @Override
    public List<State> getAllStates() {
        return repository.findAll();

    }
}

package com.yubraj.se.finalexam.dprsystem.mydprsystem.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stateId;
    @Column(nullable = false)
    private String stateCode;
    @Column(nullable = false)
    private String StateName;
    @OneToMany( mappedBy = "state", cascade = CascadeType.ALL)
    List<Citizen> products=new ArrayList<>();

    public State(){}

    public State(String stateCode, String stateName) {
        this.stateCode = stateCode;
        StateName = stateName;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }

    public List<Citizen> getProducts() {
        return products;
    }

    public void setProducts(List<Citizen> products) {
        this.products = products;
    }

}

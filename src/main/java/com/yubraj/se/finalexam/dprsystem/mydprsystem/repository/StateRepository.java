package com.yubraj.se.finalexam.dprsystem.mydprsystem.repository;

import com.yubraj.se.finalexam.dprsystem.mydprsystem.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}

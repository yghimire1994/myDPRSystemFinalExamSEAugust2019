package com.yubraj.se.finalexam.dprsystem.mydprsystem.repository;

import com.yubraj.se.finalexam.dprsystem.mydprsystem.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen,Long> {
}

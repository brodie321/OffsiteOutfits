package com.example.offsideoutfits.repository;


import com.example.offsideoutfits.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    }


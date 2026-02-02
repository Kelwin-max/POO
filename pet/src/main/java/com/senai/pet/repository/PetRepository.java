package com.senai.pet.repository;

import com.senai.pet.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository <Pet, Long> {
}

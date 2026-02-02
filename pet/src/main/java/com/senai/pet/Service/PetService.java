package com.senai.pet.Service;

import com.senai.pet.DTO.PetDTO;
import com.senai.pet.entity.Pet;
import com.senai.pet.repository.PetRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService<PetDto> {

    private static PetRepository petRepository;

    public  PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public static String salvarPet(PetDTO dto){
        Pet pet = new Pet (dto.getNome(), dto.getIdade(),dto.getPorte(), dto.getTipo(), dto.getRaca());
        petRepository.save(pet);

        return "Salvo com sucesso";
    }

    public List<Pet> ListAll(){
        return petRepository.findAll();
    }

    public Optional<Pet> ListbyId(Long id) {
        return petRepository.findById(id);
    }

    public Pet alterate (Pet pet, Long id) {
        pet.setId(id);
        return petRepository.save(pet);
    }

    public void DELETE (Long id){
        petRepository.deleteById(id);
    }
}

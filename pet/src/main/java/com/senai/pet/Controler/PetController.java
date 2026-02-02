package com.senai.pet.Controler;

import com.senai.pet.DTO.PetDTO;
import com.senai.pet.Service.PetService;
import com.senai.pet.entity.Pet;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")

public class PetController {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }
    //postmapping cira algo novo
    @PostMapping
    public ResponseEntity<?> savePet (@RequestBody @Valid PetDTO dto) {
        PetService.salvarPet(dto);
        return ResponseEntity.ok("Pet salvo");
    }

    @GetMapping("Listando")
    public ResponseEntity<?> Listando(){
        return ResponseEntity.ok(petService.ListAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> Listandoporid(@PathVariable Long id) {
        return ResponseEntity.ok(petService.ListbyId(id));
    }
    @PutMapping ("/{id}")
    public ResponseEntity<?> Listando(@PathVariable Long id, @RequestBody Pet pet) {
        return ResponseEntity.ok(petService.alterate(pet, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> Listando(@PathVariable Long id) {
        petService.DELETE(id);
        return ResponseEntity.ok("");
    }
}

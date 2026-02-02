package com.senai.pet.DTO;

import com.senai.pet.entity.Pet;
import com.senai.pet.enuns.Porte;
import com.senai.pet.enuns.Tipo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PetDTO {
    @NotBlank
    private String nome;
    private int idade;
    @NotNull
    private Porte porte;
    @NotNull
    private Tipo tipo;
    private String raca;

    public PetDTO(Pet pet) {
        this.nome = pet.getNome();
        this.idade = pet.getIdade();
        this.porte = pet.getPorte();
        this.tipo = pet.getTipo();
        this.raca = pet.getRaca();


    }
}

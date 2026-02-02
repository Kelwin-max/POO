package com.senai.pet.entity;

import com.senai.pet.enuns.Porte;
import com.senai.pet.enuns.Tipo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_pet")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private int idade;
    private Porte porte;
    private Tipo tipo;
    private String raca;

    public Pet(@NotNull String nome, int idade, Porte porte, Tipo tipo, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
        this.tipo = tipo;
        this.raca = raca;
    }
}


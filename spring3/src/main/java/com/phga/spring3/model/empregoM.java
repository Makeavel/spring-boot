package com.phga.spring3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class empregoM {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 4)
    private String empreza;
    @NotNull
    @Size(min = 5)
    private String descricao;
    @NotNull
    @Size(min = 3)
    private String titulo;

    
}
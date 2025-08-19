package com.jvllearning.event_system.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String descricao;
    private double preco;

    @OneToMany(mappedBy = "atividade") //mapeado pela instancia Atividade
    private List<Bloco> blocos; //é uma lista pois podemos ter varios blocos
}

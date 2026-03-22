package com.example.ex5.Models;

import jakarta.persistence.*;

@Entity(name = "Categoria")
@Table(name = "tb_categoria")

public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "desc_categoria")
    private String descCategoria;

    public CategoriaModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }
}

package com.backend.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String img_src;
    private String titulo;
    private String descripcion;
    private String link_ver_mas;
    
    public Proyectos(){ 
               
    }
    public Proyectos(Long id, String nombre, String apellido){
        this.id = id;
        this.img_src = img_src;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.link_ver_mas = link_ver_mas;
    }
    
}
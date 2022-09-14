package com.cassioguerra.br.CRUDREST.APIJAVADEPLOY.model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String nome;
   private String telefone;
   private String emial;
   private String urlAvatar;

    
}

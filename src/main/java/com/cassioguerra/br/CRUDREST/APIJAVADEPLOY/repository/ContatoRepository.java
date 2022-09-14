package com.cassioguerra.br.CRUDREST.APIJAVADEPLOY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cassioguerra.br.CRUDREST.APIJAVADEPLOY.model.Contato;
@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface ContatoRepository extends JpaRepository<Contato, Long> {
    
}

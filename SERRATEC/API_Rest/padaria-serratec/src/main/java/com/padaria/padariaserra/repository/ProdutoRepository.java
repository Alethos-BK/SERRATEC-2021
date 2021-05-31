package com.padaria.padariaserra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.padaria.padariaserra.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}

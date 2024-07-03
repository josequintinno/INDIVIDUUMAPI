package br.com.quintinno.INDIVIDUUMAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quintinno.INDIVIDUUMAPI.entity.TipoPessoaEntity;

@Repository
public interface TipoPessoaRepository extends JpaRepository<TipoPessoaEntity, Long> { }

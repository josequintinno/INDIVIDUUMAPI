package br.com.quintinno.INDIVIDUUMAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinno.INDIVIDUUMAPI.entity.TipoPessoaEntity;
import br.com.quintinno.INDIVIDUUMAPI.repository.TipoPessoaRepository;

@Service
public class TipoPessoaService {

    @Autowired
    private TipoPessoaRepository tipoPessoaRepository;

    public List<TipoPessoaEntity> findAll() {
        return this.tipoPessoaRepository.findAll();
    }

}

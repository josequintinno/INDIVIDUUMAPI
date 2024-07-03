package br.com.quintinno.INDIVIDUUMAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinno.INDIVIDUUMAPI.entity.PessoaEntity;
import br.com.quintinno.INDIVIDUUMAPI.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaEntity> findAll() {
        return this.pessoaRepository.findAll();
    }

}

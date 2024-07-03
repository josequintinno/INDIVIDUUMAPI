package br.com.quintinno.INDIVIDUUMAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinno.INDIVIDUUMAPI.entity.PessoaEntity;
import br.com.quintinno.INDIVIDUUMAPI.service.PessoaService;

@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController { 

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaEntity> findAll() {
        return this.pessoaService.findAll();
    }

}

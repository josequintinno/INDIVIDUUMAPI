package br.com.quintinno.INDIVIDUUMAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinno.INDIVIDUUMAPI.entity.TipoPessoaEntity;
import br.com.quintinno.INDIVIDUUMAPI.service.TipoPessoaService;

@RestController
@RequestMapping("/api/v1/tipo-pessoa")
public class TipoPessoaController {

    @Autowired
    private TipoPessoaService tipoPessoaService;

    @GetMapping
    public List<TipoPessoaEntity> findAll() {
        return this.tipoPessoaService.findAll();
    }

}

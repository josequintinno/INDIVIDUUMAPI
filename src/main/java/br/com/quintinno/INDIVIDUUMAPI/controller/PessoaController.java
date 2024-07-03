package br.com.quintinno.INDIVIDUUMAPI.controller;

import br.com.quintinno.INDIVIDUUMAPI.entity.TipoPessoaEntity;

public class PessoaController {

    private Long codigo;

    private TipoPessoaEntity tipoPessoaEntity;

    private String nome;

    public PessoaController() { }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public TipoPessoaEntity getTipoPessoaEntity() {
        return tipoPessoaEntity;
    }

    public void setTipoPessoaEntity(TipoPessoaEntity tipoPessoaEntity) {
        this.tipoPessoaEntity = tipoPessoaEntity;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

package br.com.quintinno.INDIVIDUUMAPI.entity;

public class TipoPessoaEntity {

    private Long codigo;

    private String descricao;

    public TipoPessoaEntity() { }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

package br.com.quintinno.INDIVIDUUMAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PESSOA")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_PESSOA", nullable = false)
    private TipoPessoaEntity tipoPessoaEntity;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "PROPRIETARIO", nullable = false)
    private String proprietario;

    @Column(name = "E_ATIVO", nullable = false)
    private Boolean eAtivo;

    public PessoaEntity () { }

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

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Boolean geteAtivo() {
        return eAtivo;
    }

    public void seteAtivo(Boolean eAtivo) {
        this.eAtivo = eAtivo;
    }

}

package com.pro.chamado.model;



import java.io.Serializable;
import javax.persistence.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "TB_DEPARTAMENTO")
public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String nome;
    @NotEmpty
    private Boolean isAtivo;
    @OneToMany
    private List<Unidade> unidadeList;

    public Departamento() {
    }

    public Departamento(long id, String nome, Boolean isAtivo, List<Unidade> unidadeList) {
        this.id = id;
        this.nome = nome;
        this.isAtivo = isAtivo;
        this.unidadeList = unidadeList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Departamento other = (Departamento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return isAtivo;
    }

    public void setAtivo(Boolean ativo) {
        isAtivo = ativo;
    }

    public List<Unidade> getUnidadeList() {
        return unidadeList;
    }

    public void setUnidadeList(List<Unidade> unidadeList) {
        this.unidadeList = unidadeList;
    }
}

package udesc.projetoDSW.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author gustavo
 */
@Entity
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "Categoria_id")
    private Categoria categoria;
    
    @ManyToOne
    @JoinColumn(name = "Competicao_id")
    private Competicao competicao;
    
    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
    private Set<RodadaEquipe> RodadaEquipes;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Competicao getCompeticao() {
        return competicao;
    }

    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }
    
    public Set<RodadaEquipe> getRodadaEquipes() {
        return RodadaEquipes;
    }

    public void setRodadaEquipes(Set<RodadaEquipe> RodadaEquipes) {
        this.RodadaEquipes = RodadaEquipes;
    }

}

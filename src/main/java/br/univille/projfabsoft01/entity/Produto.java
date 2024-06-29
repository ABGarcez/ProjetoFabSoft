package br.univille.projfabsoft01.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 1000, nullable = false)
    @NotBlank(message = "não pode ser em branco")
    private String nome;
    //@Column(length = 1000)
    
    private double preco_pacote;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private MaterialProduto material;


    public MaterialProduto getMaterial() {
        return material;
    }
    public void setMaterial(MaterialProduto material) {
        this.material = material;
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
    public double getPreco_pacote() {
        return preco_pacote;
    }
    public void setPreco_pacote(double preco_pacote) {
        this.preco_pacote = preco_pacote;
    }
    @Override
    public String toString() {
        return nome;
    }
    
}

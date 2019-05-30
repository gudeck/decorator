/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author guzuc
 */
public abstract class Roupa {

    Integer codRoupa;
    protected Double valorAluguel;
    protected String nomeProduto; 

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    
    
}

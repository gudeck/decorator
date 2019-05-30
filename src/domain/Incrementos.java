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
public abstract class Incrementos extends Roupa {

    Roupa vestido;
    
    public Incrementos(Roupa vestido){
        this.vestido = vestido;
    }
    
}

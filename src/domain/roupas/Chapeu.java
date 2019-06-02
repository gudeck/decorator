/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.roupas;

import domain.Roupa;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author guzuc
 */
@Entity
public class Chapeu extends Roupa implements Serializable{

    public Chapeu() {
        this.nomeProduto = "Chapéu";
        this.valorAluguel = 35.60;
    }

}

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
public class Calca extends Roupa implements Serializable{

    public Calca() {
        this.nomeProduto = "Calça";
        this.valorAluguel = 75.0;
    }

}

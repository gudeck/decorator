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
public class Vestido extends Roupa implements Serializable {

    public Vestido() {
        this.nomeProduto = "Vestido";
        this.valorAluguel = 122.65;
    }

}

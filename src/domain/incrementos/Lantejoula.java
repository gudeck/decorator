/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.incrementos;

import domain.Incrementos;
import domain.Roupa;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author guzuc
 */
@Entity
public class Lantejoula extends Incrementos implements Serializable{

    public Lantejoula() {
    }

    public Lantejoula(Roupa vestido) {
        super(vestido);
        nomeProduto = "Lantejoula";
        valorAluguel = 0.2;
    }

}

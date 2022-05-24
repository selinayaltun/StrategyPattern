/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author SELİNAY
 */
public class OnHorse implements IMounted{

    @Override
    public int calcHitPoint() {
       return 50;
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SELİNAY
 */
public class Charc {
    double baseHit;
    Map<String, IMounted> status = new HashMap<String, IMounted>();
    
    public Charc(double baseHit)
    {
        this.baseHit = baseHit;
        status.put(OnFoot.class.getName(), new OnFoot());
        status.put(OnHorse.class.getName(), new OnHorse());
    
    }
    
    public void applyMounted(IMounted m)
    {
        baseHit = baseHit* m.calcHitPoint();
        System.out.println("Your overll hit is " + baseHit + "!!");
    
    }
    
    public IMounted getMyMount(int selection ){
        switch(selection){
            case 1: return status.get(OnFoot.class.getName());
            case 2: return status.get(OnHorse.class.getName());
            default:return null;
        
        }

    }
}

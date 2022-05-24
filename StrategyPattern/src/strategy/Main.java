/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Scanner;

/**
 *
 * @author SELİNAY
 */
public class Main {

    public static void main(String[] args) {
        
        //Our aim in Strategy Pattern is to separate the ones that can change.
        //It is to ensure that things that can change are encapsulated
        // in different places from those that will remain the same.
        //Our code is more safety against any change as we try to keep everything singular against change.
        //It is to give importance to interfaces rather than implementation.
        //Inheritance is not always good. Because inheritance enhances coupling.
        
       
        Charc paladin = new Charc(100.0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to ride a horse or go on fast");
        int choice = sc.nextInt();
        IMounted mount = paladin.getMyMount(choice);
        paladin.applyMounted(mount);
       
    }
    
}

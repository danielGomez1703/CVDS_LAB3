/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

/**
 *
 * @author daniel.gomez-su
 */

public class Registry {
    private ArrayList<Person> registers = new ArrayList<Person>(); ;
    
    
    public RegisterResult registerVoter(Person p) {
        if (registers.contains(p)){
            return RegisterResult.DUPLICATED;
        }
        if (!p.isAlive()){
            return RegisterResult.DEAD;
        }if  (p.getAge() < 0 || p.getAge()>120){
            return RegisterResult.INVALID_AGE;
        }if  (p.getAge() < 18 && p.getAge()>0){
            return RegisterResult.UNDERAGE;
        }else{
            registers.add(p);
            return RegisterResult.VALID;
        }
        
        // TODO Validate person and return real result.
        
    }
    
}

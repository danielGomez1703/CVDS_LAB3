/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.registry;

/**
 *
 * @author daniel.gomez-su
 */
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Pedro Jai",10,18,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateIsDuplicated() {

        Person person = new Person("camila castro", 10, 18, Gender.FEMALE, true);
        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
    
    @Test
    public void validateIsDead() {

        Person person = new Person("camila castro",10,18,Gender.FEMALE,false);
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateMajorAge() {

        Person person = new Person("carlos coronado", 10, 17, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
        
    }
    
    @Test
    public void validateRangeAge() {

        Person person = new Person("felipe gonzalez", 10, 200, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
        
    }



    // TODO Complete with more test cases
}
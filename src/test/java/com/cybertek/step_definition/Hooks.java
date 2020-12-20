package com.cybertek.step_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class
Hooks {
    @Before
    public void setup(){
        System.out.println("Empty hook before");
    }

    @Before("@scenario1")
    public  void  specialScenario(){
        System.out.println("Special hook before \n");

    }

    @After("@scenario1")
    public void specialTeardown(){
        System.out.println("Special hook after \n");
    }

    @After
    public void teardown(){
        System.out.println("Empty hook after ");
    }
}

package com.cybertek.step_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class
Hooks {
    @Before
    public void setup(Scenario scenario){
        System.out.println("Scenario name: "+scenario.getName());
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

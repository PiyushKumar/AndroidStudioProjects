package com.example.pkumar.funfacts;


import java.util.Random;
/**
 * Created by pkumar on 12/20/14.
 */
public class FactBook {
    String [] fact_list = new String[]{"Fact1", "Fact2", "Fact3", "Fact4", "Fact5"};
    String fact = "Ostriches are stupid";
    Random randomGenerator = new Random();

    public String getFact(){
        int randomNumber  = randomGenerator.nextInt(5);
        return  fact_list[randomNumber];
    }
}

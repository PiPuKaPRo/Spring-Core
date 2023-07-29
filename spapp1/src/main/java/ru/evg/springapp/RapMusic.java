package ru.evg.springapp;

import org.springframework.stereotype.Component;

@Component("someRapMusic")
public class RapMusic implements Music{

//    public void doMyInit(){
//        System.out.println("Init");
//    }
//
//    public void doMyDestroy(){
//        System.out.println("Destroy");
//    }
    @Override
    public String getSong(){
        return "Konstruct";
    }
}

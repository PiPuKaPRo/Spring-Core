package ru.evg.springapp;

import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music{

//    private ClassicalMusic(){}
//
//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }
//
//    public void doMyInit(){
//        System.out.println("Init");
//    }
//
//    public void doMyDestroy(){
//        System.out.println("Destroy");
//    }
    @Override
    public String getSong(){
        return "Moon sonata";
    }
}

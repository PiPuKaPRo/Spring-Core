package ru.evg.springapp;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

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
    public List<String> getSong(){
        List<String> cm = Arrays.asList("Moon sonata","Chelcunchk","111");
        return cm;
    }
}

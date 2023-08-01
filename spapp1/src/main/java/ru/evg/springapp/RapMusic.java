package ru.evg.springapp;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

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
    public List<String> getSong(){
        List<String> rm = Arrays.asList("Konstrukt","Badabum","333");
        return rm;
    }
}

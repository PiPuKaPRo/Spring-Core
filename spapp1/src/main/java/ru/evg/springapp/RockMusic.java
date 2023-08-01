package ru.evg.springapp;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("someRockMusic")
public class RockMusic implements Music{

//    public void doMyInit(){
//        System.out.println("Init");
//    }
//
//    public void doMyDestroy(){
//        System.out.println("Destroy");
//    }

    @Override
    public List<String> getSong() {
        List<String> rcm = Arrays.asList("Warriors","Rise","222");
        return rcm;
    }
}

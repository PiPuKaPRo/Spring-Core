package ru.evg.springapp;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.Arrays;
import java.util.List;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public List<String> getRandomSong() {
        List<String> cm = Arrays.asList("Moon sonata", "Chelcunchk", "111");
        return cm;
    }

    @Override
    public String getSong() {
        return null;
    }
}

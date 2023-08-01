package ru.evg.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("computer")
public class Computer {
    private int id;
    private MusicPlayer mp;
    @Autowired
    public Computer(MusicPlayer mp) {
        this.id = 1;
        this.mp = mp;
    }
    @Override
    public String toString(){
        return "Computer " + id + " " + mp.playMusic(MusicalGenres.RAP);
    }
}

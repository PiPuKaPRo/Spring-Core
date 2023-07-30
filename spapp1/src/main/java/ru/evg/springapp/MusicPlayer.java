package ru.evg.springapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {
    private ClassicalMusic cm;
    private RapMusic rpm;
    private RockMusic rm;
//    @Autowired
//    private List<Music> playlist = new ArrayList<>();
    private Music music;

//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//

    @Autowired
    public MusicPlayer(ClassicalMusic cm, RapMusic rpm, RockMusic rm) {
        this.cm = cm;
        this.rpm = rpm;
        this.rm = rm;
    }

    //    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    public MusicPlayer() {}
////
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer(List<Music> playlist) {
//        this.playlist = playlist;
//    }
//    public void setPlaylist(List<Music> playlist) {
//        this.playlist = playlist;
//    }
    public String playMusic(){
        return "Playing: " + rm.getSong();
    }
//
//    public void playPlayList(){
//        for (int i = 0; i < playlist.toArray().length; i++) {
//            System.out.println(playlist.get(i).getSong());
//        }
//    }

}

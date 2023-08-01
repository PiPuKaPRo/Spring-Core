package ru.evg.springapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicPlayer")
public class MusicPlayer {
    //    @Autowired
//    private List<Music> playlist = new ArrayList<>();
    private Music music1;
    private Music music2;
    private Music music3;

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
    public MusicPlayer(@Qualifier("someClassicalMusic") Music music1,
                       @Qualifier("someRockMusic") Music music2,
                       @Qualifier("someRapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
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
    public String playMusic(MusicalGenres mg) {
        Random r  = new Random();
        String m;
        if (mg == MusicalGenres.CLASSICAL){
            m = music1.getSong().get(r.nextInt(music1.getSong().size()));
        } else if (mg == MusicalGenres.ROCK) {
            m = music2.getSong().get(r.nextInt(music2.getSong().size()));
        } else m = music3.getSong().get(r.nextInt(music3.getSong().size()));

        return m;
    }
//
//    public void playPlayList(){
//        for (int i = 0; i < playlist.toArray().length; i++) {
//            System.out.println(playlist.get(i).getSong());
//        }
//    }

}

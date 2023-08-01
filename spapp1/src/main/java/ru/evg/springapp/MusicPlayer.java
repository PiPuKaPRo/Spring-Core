package ru.evg.springapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }


    @Autowired
    public MusicPlayer(@Qualifier("someClassicalMusic") Music music1,
                       @Qualifier("someRockMusic") Music music2,
                       @Qualifier("someRapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

        public void setVolume(int volume) {
        this.volume = volume;
    }
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
            m = music1.getRandomSong().get(r.nextInt(music1.getRandomSong().size()));
        } else if (mg == MusicalGenres.ROCK) {
            m = music2.getRandomSong().get(r.nextInt(music2.getRandomSong().size()));
        } else m = music3.getRandomSong().get(r.nextInt(music3.getRandomSong().size()));

        return m;
    }
//
//    public void playPlayList(){
//        for (int i = 0; i < playlist.toArray().length; i++) {
//            System.out.println(playlist.get(i).getSong());
//        }
//    }

}

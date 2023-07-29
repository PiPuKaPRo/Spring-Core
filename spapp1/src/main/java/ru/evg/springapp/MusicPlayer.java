package ru.evg.springapp;


import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> playlist = new ArrayList<>();
    private Music music;

    private String name;
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

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> playlist) {
        this.playlist = playlist;
    }

    public void setPlaylist(List<Music> playlist) {
        this.playlist = playlist;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void playPlayList(){
        for (int i = 0; i < playlist.toArray().length; i++) {
            System.out.println(playlist.get(i).getSong());
        }
    }

}

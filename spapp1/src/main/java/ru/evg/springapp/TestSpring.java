package ru.evg.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music m1 = context.getBean("someRockMusic", Music.class);
        Music m2 = context.getBean("someClassicalMusic", Music.class);

        MusicPlayer mp1 = new MusicPlayer(m1);
        MusicPlayer mp2 = new MusicPlayer(m2);

        mp1.playMusic();
        mp2.playMusic();

//        mp.playPlayList();
//
//        System.out.println(mp.getName());
//        System.out.println(mp.getVolume());

        context.close();
    }
}

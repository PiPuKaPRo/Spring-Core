package ru.evg.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer mp = context.getBean("playlist", MusicPlayer.class);

        mp.playPlayList();

        System.out.println(mp.getName());
        System.out.println(mp.getVolume());

        context.close();
    }
}

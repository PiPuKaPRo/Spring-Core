package ru.evg.springapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.evg.springapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}

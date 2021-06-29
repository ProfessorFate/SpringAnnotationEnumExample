package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static SpringCore.TestEnum.CLASSICAL;
import static SpringCore.TestEnum.ROCK;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer= applicationContext.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic(CLASSICAL);

    }
}

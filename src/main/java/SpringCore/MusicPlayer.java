package SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

     private Music classicalMusic;
     private Music rockMusic;

    public MusicPlayer(@Qualifier("binClassic")Music classicalMusic,@Qualifier("binRock") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public void playMusic(TestEnum genre){
        Random random=new Random();

        int randomNumber= random.nextInt(2);

        if(genre==TestEnum.ROCK){
            System.out.println(rockMusic.getSong().get(randomNumber));
        }else {
                System.out.println(classicalMusic.getSong().get(randomNumber));
            }
        }
    }

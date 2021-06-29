package SpringCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("binClassic")
public class ClassicalMusic implements Music{

    private List<String> songs= new ArrayList<>();

   {
        songs.add("Wind cries Mary");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
   }


    @Override
    public List<String> getSong() {
        return songs;
    }
}

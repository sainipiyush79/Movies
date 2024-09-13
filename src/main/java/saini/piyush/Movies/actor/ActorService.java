package saini.piyush.Movies.actor;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActorService {

    public List<Actor> getActors(){
        return List.of(
                new Actor("SRK", 50, "M", "1/2/2000"),
                new Actor("Salman", 50, "M", "1/2/2000"),
                new Actor("Tom Cruise", 50, "M", "1/2/2000")
        );

    }
}

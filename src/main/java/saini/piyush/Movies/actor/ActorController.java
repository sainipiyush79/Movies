package saini.piyush.Movies.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/actors")
public class ActorController {
    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }



    @GetMapping()
    public List<Actor> getActors(){
       return actorService.getActors();

    }

    @PostMapping()
    public String addActor(@RequestBody String actor){
        return "hello Mr." +  actor;
    }
}

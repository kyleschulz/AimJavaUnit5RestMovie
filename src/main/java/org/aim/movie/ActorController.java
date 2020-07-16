package org.aim.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/actor")
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Actor> getAllActors() {
        return actorRepository.findAll();
    }

}
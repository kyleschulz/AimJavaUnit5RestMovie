package org.aim.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/director")
public class DirectorController {

    @Autowired
    private DirectorRepository directorRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

}
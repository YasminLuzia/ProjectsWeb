package luzia.yasmin.ProjectGrimoire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yasmin L
 * @since 04/26/2020 - 3:30pm
 * @version 1.0
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "Welcome to the my Grimoire application! Here you'll find some spells for Dungeons and Dragons 5e";
    }

}

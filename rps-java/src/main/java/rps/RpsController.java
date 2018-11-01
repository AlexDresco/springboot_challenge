package rps;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RpsController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to RPS, the Drescotti way";
    }

}
package us.hgmtrebing.epiphany;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
public class EpiphanyController {

    @RequestMapping("/")
    public String index() {
        return "Wat up world";
    }
}

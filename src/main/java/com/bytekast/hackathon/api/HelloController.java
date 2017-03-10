package com.bytekast.hackathon.api;

import com.tendril.myhome.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final String template = "[%s] Hello, %s!";

    @Autowired
    private AppConfig appConfig;

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET)
    public Map sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return Collections.singletonMap("response", String.format(template, appConfig.getEnv(), name));
    }
}
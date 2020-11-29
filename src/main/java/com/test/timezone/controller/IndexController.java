package com.test.timezone.controller;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.test.timezone.services.TimezoneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private TimezoneServices timezoneServices;
    @CrossOrigin
    @PostMapping(value="/changeTime")
    public String changeTimeZone( @RequestBody String requestJson) {
        JsonObject object = new JsonParser().parse(requestJson).getAsJsonObject();
        //@RequestParam String hour, @RequestParam String timezone

        return timezoneServices.changeTimeZone(object.get("hour").getAsString(),object.get("timezone").getAsString());
    }
}

package com.geekster.simpleurlhitcounter.controller;

import com.geekster.simpleurlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    private UrlHitService urlHitService;


    @GetMapping("count")
    public int getHitCount() {
        return urlHitService.getHitCount();
    }

    @GetMapping("username/{username}/count")
    public Map<String, Object> getUserHitCount(@PathVariable String username) {
        int hitCount = urlHitService.getUserHitCount(username);

        Map<String, Object> response = new HashMap<>();
        response.put("username", username);
        response.put("hitCount", hitCount);

        return response;
    }
}

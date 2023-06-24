package com.geekster.simpleurlhitcounter.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {

    private final Map<String, Integer> userHitCountMap = new HashMap<>();

    private int hitCount =0;
    public int getHitCount() {
        hitCount++;
        return hitCount;
    }


    public int getUserHitCount(String username) {
        int currentCount = userHitCountMap.getOrDefault(username, 0);
        userHitCountMap.put(username, currentCount + 1);
        return currentCount + 1;
    }
}

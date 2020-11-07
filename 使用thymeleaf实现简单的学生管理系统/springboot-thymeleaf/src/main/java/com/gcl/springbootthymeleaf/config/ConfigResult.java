package com.gcl.springbootthymeleaf.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ConfigResult {
    public static ResponseEntity<Map<String,Object>> success(){
        Map<String,Object> map = new HashMap<>();
        map.put("data", "success");
        map.put("code","200");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    public static ResponseEntity<Map<String,Object>> error(){
        Map<String,Object> map = new HashMap<>();
        map.put("data", "error");
        map.put("code","404");
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

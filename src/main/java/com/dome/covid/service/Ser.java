package com.dome.covid.service;

import com.dome.covid.entity.Data;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Ser {
    public Data getApi() throws JsonProcessingException {

        final String url = "https://covid19.th-stat.com/api/open/today";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        Data data = objectMapper.readValue(result, Data.class);
        return data;
    }
}

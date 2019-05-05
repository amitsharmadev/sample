package com.amit.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("raining")
public class RainyDayService implements WeatherService {

    @Override
    public String forecast() {
        return "Today is raining day!";
    }

}

package com.rgb.redgreenbule.service;

import com.google.gson.Gson;
import com.rgb.redgreenbule.entity.Color;
import com.rgb.redgreenbule.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ColorService {

    @Autowired
    private Gson gson;
    @Autowired
    private ColorRepository colorRepository;

    private String redHexValue = "00";
    private String greenHexValue = "00";
    private String blueHexValue = "00";

    public Mono<String> handleRGBValue(String red) {
        return Mono.just(red)
                .map(c -> gson.fromJson(c, Color.class))
                .map(c -> {
                    switch (c.getRgbColor()) {
                        case RED: redHexValue = c.getHexValue(); break;
                        case GREEN: greenHexValue = c.getHexValue(); break;
                        case BLUE: blueHexValue = c.getHexValue(); break;
                    };
                    return Mono.just(c);
                })
                .map(c -> "#" + redHexValue + greenHexValue + blueHexValue);
    }

}

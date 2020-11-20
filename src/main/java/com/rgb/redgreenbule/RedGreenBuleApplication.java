package com.rgb.redgreenbule;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rgb.redgreenbule.entity.Color;
import com.rgb.redgreenbule.gson.ColorDeserializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedGreenBuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedGreenBuleApplication.class, args);
	}

	@Bean
	public Gson gson() {
		return new GsonBuilder().registerTypeAdapter(Color.class, new ColorDeserializer()).create();
	}

}

package com.rgb.redgreenbule.configuration;

import com.rgb.redgreenbule.entity.Color;
import com.rgb.redgreenbule.entity.RGBEnum;
import com.rgb.redgreenbule.repository.ColorRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.core.DatabaseClient;
import reactor.core.publisher.Flux;

import java.util.stream.Stream;

@Configuration
public class R2DBCConfiguration {
//    @Bean
//    ApplicationRunner init(ColorRepository repository, DatabaseClient client) {
//        return args -> {
//            client.execute("drop table COLOR");
//            client.execute("create table IF NOT EXISTS COLOR" +
//                    "(id SERIAL PRIMARY KEY, hex_value varchar (255) not null, rgb_color varchar (255) not null);").fetch().first().subscribe();
//            client.execute("DELETE FROM COLOR;").fetch().first().subscribe();
//
//            Stream<Color> stream = Stream.of(new Color(null, RGBEnum.RED, "1"),
//                    new Color(null, RGBEnum.GREEN, "2"),
//                    new Color(null, RGBEnum.BLUE, "3"));
//
//            repository.saveAll(Flux.fromStream(stream))
//                    .then()
//                    .subscribe();
//
//        };
//    }
}


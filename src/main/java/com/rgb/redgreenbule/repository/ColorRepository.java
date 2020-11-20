package com.rgb.redgreenbule.repository;

import com.rgb.redgreenbule.entity.Color;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ColorRepository extends ReactiveCrudRepository<Color, Long> {
}

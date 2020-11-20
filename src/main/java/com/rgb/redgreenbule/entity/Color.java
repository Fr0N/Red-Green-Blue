package com.rgb.redgreenbule.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class Color {

    @Id
    private Long id;

    private RGBEnum rgbColor;

    private String hexValue;

    public Color() {
    }

    public Color(Long id, RGBEnum rgbColor, String hexValue) {
        this.id = id;
        this.rgbColor = rgbColor;
        this.hexValue = hexValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public RGBEnum getRgbColor() {
        return rgbColor;
    }

    public void setRgbColor(RGBEnum rgbColor) {
        this.rgbColor = rgbColor;
    }
}

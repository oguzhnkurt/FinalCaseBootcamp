package com.oguzhankurt.finalcase.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto {
    private String cod;
    private LinkedList<List> list;

    @Getter
    @Setter
    private static class List{
        private WeatherDto.Main main;
        private String dt_txt;

    }
    @Getter
    @Setter
    private static class Main{
        private double temp;
        private double temp_min;
        private double temp_max;
    }
}

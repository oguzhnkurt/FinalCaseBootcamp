package com.oguzhankurt.finalcase.dto;

import com.sun.tools.javac.Main;
import lombok.*;

import java.util.LinkedList;
import java.util.List;

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

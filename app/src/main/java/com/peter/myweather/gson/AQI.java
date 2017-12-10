package com.peter.myweather.gson;

/**
 * Created by Administrator on 2017/12/10.
 */

public class AQI{
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}

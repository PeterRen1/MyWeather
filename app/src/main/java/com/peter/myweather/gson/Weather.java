package com.peter.myweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/12/10.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Update update;
    public Now now;
    public List<DailyForecast> daily_forecast;
    public List<Hourly> hourly;
    public List<Lifestyle> lifestyle;
}

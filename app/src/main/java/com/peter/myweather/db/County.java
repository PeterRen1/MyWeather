package com.peter.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/9.
 */

public class County extends DataSupport {
    private int id;
    private String countNamel;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountNamel() {
        return countNamel;
    }

    public void setCountNamel(String countNamel) {
        this.countNamel = countNamel;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

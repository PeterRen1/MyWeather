package com.peter.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/9.
 */

public class Province extends DataSupport {
    private int id;
    private int provinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(int provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}

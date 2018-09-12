package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Gawain on 2018/9/12.
 */

public class Country extends LitePalSupport {

    private int id;
    private String countryName;
    private String weather;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

}

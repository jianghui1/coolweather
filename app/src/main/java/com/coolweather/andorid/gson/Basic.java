package com.coolweather.andorid.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ys on 2017/12/22.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}

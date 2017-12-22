package com.coolweather.andorid.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ys on 2017/12/22.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}

package com.weather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Pan on 2017/8/28.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}

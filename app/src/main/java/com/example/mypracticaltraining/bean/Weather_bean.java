package com.example.mypracticaltraining.bean;

import java.util.List;

public class Weather_bean {

    /**
     * showapi_res_error :
     * showapi_res_id : e8712c385ccb44dab94509642e254626
     * showapi_res_code : 0
     * showapi_res_body : {"ret_code":0,"area":"南安","areaid":"101230506","hourList":[{"weather_code":"01","time":"201901191600","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","weather":"多云","areaid":"101230506","temperature":"21"},{"weather_code":"01","time":"201901191700","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"21"},{"weather_code":"01","time":"201901191800","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","weather":"多云","areaid":"101230506","temperature":"20"},{"weather_code":"01","time":"201901191900","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","weather":"多云","areaid":"101230506","temperature":"18"},{"weather_code":"01","time":"201901192000","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"16"},{"weather_code":"01","time":"201901192100","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"16"},{"weather_code":"01","time":"201901192200","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"15"},{"weather_code":"01","time":"201901192300","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"14"},{"weather_code":"01","time":"201901200000","area":"南安","wind_direction":"西北风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"14"},{"weather_code":"01","time":"201901200100","area":"南安","wind_direction":"西北风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"14"},{"weather_code":"01","time":"201901200200","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"13"},{"weather_code":"01","time":"201901200300","area":"南安","wind_direction":"西北风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"13"},{"weather_code":"01","time":"201901200400","area":"南安","wind_direction":"西北风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"12"},{"weather_code":"01","time":"201901200500","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"12"},{"weather_code":"01","time":"201901200600","area":"南安","wind_direction":"南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"12"},{"weather_code":"01","time":"201901200700","area":"南安","wind_direction":"南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"13"},{"weather_code":"01","time":"201901200800","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","weather":"多云","areaid":"101230506","temperature":"13"},{"weather_code":"02","time":"201901200900","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"阴","temperature":"15"},{"weather_code":"02","time":"201901201000","area":"南安","wind_direction":"东风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"阴","temperature":"16"},{"weather_code":"02","time":"201901201100","area":"南安","wind_direction":"东风","wind_power":"0-3级 微风 <5.4m/s","weather":"阴","areaid":"101230506","temperature":"18"},{"weather_code":"02","time":"201901201200","area":"南安","wind_direction":"东风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"阴","temperature":"18"},{"weather_code":"02","time":"201901201300","area":"南安","wind_direction":"东风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"阴","temperature":"18"},{"weather_code":"02","time":"201901201400","area":"南安","wind_direction":"东风","wind_power":"3-4级 微风 5.5~7.9m/s","weather":"阴","areaid":"101230506","temperature":"18"},{"weather_code":"02","time":"201901201500","area":"南安","wind_direction":"东风","wind_power":"3-4级 微风 5.5~7.9m/s","areaid":"101230506","weather":"阴","temperature":"17"}]}
     */

    private String showapi_res_error;
    private String showapi_res_id;
    private int showapi_res_code;
    private ShowapiResBodyBean showapi_res_body;

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public String getShowapi_res_id() {
        return showapi_res_id;
    }

    public void setShowapi_res_id(String showapi_res_id) {
        this.showapi_res_id = showapi_res_id;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * ret_code : 0
         * area : 南安
         * areaid : 101230506
         * hourList : [{"weather_code":"01","time":"201901191600","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","weather":"多云","areaid":"101230506","temperature":"21"},{"weather_code":"01","time":"201901191700","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"21"},{"weather_code":"01","time":"201901191800","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","weather":"多云","areaid":"101230506","temperature":"20"},{"weather_code":"01","time":"201901191900","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","weather":"多云","areaid":"101230506","temperature":"18"},{"weather_code":"01","time":"201901192000","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"16"},{"weather_code":"01","time":"201901192100","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"16"},{"weather_code":"01","time":"201901192200","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"15"},{"weather_code":"01","time":"201901192300","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"14"},{"weather_code":"01","time":"201901200000","area":"南安","wind_direction":"西北风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"14"},{"weather_code":"01","time":"201901200100","area":"南安","wind_direction":"西北风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"14"},{"weather_code":"01","time":"201901200200","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"13"},{"weather_code":"01","time":"201901200300","area":"南安","wind_direction":"西北风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"13"},{"weather_code":"01","time":"201901200400","area":"南安","wind_direction":"西北风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"12"},{"weather_code":"01","time":"201901200500","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"12"},{"weather_code":"01","time":"201901200600","area":"南安","wind_direction":"南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"12"},{"weather_code":"01","time":"201901200700","area":"南安","wind_direction":"南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"多云","temperature":"13"},{"weather_code":"01","time":"201901200800","area":"南安","wind_direction":"西风","wind_power":"0-3级 微风 <5.4m/s","weather":"多云","areaid":"101230506","temperature":"13"},{"weather_code":"02","time":"201901200900","area":"南安","wind_direction":"东南风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"阴","temperature":"15"},{"weather_code":"02","time":"201901201000","area":"南安","wind_direction":"东风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"阴","temperature":"16"},{"weather_code":"02","time":"201901201100","area":"南安","wind_direction":"东风","wind_power":"0-3级 微风 <5.4m/s","weather":"阴","areaid":"101230506","temperature":"18"},{"weather_code":"02","time":"201901201200","area":"南安","wind_direction":"东风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"阴","temperature":"18"},{"weather_code":"02","time":"201901201300","area":"南安","wind_direction":"东风","wind_power":"0-3级 微风 <5.4m/s","areaid":"101230506","weather":"阴","temperature":"18"},{"weather_code":"02","time":"201901201400","area":"南安","wind_direction":"东风","wind_power":"3-4级 微风 5.5~7.9m/s","weather":"阴","areaid":"101230506","temperature":"18"},{"weather_code":"02","time":"201901201500","area":"南安","wind_direction":"东风","wind_power":"3-4级 微风 5.5~7.9m/s","areaid":"101230506","weather":"阴","temperature":"17"}]
         */

        private int ret_code;
        private String area;
        private String areaid;
        private List<HourListBean> hourList;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAreaid() {
            return areaid;
        }

        public void setAreaid(String areaid) {
            this.areaid = areaid;
        }

        public List<HourListBean> getHourList() {
            return hourList;
        }

        public void setHourList(List<HourListBean> hourList) {
            this.hourList = hourList;
        }

        public static class HourListBean {
            /**
             * weather_code : 01
             * time : 201901191600
             * area : 南安
             * wind_direction : 东南风
             * wind_power : 0-3级 微风 <5.4m/s
             * weather : 多云
             * areaid : 101230506
             * temperature : 21
             */

            private String weather_code;
            private String time;
            private String area;
            private String wind_direction;
            private String wind_power;
            private String weather;
            private String areaid;
            private String temperature;

            public String getWeather_code() {
                return weather_code;
            }

            public void setWeather_code(String weather_code) {
                this.weather_code = weather_code;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_power() {
                return wind_power;
            }

            public void setWind_power(String wind_power) {
                this.wind_power = wind_power;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getAreaid() {
                return areaid;
            }

            public void setAreaid(String areaid) {
                this.areaid = areaid;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }
        }
    }
}

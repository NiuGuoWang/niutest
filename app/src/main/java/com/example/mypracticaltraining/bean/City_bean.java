package com.example.mypracticaltraining.bean;

import java.util.List;

public class City_bean {

    /**
     * showapi_res_error :
     * showapi_res_id : 33994ccd62af44c2bf00e464630a3ac1
     * showapi_res_code : 0
     * showapi_res_body : {"ret_code":0,"list":[{"prov":"云南","area":"丽江","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"丽江","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291401","c2":"lijiang","c11":"0888","longitude":100.222,"c10":"2","latitude":26.903,"c12":"674100","c15":"2394"},"distric":"丽江","areaid":"101291401"},{"prov":"云南","area":"永胜","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"永胜","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291402","c2":"yongsheng","c11":"0888","longitude":100.785,"c10":"3","latitude":26.533,"c12":"674200","c15":"2131"},"distric":"丽江","areaid":"101291402"},{"prov":"云南","area":"华坪","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"华坪","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291403","c2":"huaping","longitude":101.249,"c11":"0888","latitude":26.656,"c10":"3","c12":"617300","c15":"1242"},"distric":"丽江","areaid":"101291403"},{"prov":"云南","area":"宁蒗","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"宁蒗","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291404","c2":"ninglang","longitude":100.51,"c11":"0888","latitude":27.18,"c10":"3","c12":"674300","c15":"2242"},"distric":"丽江","areaid":"101291404"},{"prov":"云南","area":"古城","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"古城","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291405","c2":"gucheng","longitude":100.224,"c11":"0888","c10":"3","latitude":26.88,"c12":"674300","c15":"2423"},"distric":"丽江","areaid":"101291405"},{"prov":"云南","area":"玉龙","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"玉龙","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291406","c2":"yulong","longitude":100.205,"c11":"0888","c10":"3","latitude":26.987,"c12":"674300","c15":"2672"},"distric":"丽江","areaid":"101291406"}]}
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
         * list : [{"prov":"云南","area":"丽江","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"丽江","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291401","c2":"lijiang","c11":"0888","longitude":100.222,"c10":"2","latitude":26.903,"c12":"674100","c15":"2394"},"distric":"丽江","areaid":"101291401"},{"prov":"云南","area":"永胜","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"永胜","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291402","c2":"yongsheng","c11":"0888","longitude":100.785,"c10":"3","latitude":26.533,"c12":"674200","c15":"2131"},"distric":"丽江","areaid":"101291402"},{"prov":"云南","area":"华坪","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"华坪","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291403","c2":"huaping","longitude":101.249,"c11":"0888","latitude":26.656,"c10":"3","c12":"617300","c15":"1242"},"distric":"丽江","areaid":"101291403"},{"prov":"云南","area":"宁蒗","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"宁蒗","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291404","c2":"ninglang","longitude":100.51,"c11":"0888","latitude":27.18,"c10":"3","c12":"674300","c15":"2242"},"distric":"丽江","areaid":"101291404"},{"prov":"云南","area":"古城","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"古城","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291405","c2":"gucheng","longitude":100.224,"c11":"0888","c10":"3","latitude":26.88,"c12":"674300","c15":"2423"},"distric":"丽江","areaid":"101291405"},{"prov":"云南","area":"玉龙","cityInfo":{"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"玉龙","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291406","c2":"yulong","longitude":100.205,"c11":"0888","c10":"3","latitude":26.987,"c12":"674300","c15":"2672"},"distric":"丽江","areaid":"101291406"}]
         */

        private int ret_code;
        private List<ListBean> list;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * prov : 云南
             * area : 丽江
             * cityInfo : {"c6":"yunnan","c5":"丽江","c4":"lijiang","c3":"丽江","c9":"中国","c8":"china","c7":"云南","c17":"+8","c16":"AZ9888","c1":"101291401","c2":"lijiang","c11":"0888","longitude":100.222,"c10":"2","latitude":26.903,"c12":"674100","c15":"2394"}
             * distric : 丽江
             * areaid : 101291401
             */

            private String prov;
            private String area;
            private CityInfoBean cityInfo;
            private String distric;
            private String areaid;

            public String getProv() {
                return prov;
            }

            public void setProv(String prov) {
                this.prov = prov;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public CityInfoBean getCityInfo() {
                return cityInfo;
            }

            public void setCityInfo(CityInfoBean cityInfo) {
                this.cityInfo = cityInfo;
            }

            public String getDistric() {
                return distric;
            }

            public void setDistric(String distric) {
                this.distric = distric;
            }

            public String getAreaid() {
                return areaid;
            }

            public void setAreaid(String areaid) {
                this.areaid = areaid;
            }

            public static class CityInfoBean {
                /**
                 * c6 : yunnan
                 * c5 : 丽江
                 * c4 : lijiang
                 * c3 : 丽江
                 * c9 : 中国
                 * c8 : china
                 * c7 : 云南
                 * c17 : +8
                 * c16 : AZ9888
                 * c1 : 101291401
                 * c2 : lijiang
                 * c11 : 0888
                 * longitude : 100.222
                 * c10 : 2
                 * latitude : 26.903
                 * c12 : 674100
                 * c15 : 2394
                 */

                private String c6;
                private String c5;
                private String c4;
                private String c3;
                private String c9;
                private String c8;
                private String c7;
                private String c17;
                private String c16;
                private String c1;
                private String c2;
                private String c11;
                private double longitude;
                private String c10;
                private double latitude;
                private String c12;
                private String c15;

                public String getC6() {
                    return c6;
                }

                public void setC6(String c6) {
                    this.c6 = c6;
                }

                public String getC5() {
                    return c5;
                }

                public void setC5(String c5) {
                    this.c5 = c5;
                }

                public String getC4() {
                    return c4;
                }

                public void setC4(String c4) {
                    this.c4 = c4;
                }

                public String getC3() {
                    return c3;
                }

                public void setC3(String c3) {
                    this.c3 = c3;
                }

                public String getC9() {
                    return c9;
                }

                public void setC9(String c9) {
                    this.c9 = c9;
                }

                public String getC8() {
                    return c8;
                }

                public void setC8(String c8) {
                    this.c8 = c8;
                }

                public String getC7() {
                    return c7;
                }

                public void setC7(String c7) {
                    this.c7 = c7;
                }

                public String getC17() {
                    return c17;
                }

                public void setC17(String c17) {
                    this.c17 = c17;
                }

                public String getC16() {
                    return c16;
                }

                public void setC16(String c16) {
                    this.c16 = c16;
                }

                public String getC1() {
                    return c1;
                }

                public void setC1(String c1) {
                    this.c1 = c1;
                }

                public String getC2() {
                    return c2;
                }

                public void setC2(String c2) {
                    this.c2 = c2;
                }

                public String getC11() {
                    return c11;
                }

                public void setC11(String c11) {
                    this.c11 = c11;
                }

                public double getLongitude() {
                    return longitude;
                }

                public void setLongitude(double longitude) {
                    this.longitude = longitude;
                }

                public String getC10() {
                    return c10;
                }

                public void setC10(String c10) {
                    this.c10 = c10;
                }

                public double getLatitude() {
                    return latitude;
                }

                public void setLatitude(double latitude) {
                    this.latitude = latitude;
                }

                public String getC12() {
                    return c12;
                }

                public void setC12(String c12) {
                    this.c12 = c12;
                }

                public String getC15() {
                    return c15;
                }

                public void setC15(String c15) {
                    this.c15 = c15;
                }
            }
        }
    }
}

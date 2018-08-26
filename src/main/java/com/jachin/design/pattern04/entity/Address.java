package com.jachin.design.pattern04.entity;

public class Address {
    private String sheng;
    private String shi;
    private String jie;

    public Address(String sheng, String shi, String jie) {
        this.sheng = sheng;
        this.shi = shi;
        this.jie = jie;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie;
    }

}

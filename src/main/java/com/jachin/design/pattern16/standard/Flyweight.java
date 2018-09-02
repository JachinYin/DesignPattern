package com.jachin.design.pattern16.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/2 19:57
 */
public class Flyweight implements IFlyweight{

    private String university;
    private String province;
    private String address;

    public Flyweight(String university, String province, String address) {
        this.university = university;
        this.province = province;
        this.address = address;
    }

    @Override
    public String getUniversity() {
        return university;
    }

    @Override
    public String getProvince() {
        return province;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Flyweight{" +
                "university='" + university + '\'' +
                ", province='" + province + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

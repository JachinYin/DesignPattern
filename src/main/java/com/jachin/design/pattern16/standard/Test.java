package com.jachin.design.pattern16.standard;

/**
 * @des: 测试类
 * @author: Jachin
 * @date: 2018/9/2 19:55
 */
public class Test {
    public static void main(String[] args) {
        FlyweightFactory fact = FlyweightFactory.getInstance();
        IFlyweight flyweight = new Flyweight("广东财经大学", "广东省", "广州市");
        IFlyweight flyweight2 = new Flyweight("广东工业大学", "广东省", "广州市");
        fact.addFlyweight("1",flyweight);
        fact.addFlyweight("2",flyweight2);
        StudentInfo stu1 = new StudentInfo(1, "张三", 19, fact.getIFlyweight("1"));
        StudentInfo stu2 = new StudentInfo(2, "李四", 18, fact.getIFlyweight("2"));
        System.out.println(stu1);
        System.out.println(stu2);

    }
}

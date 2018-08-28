package com.jachin.design.pattern05.reflect;

import com.jachin.design.pattern05.reflect.handler.Handler;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @des: 组合功能节点，并传递初始请求
 * 读取配置文件中的节点链，再通过反射技术，组合功能节点
 * @author: Jachin
 * @date: 2018/8/27 15:48
 */
public class Chain {
    // 创建数组，存放配置文件中描述的节点
    private List<Handler> list = new ArrayList<>();
    // 创建节点链
    public void createChain(){
        // 获取配置文件路径 path
        String path = this.getClass().getResource("/").getPath();
        path = path + "com/jachin/design/pattern05/reflect/";

        try {
            // 文件流形式获取配置文件中的信息
            FileInputStream in = new FileInputStream(path + "config.properties");
            Properties pro = new Properties();
            pro.load(in);
            String chain = pro.getProperty("chain");
            // 分隔 chain 中的节点，得到每一个节点名称
            String[] handlers = chain.split(",");

            // 通过反射获取各个节点实例对象，并加入数组中
            for (String handler : handlers){
                list.add((Handler)
                        Class.forName("com.jachin.design.pattern05.reflect.handler."
                                + handler).newInstance());
            }

            // 构建节点链
            for(int i = 0; i < list.size()-1; i++){
                list.get(i).setNext(list.get(i+1));
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 传递初始请求
    public Request handle(Request req){
        return list.get(0).handle(req);
    }
}

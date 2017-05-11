package com.sping.boot;

import com.sping.boot.bean.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/5/11.
 */
public class ApplicationContent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DiConfig.class);
        DemoService demoService = ac.getBean(DemoService.class);
        String tip = demoService.demo();
        System.out.println(tip);
    }

}

package com.vaibhav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Run {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");


        Database db=applicationContext.getBean("database",Database.class);
        //Q2.

        System.out.println(db.getPort());
        System.out.println(db.getName());

//        Restaurant rt=applicationContext.getBean(Restaurant.class);
//        rt.getHotDrink().prepareHotDrink();
//
//        Restaurant innerBean=applicationContext.getBean("expressRestaurant",Restaurant.class);
//        innerBean.getHotDrink().prepareHotDrink();
//
//        Complex li=applicationContext.getBean(Complex.class);
//        System.out.println(li.list);
//        System.out.println(li.map);
//        System.out.println(li.set);
//
//        Restaurant rt1=applicationContext.getBean("restaurant",Restaurant.class);
//        rt1.hotDrink.prepareHotDrink();

//         Restaurant rt2=applicationContext.getBean(Restaurant.class);  //Q7.
//         applicationContext.isPrototype("restaurant");
    }
}

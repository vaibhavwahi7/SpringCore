package com.vaibhav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;


@Repository    //Q10.
public class Restaurant {

//    Q3.
//    Create a class Restaurant.
//    Create an interface HotDrink with an abstract method prepareHotDrink.
//    Create two classes Tea and ExpressTea which implements HotDrink Class.
//    Create an instance variable of type HotDrink in Restaurant class.
//    Configure Tea and ExpressTea classes beans in Spring XML.
//    create a bean with the name teaRestaurant of type Restaurant which inject
//    tea restaurant using setter method.


    public HotDrink getHotDrink() {
        System.out.println("Prepared hot drink");
        return hotDrink;
    }

    //@Required   //Q8.
    //  @Autowired  //Q9.
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Autowired
    void Restaurant() {
        HotDrink hotDrink;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }

    // @Autowired
    HotDrink hotDrink;

}

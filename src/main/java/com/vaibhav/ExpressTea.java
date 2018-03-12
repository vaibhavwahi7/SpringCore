package com.vaibhav;


import org.springframework.stereotype.Service;

@Service
public class ExpressTea implements HotDrink
{

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepare Express Tea");
    }
}

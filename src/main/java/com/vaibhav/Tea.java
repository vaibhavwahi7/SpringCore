package com.vaibhav;

import com.vaibhav.HotDrink;
import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Prepare tea");
    }
}

package com.vaibhav;


import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
public class Complex
{
    @Override
    public String toString() {
        return "Complex{" +
                "list=" + list +
                ", map=" + map +
                ", set=" + set +
                '}';
    }

    List list;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    Map map;
    Set set;





    public void setList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Set getSet() {
        return set;
    }
}

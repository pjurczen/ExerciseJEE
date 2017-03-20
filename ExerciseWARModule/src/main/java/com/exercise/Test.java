package com.exercise;

import javax.faces.bean.ManagedBean;

@ManagedBean(eager = true)
public class Test {

    public String getText() {
        return "Hello Greg!";
    }
}

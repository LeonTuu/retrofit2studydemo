package com.mieasy.retrofit2studydemo.module;

import javax.inject.Inject;

public class Baozi {

    String name;

    @Inject
    public Baozi() {
        name = "小笼包";
    }

    public Baozi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
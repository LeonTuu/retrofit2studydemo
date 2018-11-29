package com.mieasy.retrofit2studydemo.module;

import javax.inject.Inject;

public class Niting {
    @Inject
    Baozi baoZi;
    @Inject
    Noodle noodle;
    @Inject
    public  Niting(){

    }

    public String eat(){
            StringBuilder sb = new StringBuilder();
            sb.append("吃吃吃");
            if (baoZi !=null){
                sb.append("吃包子"+ baoZi.toString());

            }
        if (noodle != null) {
            sb.append("  ");
            sb.append(noodle.toString());
        }
        return sb.toString();
    }
}

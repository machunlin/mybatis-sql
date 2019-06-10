package com.vipmro.vipmro_sql;

import java.util.Random;

/**
 * RandomNum
 *
 * @author wmt
 * @date 2018/1/18
 * @since JDK1.8
 */
public class RandomNum {


    public static String create(){
        long rangeLong = new Random().nextLong();
        return rangeLong+"L";
    }

    public static void main(String[] args) {
        System.out.println(create());
    }
}

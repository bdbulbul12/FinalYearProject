package com.programmerhuntbd.bulbul.temparature;

/**
 * Created by bulbul on 7/17/2018.
 */

public class Converter {

    public static double celcious2farenhite(double f){

        return (f-32)*5/9;
    }

    public static double farenhite2celcious(double c){
        return 32+c*9/5;
    }
}

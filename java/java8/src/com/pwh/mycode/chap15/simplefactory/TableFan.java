package com.pwh.mycode.chap15.simplefactory;

/**
 * @author coderpwh
 * @create 2020-03-25 11:06
 * @desc ${DESCRIPTION}
 **/
public class TableFan implements IFan {
    @Override
    public void swithOn() {
        System.out.println("The TableFan is swithed on ...");
    }

    @Override
    public void witchOff() {
        System.out.println("The TableFan is swithed off ...");
    }
}

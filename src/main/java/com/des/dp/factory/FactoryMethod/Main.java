package com.des.dp.factory.FactoryMethod;

/**
 * @program: Tank
 * @description:
 * @author: Des
 * @create: 2020-06-09 00:22
 **/
public class Main {
    public static void main(String[] args) {
        Moveable m = new Car();
        m.go();
    }
}

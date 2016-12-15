package com.example;

import java.util.ArrayList;

/**
 * Created by Ishan on 12/15/2016.
 */

public class Arrays {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();

        names.add("Carl");
        names.add("Jimmy Neutron");

        System.out.println(names.get(0));
        names.remove("Carl");

        System.out.println(names.get(0));

    }
}

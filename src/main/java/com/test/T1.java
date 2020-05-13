package com.test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author zxfuc
 * @Title:
 * @Package
 * @Description:
 * @date 2020/5/820:35
 */
public class T1 {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("a", "aaa");
        table.put("b", "aaa");
        table.put("c", "aaa");

        System.out.println(table);

        HashMap map = new HashMap();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "aaa");

        System.out.println(map);

    }
}

package mapper;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

public class T {
    @Test
    public void t1() throws IOException {
        int b = 1;
        int d = 1;
        Integer a1 = new Integer(41);
        Integer a2 = new Integer(41);
        System.out.println(a1 != a2);

        int a = 0;
        int c = 0;
        do {
            --c;
            a = a - 1;
        } while (a > 0);
        System.out.println(c);
        long l = 88888;
    }

    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch语句块");
        } finally {
            System.out.println(" fnally语句块");
            return 0;

        }
    }

    @Test
    public void t2() {

        T t = new T();
        System.out.println(t.add(9, 34));
    }

    @Test
    public void t4() {
        int int1 = 23;
        int int2 = 23;
        Integer integer1 = new Integer(23);
        Integer integer2 = new Integer(23);

        Integer a1 = 127;
        Integer a2 = 127;
        Integer integer3 = new Integer(127);


        Integer b1 = 125;
        Integer b2 = 125;
        System.out.println(int1 == integer1);
        System.out.println(integer2 == integer1);

        System.out.println(a1 == integer3);

        System.out.println(a1 == a2);

        System.out.println(b1 == b2);
    }

    @Test
    public void t5() {
        int a = 1;
        int b = 1;

        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        arrayList.add(b);
        int temp = 2;
        for (int i = 1; i < 100; i++) {
            
            arrayList.add(temp);

        }

    }
    @Test
    public void t7(){

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("str");

        HashSet hashSet = new HashSet();


    }
}
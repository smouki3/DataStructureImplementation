package testing.arraylist;

import java.io.File;

import org.junit.Test;

import zhivko.implementation.arraylist.ArrayListImplementation;

public class TestArrayList
{

    @Test
    public void test()
    {
//        ArrayListImplementation arr = new ArrayListImplementation();
//        arr.add("Hi");
//        arr.add("Hi");
//        arr.add("Hi");
//        arr.add("Hi");
//        arr.add("Hi");
//        arr.add("Hi");
//        arr.add("Hi");
//        arr.add("Hi");     
//        arr.addToIndex(16, "Hello");
     //   System.out.println(arr.toString());
//        System.out.println(arr.size());
//        ArrayListImplementation arr2 = new ArrayListImplementation();
//        arr2.add(2);
//        arr2.add(3);
//        arr2.add(4);
//        arr2.add(1);
//        arr2.add(2);
//        arr2.add(8);
//        System.out.println(arr2.toString());
        ArrayListImplementation arr3 = new ArrayListImplementation();
        arr3.add(new File("1"));
        arr3.add(new File("2"));
        arr3.add(new File("3"));
        arr3.add(new File("4"));
        arr3.add(new File("5"));
        arr3.add(new File("6"));
        arr3.remoove(2);
        arr3.add(2,9);
        System.out.println(arr3.toString());
        System.out.println(arr3.size());
    }

}

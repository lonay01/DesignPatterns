package org.example;

public class Main {
    public static void main(String[] args) {
        DynamicIntegerArray dynamicIntegerArray = new DynamicIntegerArray(5);


        {
            int x = 23;
            {
                String s = "sdsdsd";

            }
        }

        for (int i = 0; i < 10; i++) {
            dynamicIntegerArray.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(dynamicIntegerArray.getEl(i));
        }
    }
}
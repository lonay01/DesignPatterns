package org.example;

public class DynamicIntegerArray {
    private int currentLength;
    private int maxLength;
    private int[] array;

    public DynamicIntegerArray(int length) {
        maxLength = length;
        array = new int[length];
    }

    public void add(int var) {
        if (currentLength < maxLength) {

            array[currentLength] = var;
            currentLength++;
        }
        else {
            int[] buff = new int[maxLength*2];

            for (int i = 0; i < maxLength; i++) {
                buff[i] = array[i];
            }

            maxLength = maxLength * 2;
            array = buff;
            array[currentLength] = var;
            currentLength++;
        }
    }

    public int getEl(int i) {
        return array[i];
    }
}

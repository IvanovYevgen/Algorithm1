package com.company;

public class Main {

    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 10;
        int j;
        long searchKey = 66;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;

        for (j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println(" ");

        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
        if (j == nElems)
            System.out.println("Can`t find this bullshit!");
        else
            System.out.println("This bullshit=" + searchKey);

        searchKey = 55;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
        for (int k = j; k < nElems - 1; k++)
            arr[k] = arr[k + 1];
        nElems--;

        for (j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println(" ");
    }
}


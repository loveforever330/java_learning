package Ac_Wing_demo;

import static java.util.Collections.swap;

public class Arrey_Max {

    //打乱数组的顺序
    public void shuffle(int[] arrey, int length) {

        for(int i=0;i<length;i++){
            int iRandNum = (int)(Math.random() * length);
            int temp = arrey[iRandNum];
            arrey[iRandNum] = arrey[i];
            arrey[i] = temp;
        }
    }

    public void initArrey(int [] arrey,int length){
        for (int i=0;i<length;i++){
            arrey[i]=i;
        }
    }

    public void quick_sort(int[] arrey,int l,int r){
        if(l>=r) return;
        int i=l-1,j=r+1,x=arrey[(l+r)>>1];
        while (i<j){
            do i++ ;while(arrey[i]<x);
            do j-- ;while(arrey[j]>x);
            if (i<j) {          //由于它j--的时候可能值会是-1
                int temp=arrey[i];
                arrey[i]=arrey[j];
                arrey[j]=temp;
            }
        }
        quick_sort(arrey,l,j);
        quick_sort(arrey,j+1,r);
    }

    public void showArrey(int [] arrey,int length){
        for (int i=0;i<length;i++){
            System.out.println(arrey[i]);
        }
    }
}

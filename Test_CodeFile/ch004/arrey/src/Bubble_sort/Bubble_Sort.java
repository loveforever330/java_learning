package Bubble_sort;

import Ac_Wing_demo.Arrey_Max;

public class Bubble_Sort {
    public static void main(String[] args) {
        int []a={5,2,6,2,1,3,2};
        int []b=new int[10];
        Bubble_Sort bubble_sort=new Bubble_Sort();
        System.arraycopy(a,0,b,0,3);
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println("第"+i+"个 拷贝数"+b[i]);

        }
    }



}

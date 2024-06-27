package Arrey_test;

import java.util.Scanner;


public class Arrey_test {
    public void init_arrey_2d(int [][] b,int l){
        for (int i = 0; i < l; i++) {
            for(int j=0;j<b[i].length;j++){
                b[i][j]=j;
            }
        }
    }
    public void show_arrey_2d(int [][] a,int l,int r){
        for (int i = 0; i < l; i++) {
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int r=s.nextInt();
        Arrey_test arrey_test=new Arrey_test();
        int [][] arrey_2d=new int [l][r];

        arrey_test.init_arrey_2d(arrey_2d,l);
        arrey_2d[1][3]=520;
        arrey_test.show_arrey_2d(arrey_2d,l,r);


    }
}

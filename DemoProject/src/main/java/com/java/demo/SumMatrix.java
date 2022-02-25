package com.java.demo;
import java.util.Scanner;
public class SumMatrix {
public static void main(String args[]) {
 int i,j;
 int [][] a =new int[3][3];
 int [][] b=new int [3][3];
 int [][] c=new int [3][3];
 System.out.println("Enter the 9 element in first matrix:");
 Scanner sc=new Scanner(System.in);
 for(i=0;i<3;i++) {
	 for(j=0;j<3;j++) {
		 a[i][j]=sc.nextInt();
	 }
 }
 System.out.println("Enter the 9 elemnet in second matrix:");
 for(i=0;i<3;i++) {
	 for(j=0;j<3;j++) {
		 b[i][j]=sc.nextInt();
	 }
 }
 for(i=0;i<3;i++) {
	 for(j=0;j<3;j++) {
		 c[i][j]=a[i][j]+b[i][j];
	 }
 }
 System.out.println("\n Addition result of matrix:");
 for(i=0;i<3;i++) {
	 for(j=0;j<3;j++) {
		 System.out.print(c[i][j]+" ");
	 }
	 System.out.println("]\n[");
 }
}
}

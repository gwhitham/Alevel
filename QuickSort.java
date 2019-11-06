/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author gera0276
 */
public class QuickSort {
    
   int [] myarray;
   int wallPos = 0;
   int pivot = 0;
    
   public void printArray(int[] arr){
       for(int i =0; i<arr.length;i++){
           if(i==arr.length-1){
              System.out.print(arr[i]);
              System.out.println();
           }
           else{
           System.out.print(arr[i]+",");
           }
       }
   }
   
    public QuickSort(int [] arr){
        //myarray = arr;
        pivot = arr[arr.length-1];
        printArray(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<pivot){
                int temp = arr[i];
                arr[i]=arr[wallPos];
                arr[wallPos] =temp;
                wallPos++;
            }
        }
        arr[arr.length-1]= arr[wallPos];
        arr[wallPos] = pivot;
        printArray(arr);
}
    
}

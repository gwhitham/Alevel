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
public class Queue {
    int max;
    int [] queue1;
    int fPointer;
    int bPointer;
    
    //Create a constructor
    public Queue(int length){
        queue1 = new int[length];
        max = length;
        fPointer=0;
        bPointer=0;
        
    }
    public void printQueue(){
        for(int i=0; i<max; i++){
            System.out.print(queue1[i]);
        }
        System.out.println("");
    }
    
    public int Pop(){
        if(fPointer>bPointer || bPointer==0){
            return 0;
        }
        else{
            int temp = queue1[fPointer];
            queue1[fPointer]=0;
            fPointer++;
            return temp;
        }
        
    }
    
    public void Push(int item){
        if(bPointer==max){
            System.out.print("The queue is full");
        }
        else{
            queue1[bPointer]=item;
            bPointer++;
        }
        
    }
    
}

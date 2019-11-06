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
public class Stacks {
    int max;
    int [] stack1;
    int pointer;
    
    //Create a constructor
    public Stacks(int length){
        stack1 = new int[length];
        max = length;
        pointer=0;
        
    }
    
    public void printStack(){
        for(int i=0; i<max; i++){
            System.out.println(stack1[i]);
        }
    }
    
    public void push(int value){
        if(pointer<max){
            stack1[pointer]=value;
            pointer++;
        }
        else{
            System.out.println("Stack overflow");
        }
    }
    
}

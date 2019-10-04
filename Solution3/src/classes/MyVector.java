/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author user
 */
public class MyVector {
        private int length;
    int[] elements;

    public MyVector() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }
    
    
    
    public void maxSum (int[] elements){
    int start_index = -1;
    int end_index = -1;
    int max_sum = -10000000;
    int length=elements.length;
    int i;
    for (i=0;i<= length-1;i++ ){
        int sum =0;
        int j;
        for(j=i;j<=length-1;j++){
            sum = sum + elements[j];
            if(sum>max_sum){
                start_index=i;
                end_index =j;
                max_sum=sum;
            }
            
        }
    System.out.print(elements[i]+",");   
    }
    
    
    System.out.println("Start index is " + start_index + " ,end index is " +end_index +" and the sum "+ max_sum);
}
    
    
    
    
}
    


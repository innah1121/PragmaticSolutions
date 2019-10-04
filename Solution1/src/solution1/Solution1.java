/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author user
 */
public class Solution1 {

      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
       String haystack;
       String needle;
       int threshold;
       int i;
       int j;
       int length_of_haystack;
       int length_of_needle;
       int haystack_offset;
       int needle_offset;
       System.out.println("Julutem jepni needle");
       needle = s.next();
        
       String sekuenca_string = "";
     //  needle="lbcabcdmmmmrtfyu";
       char[] chars_n = needle.toCharArray();
       System.out.println(Arrays.toString(chars_n));
	
       System.out.println("Julutem jepni haystack");
       haystack=s.next();
       
       char[] chars_h = haystack.toCharArray();
       System.out.println(Arrays.toString(chars_h));
       //char[] sekuenca;
       Vector<Character>sekuenca= new Vector<Character>();
      
       threshold=3;
       int k=0;
       for(i=0; i<= needle.length()-(threshold-1);i++){
           needle_offset=i;
           for(j=0 ;j<=haystack.length()-threshold;j++ ){
               haystack_offset=j;
               sekuenca.clear();
               if((chars_n[i] == chars_h[j])){
                   sekuenca.addElement(chars_n[i]);
                   k=1;
                   while(chars_n[i+k]==chars_h[j+k]){
                       sekuenca.addElement(chars_n[i+k]);
                       
                       k=k+1;
                       if(((i+k)>needle.length()-1)|| ((j+k)>haystack.length()-1)) {
                        break;
                       }
                       
                   }
                   sekuenca_string = sekuenca.toString();
                   //sekuenca_string = String.valueOf(sekuenca);
                   if(sekuenca.size() >= threshold){
                       System.out.println("Sequence of length"+ sekuenca_string + " found at haystack offset " +haystack_offset+ " , needle offset "+needle_offset);
                   }
               }
           }
           
       }
       
    }
    
}
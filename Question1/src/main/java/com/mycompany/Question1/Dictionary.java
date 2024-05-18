/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Student
 */
import java.util.*;
import java.nio.charset.Charset;
public class Dictionary {

    public Dictionary() {
    }
    static Scanner sc = new Scanner(System.in);
    TreeMap<String,String> dic = new TreeMap<>();
    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        dic.input();
        System.out.print("Enter words: ");
        String word = sc.next();
        if(dic.Check(word)) 
        {System.out.println("Word exists.");
        } else {
            System.out.println("Word not exist.");
        }
        dic.findMeaning(word);
    }
   
    public void input(){
      dic.put("one","1");
      dic.put("two","2");
      dic.put("three","3");
      dic.put("four","4");
      dic.put("five","5");  
      dic.put("six","6");
      dic.put("seven","7"); 
      dic.put("eight","8");
      dic.put("nine","9"); 
      dic.put("ten","10");
    }
    
         public boolean Check(String word) {
        if (dic.containsKey(word)) {
            return true;
        }
        return false;
    }

    public void findMeaning(String word) {
        if (Check(word)) {
            System.out.println("Meaning: " + dic.get(word));
        }
    }

}

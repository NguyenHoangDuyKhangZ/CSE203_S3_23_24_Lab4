/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;
enum BankType{
VietcomBank,
TPBank;}
/**
 *
 * @author Student
 */
public class BankFactory {
    public static Bank getBankName(BankType type){
       switch(type) {
        case VietcomBank:
               return new VietcomBank();
        case TPBank:
               return new TPBank();
       }
    return null;
    }
}

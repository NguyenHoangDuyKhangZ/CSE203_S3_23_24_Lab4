/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank name: ");
        String bankName = sc.next();
        BankType type;
        if(bankName.equalsIgnoreCase("VietcomBank")){
            type = BankType.VietcomBank;
        } else if (bankName.equalsIgnoreCase("TPBank")){
            type = BankType.TPBank;
        } else {
            System.out.println("Wrong input.");
            return;
        }
        Bank bank = BankFactory.getBankName(type);
        System.out.println("Bank: "+bank.getBankName());
    }
}

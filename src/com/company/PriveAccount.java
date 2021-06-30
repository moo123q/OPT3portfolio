package com.company;

import java.util.Scanner;

public class PriveAccount extends AccountGenerator{
    Scanner scanner = new Scanner(System.in);
    private int BsnNummer;


    @Override
    public void generateAccountNumber() {
        System.out.println("Private Account Number generated");
    }

    @Override
    public void getBsnNummer(){
        System.out.println("wat is uw BSN nummer?");
        BsnNummer = scanner.nextInt();
    }

    @Override
    void getKvkNummer() {

    }
}

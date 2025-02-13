package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        
        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner input = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String nomeInvitato = input.nextLine();

        input.close();

        boolean guestFound = false;
        int index = 0;

        while (!guestFound && index < invitati.length) {
            if (invitati[index].toLowerCase().strip().equals(nomeInvitato.toLowerCase().strip())) {
                guestFound = true;
            } else {
                index++;
            }
        }

        if (guestFound) {
            System.out.println("Benvenuto nel mondo dei balocchi!");
        } else {
            System.out.println("Non sei stato invitato");
        }
        
        
        
        
        
        
        
        
        
        
        
        /*  

         for (int i = 0; i < invitati.length; i++) {
            if (nomeInvitato.toLowerCase().strip().equals(invitati[i].toLowerCase().strip())) {
                guestFound = true;
                break;
            } 
        }
                
            if (guestFound) {
                System.out.println("Benvenuto nel mondo dei balocchi!");
            } else {
                System.out.println("Non sei stato invitato");
            } */

        
    }
}

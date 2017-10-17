package com.company;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        //déclaration des variables nécéssaires pour le scanner
        Scanner scanner;
        File myFile;
        scanner = new Scanner(System.in);
        System.out.println("Entrez du text :");
        System.out.println("Pour cesser, entrez le mot 'quit'");
        while (exec(scanner));
    }
    static boolean exec(Scanner scanner){       // méthode qui crée le fichier destination + écriture dedans
        boolean bool = true;
        String monText = scanner.nextLine();
        if (monText != null && monText.compareTo("quit") == 0){
            bool = false; //bool pour démarrer la boucle
        }else {
            try {

                FileWriter fichierEcriture = new FileWriter("./dest.txt",true);
                try {
                    fichierEcriture.write(monText+System.getProperty(File.separator)); //J'ai pas compris le fonctionnement pour faire des /n
                } finally {
                    fichierEcriture.close();             //
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bool;
    }
}
package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;                                        //initialisation des variables pour le scanner
        String scann;
        File fileToScan;

        scanner = new Scanner(System.in);
        System.out.println("Donnez un chemin :");
        scann = scanner.nextLine();
        fileToScan = new File(scann);

        if (fileToScan.exists() == true) {                      //vérification de l'existance du fichier
            System.out.println("Ce fichier/dossier existe.");
            if (fileToScan.isFile() == true) {                  //est ce que c'est un fichier ?
                System.out.println("et c'est un fichier");
            }
            if (fileToScan.isDirectory() == true){              //un dossier ?
                System.out.println("et c'est un dossier");
            }
        }else{
            System.out.println("Ce chemin ne mène nul part");   //Erreur global
        }
    }
}
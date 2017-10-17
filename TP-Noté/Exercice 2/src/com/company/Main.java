package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner;                                    //initialisations des variables et leurs types
        String scann;
        File directory;
        String fileList[];

        scanner = new Scanner(System.in);
        System.out.println("Donnez un chemin de répertoire :");//saisie du chemin pour le scanner
        scann = scanner.nextLine();
        directory = new File(scann);
        fileList = directory.list();
        if (directory.exists() && directory.isDirectory()) {//condition pour boucler en vérifiant l'existance et la cible du chemin

            for (int i = 0;i < fileList.length;i++){        //on boucle pour afficher tous les éléments contenu dans le
                System.out.println(fileList[i]);            //chemin
            }
        }else{
            System.out.println("Erreur dans le chemin et/ou dossier non existant");//Gestion de l'erreur globale
        }
    }
}
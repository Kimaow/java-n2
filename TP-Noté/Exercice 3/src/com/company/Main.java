package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner;
        String scann;
        String scannExtension;
        File directory;
        String fileList[];
        String fileExtension;

        scanner = new Scanner(System.in);
        System.out.println("Donnez un chemin de répertoire :");
        scann = scanner.nextLine();
        System.out.println("Donnez une extension à lister :");
        scannExtension = scanner.nextLine();
        directory = new File(scann);
        fileList = directory.list();


    }
    static String extractExtension(String file){
        String fileExtension = "";
        int i = file.lastIndexOf(".");
        if (i != -1) {
            fileExtension = file.substring(i+1);
        }
        return fileExtension;
    }
}
//J'ai voulue reprendre le même code que le deux, ajouter une condition if pour filtrer uniquement les .txt par exemple
//donnés au scanner mais je n'ai pas réussis
      //  if (directory.exists() && directory.isDirectory())
      //  {
      //  for (int i = 0;i < fileList.length;i++)
      //  {
      //    if()
      //      System.out.println(fileList[i]);
      //}
      // }
      // else{
      //System.out.println("Il n'y a pas de répertoire de ce nom, ou le chemin est incorrect.");
      //}

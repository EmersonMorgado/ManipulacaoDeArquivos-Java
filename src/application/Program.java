package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory); // lista as pastas existentes dentro do caminho
        System.out.println("Folders: ");
        for (File folder : folders){
            System.out.println(folder);
        }
        
        File[] files = path.listFiles(File::isFile);  //lista arquivos do diretório
        System.out.println("Files: ");
        for (File file : files){
            System.out.println(file);
        }
        
        boolean success = new File(strPath + "\\subdir").mkdir(); // cria uma pasta caso não tenha.
        System.out.println("Directory created successfully: " + success);
        
        sc.close();
    }
}

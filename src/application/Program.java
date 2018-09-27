package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // inicia a partir do fr.
            
            String line = br.readLine(); // quando o arquito chegar no final será retornado null.
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            try { //pode ocorrer um erro neste momento quando tentar fechar o arquivo.
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    
}

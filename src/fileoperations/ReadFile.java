package fileoperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args)throws IOException{

        FileReader fr = null;
        BufferedReader br = null;
        String path = "C:\\Users\\Public\\file1.txt";   //file path with .txt

        try {
            fr = new FileReader(path);
        }catch (Exception ex){
            System.out.println("File was not locatable");
        }
        try {
            br = new BufferedReader(fr);;
            String data = " ";
            while ((data=br.readLine())!=null){   //while loop will read file until is null.
                System.out.println(data);
            }
        }catch (Exception e){
        }
        finally {
            if(  (br != null)){
                try {
                br.close();
                }catch (Exception ex){
                System.out.println("");
                }
            }
        }
        if(fr != null){
            try {
                fr.close();
            }catch (Exception ex){
                System.out.println("unable funmer road");
            }
            System.out.println("");
        }
    }
}

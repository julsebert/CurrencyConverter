package org.example;
import java.io.*;
public class ImportFile {

    public void importFile(){
            try
            {
            //constructor of the File class having file as an argument
                FileReader fr=new FileReader(".\\SE1\\Projekt SE1\\rms_mth.xls");
                System.out.println("file content: ");
                int r=0;
                while((r=fr.read())!=-1)
                {
                    System.out.print((char)r);  //prints the content of the file
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }


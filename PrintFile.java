package com.sd.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintFile {
  public void print() {
    try{
      File f=new File("noname.txt");
      FileReader fr=new FileReader(f);
      fr.close();
    }
    catch (IOException e) {
      System.out.println("No File");
    }
  }
  public static void main(String[] args){
    PrintFile pf=new PrintFile();
    pf.print();
  }
}
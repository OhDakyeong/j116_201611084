package com.sd.io;

import java.io.*;

public class PrintFileLower {
  public void file2Lower() {
    try{
      File f=new File("test.txt");
      FileReader fr=new FileReader(f);
      BufferedReader br=new BufferedReader(fr);
      String s;
      while((s=br.readLine())!=null) {
        System.out.println(s.toLowerCase());
      }
      fr.close();
    }catch (IOException e) {
      System.out.println("No File");
    }
  }
  public static void main(String[] args) {
    PrintFileLower pl=new PrintFileLower();
    pl.file2Lower();
  }
}
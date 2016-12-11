package com.sd.io;

import java.io.*;

public class WriteFile {
  public void writeFile(){
  try{
    FileWriter file=new FileWriter("test.txt");
    file.write("test2");
    file.close();
  } catch(IOException e) {
    System.out.println("No File");
  }
  }
  public static void main(String[] args) {
    WriteFile wf=new WriteFile();
    wf.writeFile();
  }
}
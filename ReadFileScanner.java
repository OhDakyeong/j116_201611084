package com.sd.io;

import java.util.Scanner;
import java.io.*;

public class ReadFileScanner {
  public void read() {
  try{
    Scanner f=new Scanner(new File("test.txt"));
    String line=f.nextLine();
    System.out.println(line);
  } catch (IOException e) {
    System.out.println("No File");
  }
  }
  public static void main(String[] args){
    ReadFileScanner rf=new ReadFileScanner();
    rf.read();
  }
}
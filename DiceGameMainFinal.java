package com.sd.Final;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DiceGameMainFinal extends JFrame implements ActionListener {
 JTextField scoreP1;
 JTextField scoreP2;
 JTextField turn;
 PlayerFinal p1;
 PlayerFinal p2;
 int clickCount=1;
 
 public void calcScore(){
   JFrame f=new JFrame();
   JPanel panel=new JPanel(new GridLayout(5,2));
   f.getContentPane().add(panel);
   JLabel label1=new JLabel(" -----  윷놀이 게임 ------>");
   JLabel label2=new JLabel("TURN");
   JLabel label3=new JLabel("Player1");
   JLabel label4=new JLabel("Player2");
   JLabel star=new JLabel("  조건! 먼저 30↑ 이긴다   ");
   turn=new JTextField(10);
   scoreP1=new JTextField(10);
   scoreP2=new JTextField(10);
   JButton b1=new JButton("윷던지기");
   JButton b2=new JButton("판 엎기");
   b1.setPreferredSize(new Dimension(40,50));
   b1.addActionListener(this);
   b2.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
       scoreP1.setText(" ");
       scoreP2.setText(" ");
       b2.setText("새 판");
       turn.setText(" ");
       clickCount=1;
     }
   });
   panel.add(label1);
   panel.add(star);
   panel.add(label2);
   panel.add(turn);
   panel.add(label3);
   panel.add(scoreP1);
   panel.add(label4);
   panel.add(scoreP2);
   panel.add(b1);
   panel.add(b2);
   f.pack();
   f.setVisible(true);
 }
 
 public void actionPerformed(ActionEvent e) {
   JButton b=(JButton)e.getSource();
   turn.setText(Integer.toString(clickCount));
   clickCount++;
   p1=new PlayerFinal("다경");
   p2=new PlayerFinal("명진");
   System.out.println("-------------Turn "+ (clickCount-1));
   p1.play();
   p2.play();
   int s1=p1.getScore();
   int s2=p2.getScore();

   scoreP1.setText(Integer.toString(s1));
   scoreP2.setText(Integer.toString(s2));

   
   if(s1>30 && s2<=30) {
     scoreP1.setText("WINNER "+Integer.toString(s1));
     scoreP2.setText("LOSER "+Integer.toString(s2));
   }
   else if(s2>30 && s1<=30){
     scoreP2.setText("WINNER "+Integer.toString(s2));
     scoreP1.setText("LOSER "+Integer.toString(s1));
   }
   else if(s1==s2 && s1>30) {
     scoreP1.setText("DRAW "+Integer.toString(s1));
     scoreP2.setText("DRAW "+Integer.toString(s2));     
   }
 }
 
 public static void main(String[] args) {
   DiceGameMainFinal dg=new DiceGameMainFinal();
   dg.calcScore();
   dg.setDefaultCloseOperation(EXIT_ON_CLOSE);
   dg.pack();
   dg.setVisible(true);
 } 
}
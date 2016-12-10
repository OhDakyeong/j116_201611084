package com.sd.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcAreaGUIMain3 extends JFrame implements ActionListener {
  JTextField radiusTf1;
  JTextField areaTf2; 
  public CalcAreaGUIMain3() {
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(3,2));
    f.getContentPane().add(panel);
    JLabel label1 = new JLabel("반지름");
    JLabel label2 = new JLabel("면적");
    radiusTf1 = new JTextField(20);
    areaTf2 = new JTextField(20);
    JButton b1 = new JButton("계산");
    JButton b2 = new JButton("취소");
    b1.setPreferredSize(new Dimension(40,40));
    b1.addActionListener(this);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        areaTf2.setText(" ");
        radiusTf1.setText(" ");
        b2.setText("취소했습니다.");
      }
    });
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    JButton b = (JButton)e.getSource();
    Double r = Double.parseDouble(radiusTf1.getText());
    areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
    b.setText("계산했습니다.");
  }

  public static void main(String[] args) {
    CalcAreaGUIMain3 c = new CalcAreaGUIMain3();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.pack();
    c.setVisible(true);
  }
}
package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
String title;
String text;
title=JOptionPane.showInputDialog(null,"Ничего не понимаю:","Скоро разберусь",JOptionPane.WARNING_MESSAGE);
text=JOptionPane.showInputDialog(null,"Главное терпение:","Сила и труд все перетрут",JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);

    // write your code here
    }
}

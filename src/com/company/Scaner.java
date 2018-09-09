package com.company;
import java.util.Scanner;

           public class Scaner {
               public static void main(String[] args) {
                   Scanner input=new Scanner(System.in);
                   String day,month;
                   System.out.print("Вторник,4-е число");
                   day=input.nextLine();
                   System.out.print("Сентябрь?");
                   month=input.nextLine();
                   String text;
                   text="Сегодня"+day+",Месяц-"+month;
                   System.out.println(text);
               }

}

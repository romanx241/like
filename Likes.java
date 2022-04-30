package ru.netology.java30.Likes;


import java.util.Scanner;

public class Likes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество лайков: ");
        int b = scanner.nextInt();
        System.out.println(outMessage(b));
    }

    public static String outMessage(int likes) {
        int a = 0;
        a = likes % 10;
        if(a == 1 && likes > 11){
            return "Понравилось " + likes + " человеку";
        }
        return "Понравилось " + likes + " людям";
    }
}

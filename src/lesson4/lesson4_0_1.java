package lesson4;

public class lesson4_0_1 {
    public static void main(String[] args) {
//        1. Составьте программу, которая переводит переменную из byte в short
//        2.Составьте программу, которая
//        переводит переменную из short в int
//        3.Составьте программу, которая переводит переменную из int в long
//        4.Составьте программу, которая переводит переменную из long в int
//        5.Составьте программу, которая переводит переменную из float в double
//        6.Составьте программу, которая переводит переменную из double в float
//        7.Придумайте способ переводить из int в boolean и наоборот.
//    8. Придумайте способ переводить из String в boolean .
//    9.Переведите переменную из char в string
//    10.Переведите переменную из char в int и наоборот .
//        11.Пусть int равен от 30 до 150. Переведите каждый int в char,и выведите таблицу, где на каждой строчке есть int и
//        соответствующий ему char

        //1
        byte x = 8;
        System.out.println((short) x);
        //2
        short z = (int) 16;
        System.out.println(z);
        //3
        int zz = 32;
        System.out.println((long) zz);
        //4
        long zzz = 64;
        System.out.println((int) zzz);
        //5
        float a = (float) Math.PI;
        System.out.println((double) a);
        //6
        double b = Math.PI;
        System.out.println((float) b);
        //7
        int f = 0;
        boolean c = true;
        if (f == 0) {
            System.out.println(c);

        } else {
            System.out.println(c = false);

        }

        if (c) {
            System.out.println(f);
        }

        String str = "2";
        boolean bool = str == "1";
        System.out.println(bool);

        char ch = '!';
        String s = String.valueOf(ch);
        System.out.println(s);
        //10
        int q = ch;
        System.out.println(q);
        System.out.println((char) q);
        //11

        int f1 = 30;
        int f2 = 150;
        char cha;
        for (int i = f1; i <= f2; i++) {
            cha = (char) i;
            System.out.println("int: " + i + " to " + " char: " + cha);
        }


    }
}

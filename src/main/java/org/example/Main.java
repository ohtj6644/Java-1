package org.example;

public class Main {
    public static void main(String[] args) {

        //System.out.println("안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.");
        //변수
//        int x = 5;
//        x = x + 5;
//        System.out.println(x + 10);
//        int a = 5;
//        int b = 10;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("---교체---");
//        int c;
//        c = a;
//        a = b;
//        b = c;
//        System.out.println(a);
//        System.out.println(b);
//
        int age = 50;
        System.out.println("당신의 나이는" + age + "입니다.");

        if (age >= 20) {
            System.out.println("성인입니다");
        } else {
            System.out.println(("미성년자입니다"));
        }
        if (age >= 20 && age <= 34) {
            System.out.println("청년입니다.");
        } else {
            System.out.println("청년이 아닙니다.");
        }
        System.out.println("==0308homeSetting==");

    }
}
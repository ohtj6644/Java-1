package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 스캐너 시작할때 무조건 시스템인.
        String input;
        // 입력값 받을 변수
        while (true){
        // 트루가 될때까지 반복
            try{
                // 시도한다
                System.out.println("숫자: ");
                //입력 물음
                input= scan.
                //물음값 인트를 인풋 변수에 담는다
                scan.nextLine();
                //??

            }catch(InputMismatchException e){
                // 인풋 에러가 떴을경우
                scan.nextLine();
                System.out.println("문자만 입력하세요");
                // 정수만 입력하세요 출력
                continue;
                //다시반복
            }
            break;
            // 트루값일 경우 반복종료

        }
        System.out.println("입력값 : "+ input );
        scan.close();
        // 스캔 종료

    }
}
/////////////////////////////////////////////////// 스캐너 입력 기본 ////////////////////////
//class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        //스캐너 쓸때 무조건 써야함
//        System.out.println("숫자: ");
//        // 스캐너 물음 문구
//        int input = scan.nextInt();
//        // 물음에 대한 값을 인트입력하고 그 값을 인풋이라는 변수에 담는다
//        System.out.printf("입력된 숫자 %d \n", input);
//        // 값을 입력했을때 나오는 출력값
//        scan.close();
//        // 스캔 종료
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////

//        Scanner scan = new Scanner(System.in);
//
//        int age;
//        while (true) {
//            System.out.print("숫자를 입력해주세요:");
//            try {
//                age = scan.nextInt();
//                scan.nextLine();
//                if (age < 1) {
//                    System.out.println("1 이상의 정수를 입력해주세요");
//                    continue;
//                }
//            } catch (InputMismatchException e) {
//                scan.nextLine();
//                System.out.println("정수 숫자만 입력하세요 ");
//                continue;
//            }
//            break;
//        }
//
//        System.out.println(age+ "살");
//
//    }
//
//}
//

//****************************************트라이 캐치
//    int[] datas = new int[2];
//    try{
//    //ArrayIndexOutOfBoundsException e
//    //System.out.println("이런.. 오류가 발생했군요.");
//    work(datas);    }catch (ArrayIndexOutOfBoundsException e){
//        System.out.println("이런.. 오류가 발생했군요.");
//    }
//
//
//    }
//    static void work(int[] datas){
//        datas[0] = 10;
//        datas[1] = 20;
//
//        datas[2] = 30;
//    }
//}


//   사람 a사람 = new 사람();
//        a사람.setId(20);
//
//        System.out.println("제 번호는 " + a사람.getId() + "입니다");
//        //출력- 제 번호는 20입니다
//class 사람 {
//    private int id;
//
//    void setId(int id) {
//        this.id = id;
//    }
//
//    ;
//
//    int getId() {
//        return this.id;
//    }
//
//}


// public static void main(String[] args) {
// new 사람();
//

//
//class 동물 {
// 동물 ( String 이름 ){
//  System.out.println("동물(String 이름) 실행됨!");
//  System.out.println("이름:"+이름);
// }
// 동물( String 이름 , int 나이){
//  System.out.println("동물(String 이름 , int 나이) 실행됨!");
//  System.out.println("이름:"+이름);
//  System.out.println("나이:"+ 나이);
// }
//}
//
//class 사람 extends 동물 {
// //*************************동물이름이 클래스인지 생성자인지 모름
// 사람(){
//  super("기린", 20);
////  **********************************************수퍼를 이용해 생성자에 접근 ********
// }
//}
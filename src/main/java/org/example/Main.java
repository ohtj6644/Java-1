package org.example;
// 문제 : 아래와 같이 출력 되도록 해주세요.
class Main {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}

class 사람{
    팔 a왼팔;
    사람(){
       a왼팔 = new 팔 ()

    }

}


class 팔{
    손 a손;
    팔() {
        a손 = new  손();
    }
}
class 손{
    손가락 a엄지손가락;
    손(){
        a엄지손가락 = new 손가락 ();
    }

}
class 손가락{
    int 길이 = 5;
}












//class Main {
//    public static void main(String[] args) {
//        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;
//
//        System.out.println(엄지손가락_길이 + "cm");
//        // 출력 : 5cm
//    }
//}
//class 사람{
//    팔 a왼팔;
//    사람(){
//        a왼팔 = new 팔();
//
//    }
//}
//
//class 팔 {
//    손 a손 ;
//    팔(){
//       a손 = new 손();
//    }
//
//}
//
//class 손{
//    엄지손가락 a엄지손가락;
//    손(){
//        a엄지손가락 = new 엄지손가락();
//    }
//
//}
//
//class 엄지손가락{
//    int 길이 =5 ;
//}
//



///////////////////////////////////////////////////////////////////////////////////////
//// 문제 : 사람의 걷다 메서드에 this. 를 적절한 곳에 추가해주세요.
//
//class Main {
//    // 함수, 메서드
//    // 단순히 프로그램의 시작점!
//    public static void main(String[] args) {
//        // 지역변수 => 하루살이 변수
//        int k = 10; // main 함수 안에서만 산다.
//
//        사람 a사람 = new 사람();
//        a사람.나이 = 20;
//
//        int dan = 8;  // main 함수 안에서만 산다.
//        for ( int i = 1; i < 9; i++ ) {
//            // i => for block 안에서만 산다.
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//
//        System.out.println(a사람.나이);
//        a사람.걷다();
//    }
//}
//
//class 사람 {
//    // 인스턴스 변수
//    int 나이;
//
//    void 걷다() {
//        나이 = 22;
//
//        System.out.println(나이 + "살인 홍길동씨가 걷습니다.");
//    }
//}
//



/////////////////////////////////////////////////////////////////////////////////////////


//// 출력 : 아래와 같이 출력되게 해주세요.
//
//class Main {
//  public static void main(String[] args) {
//    new 사람().걷다();
//
//    System.out.println(new 사람().a왼팔.길이 + "cm");
//    // 출력 : 100cm
//  }
//}
//class 사람 {
//  void 걷다() {
//    System.out.println("사람 걷는다.");
//  }
//}
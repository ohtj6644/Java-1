package org.example;


// 출력 : 아래와 같이 출력되게 해주세요.

class Main {
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람 {
    void 걷다() {
        System.out.println("사람 걷는다.");
    }
    팔 a왼팔;
    사람 (){
        a왼팔 = new 팔();
    }
}
class 팔 {
    int 길이;
    팔 (){
        길이 = 100;
    }
}


//class Main {
//    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//        a사람.나이 = 10;
//        a사람.a왼팔 = new 팔();
//
//        System.out.println(a사람.a왼팔.길이 + "cm");
//        // 출력 : 100cm
//    }
//}
//
//
//class 사람 {
//    int 나이;
//    팔 a왼팔;
//}
//class 팔 {
//    int 길이 = 100;
//}

//class Main {
//    public static void main(String[] args) {
//        전사 a전사0 = new 전사();
//        a전사0.나이 = 20;
//        a전사0.이름 = "칸";
//        a전사0.성격 = "차가움";
//        a전사0.a무기 = new 활();
//
//        전사 a전사1 = new 전사();
//        전사 a전사2 = new 전사();
//        전사 a전사3 = new 전사();
//        전사 a전사4 = new 전사();
//        전사 a전사5 = new 전사();
//
//        System.out.println(a전사0.이름);
//        // 출력 : 칸
//        System.out.println(a전사1.이름);
//        // 출력 : No Name
//        System.out.println(a전사2.이름);
//        // 출력 : No Name
//        System.out.println(a전사3.이름);
//        // 출력 : No Name
//        System.out.println(a전사4.이름);
//        // 출력 : No Name
//        System.out.println(a전사5.이름);
//        // 출력 : No Name
//    }
//}
//
//class 전사 {
//    int 나이;
//    String 이름;
//    String 성격;
//    무기 a무기;
//
//    // `전사()` 는 생성자 메서드 이다.
//    // 클래스 명과 같은 이름의 메서드를 생성자 메서드 라고 한다.
//    // 생성자 메서드는 자동으로 호출됩니다.
//    // 생성자 메서드는 new 할때(객체 생성할 때) 자동으로 호출됩니다.
//    // 생성자 메서드는 다른 모든 메서드 보다 가장 먼저 딱 1번 실행됩니다.
//    // 생성자 메서드는 리턴타입이 없습니다.
//    // 당연하지만 생성자 메서드는 리턴값도 없습니다.
//    전사() {
//        // 수정가능지역 시작
//        this.나이 = 20;
//        this.이름 = "No Name";
//        this.성격 = "온순함";
//        this.a무기 = new 칼();
//        // 수정가능지역 끝
//    }
//}
//
//abstract class 무기 {
//
//}
//
//class 칼 extends 무기 {
//
//}
//
//class 활 extends 무기 {
//
//}
//
//




//    사람 a사람 = new 사람();
//    int 엄지손가락_길이 = a사람.a왼팔.a손.a엄지손가락.길이;
//
//        System.out.println(엄지손가락_길이+"cm");
//class 사람 {
//    팔 a왼팔;
//    사람(){
//        a왼팔= new 팔();
//    }
//
//}
//class 팔 {
//    손 a손;
//    팔(){
//        a손 = new 손();
//    }
//}
//
//class 손 {
//    손가락 a엄지손가락;
//    손(){
//        a엄지손가락= new 손가락();
//    }
//}
//
//class 손가락 {
//    int 길이 = 5 ;
//
//
//


















//전사 a전사1 = new 전사();
//
//        a전사1.공격();
//
//        a전사1.a왼손무기1= new 칼();
//        a전사1.공격();
//
//        전사 a전사2 = new 전사 ();
//
//        a전사2.a왼손무기1 = new 창();
//        a전사2.a오른손무기2 = new 도끼();
//        a전사2.공격();
//class 전사 {
//
//    무기 a왼손무기1;
//    무기 a오른손무기2;
//
//    void 공격() {
//        if (a왼손무기1 == null && a오른손무기2 == null) {
//            System.out.println("아직 무기가 없습니다.");
//        } else if (a왼손무기1 != null && a오른손무기2 == null) {
//            a왼손무기1.공격1("전사","왼손");
//        } else if (a왼손무기1 == null && a오른손무기2 != null) {
//            a오른손무기2.공격1("전사", "오른손");
//        } else if (a왼손무기1 != null && a오른손무기2 != null) {
//            a왼손무기1.공격1("전사","왼손");
//            a오른손무기2.공격1("전사", "오른손");
//
//        }
//    }
//}
//
//
//abstract class 무기 {
//    abstract void 공격1(String 직업이름 ,String 손 );
//}
//
//class 창 extends 무기 {
//    void 공격1(String 직업이름 ,String 손 ) {
//        System.out.println(직업이름 +"이(가)"+ 손 +"으로 창을 사용합니다 ");
//    }
//}
//
//class 칼 extends 무기 {
//    void 공격1(String 직업이름 ,String 손 ) {
//        System.out.println(직업이름 +"이(가)"+ 손 +"으로 칼을 사용합니다 ");
//    }
//}
//
//class 도끼 extends 무기 {
//    void 공격1(String 직업이름 ,String 손 ) {
//        System.out.println(직업이름 +"이(가)"+ 손 +"으로 도끼를 사용합니다 ");
//    }
//}
//
//

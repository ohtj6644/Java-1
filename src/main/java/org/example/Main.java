package org.example;

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.소개();

    }
}

class 전사{
    String 이름 ;
    전사 (){
        이름 = "아무개";
    }
    void 소개(){
        System.out.println("전사의 이름은 "+this.이름+"입니다 ");
    }
}






///////////////////////////////////////////////////////////////////////////
//    전사 a전사 = new 전사();
//
//        a전사.a무기1 = new 칼();
//                a전사.공격();
//                // 출력 => 전사가 칼로 공격합니다.
//
//                a전사.a무기1 = new 활();
//                a전사.공격();
//                // 출력 => 전사가 활로 공격합니다.
//
//                a전사.a무기2 = new 칼();
//                a전사.공격();
//// 출력 => 전사가 활로 공격합니다.
//// 출력 => 전사가 칼로 공격합니다.
//
//class 전사 {
//    무기 a무기1;
//    무기 a무기2;
//
//    void 공격() {
//        if (a무기1 == null && a무기2 == null) {
//            System.out.println("아직 무기가 없습니다");
//        } else if (a무기1 == null && a무기2 != null) {
//            a무기2.동작();
//        } else if (a무기2 == null && a무기1 != null) {
//            a무기1.동작();
//        } else {
//            a무기1.동작();
//            a무기2.동작();
//        }
//    }
//}
//
//
//abstract class 무기 {
//    abstract void 동작();
//}
//
//class 칼 extends 무기 {
//    void 동작() {
//        System.out.println("전사가 칼로 공격합니다");
//    }
//}
//
//class 활 extends 무기 {
//    void 동작() {
//        System.out.println("전사가 활로 공격합니다");
//    }
//}
/////////////////////////////////////////////////////////////////////////////

//    사람 a사람 = new 사람();
//        a사람.달리기_속력 = 20;
//                a사람.달리다();
//                // 사람이 20km/h로 달립니다.
//                a사람.달리다();
//                // 사람이 20km/h로 달립니다.
//
//                a사람.달리기_속력 = 50;
//                a사람.달리다();
//// 사람이 50km/h로 달립니다.
//class 사람{
//    int 달리기_속력;
//    void 달리다(){
//        System.out.println("사람이"+this.달리기_속력+"km/h 로 달립니다.");
//    }
//}

////////////////////////////////////////////////////////////////
////        int i = 로봇.get정수();
////        boolean b = 로봇.get논리();
////        사람 a사람 = 로봇.get사람();
////        사람 a사람2 = 로봇.get사람2();
////        사람 a사람3 = 로봇.get사람3();
////        사람 a사람4 = 로봇.get사람4();
////        사람 a사람5 = 로봇.get사람5(123, false);
////        로봇.get사람6(123, false);
//
//class 로봇 {
//    static int get정수() {
//        return 1;
//    }
//
//    static boolean get논리() {
//        return true;
//    }
//
//    static 사람 get사람() {
//        return new 사람();
//    }
//
//    static 사람 get사람2() {
//        return new 사람();
//    }
//
//    static 사람 get사람3() {
//        return new 사람();
//    }
//
//    static 사람 get사람4() {
//        return new 사람();
//    }
//
//    static 사람 get사람5(int a, boolean b) {
//        return new 사람();
//    }
//
//    static 사람 get사람6(int a, boolean b) {
//        return new 사람();
//    }
//}
//
//class 사람 {
//
//}
//






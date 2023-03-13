/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
*/

class Main {
    public static void main(String[] args) {
//
        청둥오리 청둥오리1 = new 청둥오리();
        청둥오리1.날다();

        흰오리 흰오리1 = new 흰오리 ();
        흰오리1.날다();

        고무오리1 고무오리a = new 고무오리1();
        고무오리a.날다();

        고무오리2 고무오리2 = new 고무오리2();
        고무오리2.날다();



    }
}

class 오리 {
    void 날다(){
        System.out.println("오리가 날개로 날아갑니다");
    }
}

class 청둥오리 extends 오리 {

}
class 흰오리 extends 오리 {

}
class 고무오리1 extends 오리{
    void 날다 (){
        System.out.println("고무오리는 날 수 없습니다");
    }
}
class 고무오리2 extends 고무오리1{

}























//    청둥오리 a청둥오리 = new 청둥오리();
//        a청둥오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        흰오리 a흰오리 = new 흰오리();
//        a흰오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        고무오리 a고무오리 = new 고무오리();
//        a고무오리.날다();
//
//        고무2오리 a고무2오리 = new 고무2오리();
//        a고무2오리.날다();
//class 오리 {
//    void 날다 (){
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//}
//class 청둥오리 extends 오리 {
//
//}
//class 흰오리 extends 오리 {
//
//}
//class 고무오리 extends 오리 {
//    void 날다(){
//        System.out.println("저는 날 수 없어요. ㅜㅠ");
//    }
//}
//
//class 고무2오리 extends 고무오리 {
//
//
//}








//    검은고양이 a검은고양이 = new 검은고양이();
//    a검은고양이.숨쉬다();
//
//    흰고양이 a흰고양이 = new 흰고양이();
//    a흰고양이.달리다();
//
//    회색고양이 a회색고양이 = new 회색고양이();
//    a회색고양이.달리다();


//
//class 고양이 {
//    void 숨쉬다 ( ){
//        System.out.println("숨쉬다");
//    }
//    void 달리다 ( ){
//        System.out.println("달리다");
//    }
//    void 뛰어넘다 ( ){
//        System.out.println("뛰어넘다");
//    }
//    void 간택하다 ( ){
//        System.out.println("간택하다");
//    }
//}
//
//class 흰고양이 extends 고양이 {
//    void 마법을쓰다 () {
//        System.out.println("마법을 쓰다");
//    }
//}
//
//class 검은고양이 extends 고양이 {
//    void 미래를예지하다 () {
//        System.out.println("미래를예지하다");
//    }
//}
//
//class 회색고양이 extends 고양이 {
//    void 달리다 (){
//        System.out.println("고양이가 달리다");
//    }
//}
//
//
//
//
//





//    계산기 계산기1 = new 계산기();
//
//        계산기1.합산(5);
//
//                System.out.println(계산기1.합산1(2,4));





//class 계산기 {
//
//
//    void 합산(int n) {
//        int j=0;
//        for (int i = 1; i <= n; i++) {
//            j = j+i;
//
//        }
//        System.out.println(j);
//    }
//    int 합산1(int n, int m){
//        int j = 0;
//        for (int i = n; i <= m; i++) {
//            j = j+i;
//
//        }
//        return j;
//
//    }
//}


//    계산기 계산기1 = new 계산기();
//
//        System.out.println("더하기 값은 "+ 계산기1.더하기(1,3));
//                System.out.println("빼기기 값은 "+ 계산기1.빼기(1,3));
//                System.out.println("나누기 값은 "+ 계산기1.나누기(3,3));
//                System.out.println("곱하기 값은 "+ 계산기1.곱하기(1,3));
//class 계산기 {
//
//
//    double 더하기(double a, double b) {
//
//        return(a + b);
//    }
//
//    double 빼기(double a, double b) {
//        return(a - b);
//    }
//
//    double 나누기(double a, double b) {
//        return(a/b);
//    }
//
//    double 곱하기(double a, double b) {
//        return(a*b);
//    }
//
//}


//    person p1 = new person();
//            p1.나이 = 100;
//                    p1.인류평균나이 += 100;
//
//                    person p2 = new person();
//                    p2.나이 = 200;
//                    p2.인류평균나이 += 200;
//
//                    person p3 = new person();
//                    p3.나이 = 400;
//                    p3.인류평균나이+=300;
//
//                    System.out.println(p1.인류평균나이);
//                    p1.인류평균나이소개();
//
//
//class person {
//    int 나이;
//    static int 인류평균나이;
//
//    void 인류평균나이소개() {
//        System.out.println("제 나이는 " + this.나이 + " 살 입니다.");
//        System.out.println("인류평균나이는 " + 인류평균나이/3 + "살 입니다.");
//    }
//}


//        int a = 50;
//        int[] arr = {1, 2, 3};
//        //인트배열 자료형 어레이 선언 = 새로운 배열 3번째자리까지 생성
//        System.out.println(arr);
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//
//        System.out.println(sum / arr.length);

//        int[] arr1 = new int[3];
//        arr1[0] = 1;
//        arr1[1] = 11;
//        arr1[2] = 111;
//
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);


//        //설계도 설계도이름  = new 설계도();
////        캐릭터 캐릭터a = new 캐릭터();
////        캐릭터a.이름 = "아름";
////        캐릭터a.키 = 170;
////        캐릭터a.나이 = 20;
////        캐릭터a.자기소개();
////
////        캐릭터 캐릭터b = new 캐릭터();
////        캐릭터b.이름 = "철수";
////        캐릭터b.키=171;
////        캐릭터b.나이=21;
////        캐릭터b.자기소개();
//
//        자동차 자동차a = new 자동차 ();
//        자동차a.속력=70;
//        자동차a.번호=1;
//        자동차a.달리다();
// 자동차 자동차속력,번호 / 달리다 누르면 해당속력으로 달린다 출력

//class 자동차 {
//    int 속력 ;
//    int 번호 ;
//    void 달리다 (){
//        System.out.println(this.번호+"번 자동차가 현재"+this.속력+"km/h로 달리고 있습니다.");
//    }
//}
;


//class 캐릭터 {
//    String 이름;
//    int 키;
//    int 나이;
//
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.이름 + " 입니다.\n" +"제 키는 "+ this.키 + "입니다.\n" + "나이는" + this.나이 + "입니다.");
//    }
//};
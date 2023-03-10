package org.example;

// 문제 : 아래와 같이 출력해주세요.

class Main {
    public static void main(String[] args) {
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


        //설계도 설계도이름  = new 설계도();
        캐릭터 캐릭터a = new 캐릭터();
        캐릭터a.이름 = "아름";
        캐릭터a.키 = 170;
        캐릭터a.나이 = 20;
        캐릭터a.자기소개();

        캐릭터 캐릭터b = new 캐릭터();
        캐릭터b.이름 = "철수";
        캐릭터b.키=171;
        캐릭터b.나이=21;
        캐릭터b.자기소개();


    }

    ;
};

class 캐릭터 {
    String 이름;
    int 키;
    int 나이;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.이름 + " 입니다.\n" +"제 키는 "+ this.키 + "입니다.\n" + "나이는" + this.나이 + "입니다.");
    }
};
;
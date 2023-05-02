package org.example.practice;

public class Application2 {
    public static void main(String[] args) {
        // 문제 2
        // 출제자 : 조동훈
        /* 사람들 평균 몸무게를 구하는 문제.
        * 총 4명의 사람에 대한 평균 몸무게를 구하며
        * 몸무게는 각각 61kg, 66kg, 73kg , 70kg이다.
        * 각 사람의 몸무게를 변수에 담아 총 무게와 평균 몸무게를 출력하시오
        *
        * -- 출력 예시--
        * 총 몸무게 : 270
        * 평균 몸무게 : 67.5
        * */

        int a=61, b=66, c=73, d=70;
        int total = (a+b+c+d);
        float avg = (total) / 4F;

        System.out.println("총 몸무게 : " + total);
        System.out.println("평균 몸무게 : " + avg );

    }
}

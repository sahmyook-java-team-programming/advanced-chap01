package org.example.practice;

public class Application3 {
    public static void main(String[] args) {
        // 문제 3
        // 출제자 : 김재현

        /*
        * 문자형 변수를 두개 선언 후 'A'와 'a'를 각각 대입한 후
        * 출력은 문자 'A'와 'a'가 가지는 유니코드 값을 각각 출력하도록 하세요
        *
        * -- 출력 예시 --
        * 문자 A와 a의 unicode : A : 97 a : 65
        * */

        char uniA = 'A' , unia = 'a';
        System.out.println("문자 'A'와 'a'의 unicode : A : " + (int)uniA + " a : " + (int)unia );
    }
}

import java.util.Scanner;

/*
 * 문자열 str이 주어집니다.
문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
abcde 입력
 */
public class str {
    public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //여기 안 건드는 게 맞음
        String str[] = a.split(""); 
        for (String aString : str) {
            System.out.println(aString);
        }
    }
}
}   

//2가지 방법이 존재
/* (1) split - 특정 열 자르기
 * (2) CharAt - String 타입을 char 타입으로 변형시키는 것
 */



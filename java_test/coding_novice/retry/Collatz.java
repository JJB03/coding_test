package retry;
import java.util.ArrayList;
import java.util.List;

public class Collatz {
/*
모든 자연수 x에 대해서 
현재 값이 x이면 x가 짝수일 때는 2로 나누고, 
x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 
언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.

임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때
초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
s
*/
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n); // 먼저 추가한다.
        // n == 1 일 때까지 반복이니 while문
        while (n != 1) { //n == 1이면 그럴 때만 한다는 것이므로 안 됨
            if (n%2 == 0) {
                n = n/2;
            } else {
                n = 3 * n + 1;
            }
            answer.add(n);
        }
        //👩🏼‍💻 List를 arr로 변환하는 방법!!
        return answer.stream().mapToInt(Integer :: intValue).toArray();
    }
}

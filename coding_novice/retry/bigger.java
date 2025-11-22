package retry;
public class bigger {
    /*
    연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 
    예를 들면 다음과 같습니다.
    12 ⊕ 3 = 123
    3 ⊕ 12 = 312
    양의 정수 a와 b가 주어졌을 때, 
    a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
     */    
    public int solution(int a, int b) {
        int answer = 0;

        //잘 되지 않아 도움을 빌렸음
        //1) 숫자 -> 문자열로 변환
        String abstr = String.valueOf(a) + String.valueOf(b);
        String bastr = String.valueOf(b) + String.valueOf(a);

        //2) 문자열을 정수로 변환한다.
        int ab = Integer.parseInt(abstr);
        int ba = Integer.parseInt(bastr);

        // 더 큰 값만 호출한다.
        if (ab>ba) {
            answer = ab;
        } else answer = ba;

        return answer;
        //Math.max를 활용해 두 수 중 큰 값만 나오게 하는 경우도 존재함.
    }
}    


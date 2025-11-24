public class str_comparison {
    /*
    연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 
    예를 들면 다음과 같습니다.
    12 ⊕ 3 = 123
    3 ⊕ 12 = 312
    양의 정수 a와 b가 주어졌을 때, 
    a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
    단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
     */
        public int solution(int a, int b) {
        int answer = 0;
        // + 의 경우 전과 동일함, *의 경우 그냥 정수로 곱하면 됨
        //즉 초반에 *를 미리 구해놓음
        int ba2 = 2*a*b;
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);
        
        //문자열 붙이기
        String abString = aString + bString;
        
        //여기까지 a+b의 결과 구하기
        int ab = Integer.parseInt(abString);

        //비교하기, math가 가장 쉽긴 함.
        if (ab>=ba2) {
            answer = ab;
        } else{
            answer = ba2;
        }

        return answer;
    }
}


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
        //일단 두 정수가 문자열이고 둘이 이어붙여지는 걸 해야 함.
        String sab = Integer.toString(a) + Integer.toString(b);
        String sba = Integer.toString(b) + Integer.toString(a);

        //이제 얘네를 숫자로 변환
        int ab = Integer.parseInt(sab);
        int ba = Integer.parseInt(sba);
        
        return Math.max(ab, ba);
    }
}    


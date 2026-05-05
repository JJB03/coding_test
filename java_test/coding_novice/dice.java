public class dice {
    /*
    1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 
    세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
    세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
    세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 
    (a + b + c) × (a2 + b2 + c2 )점을 얻습니다. 아 이거 제곱이네.
    세 숫자가 모두 같다면 
    (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
    세 정수 a, b, c가 매개변수로 주어질 때, 
    얻는 점수를 return 하는 solution 함수를 작성해 주세요.
     */

    public int solution(int a, int b, int c) {
        int answer = 0;
        //주사위 abc 고 1~6만 가능함
        //일단 조건문이니까 ifelse 쓰는게 가장 무난할 듯
        if (a == c && b == c) { //셋 다 같다면
            answer = (a + b + c) * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c); 
        } else if(a == c || b == c || a == b) { //두개만 같다면
            answer = (a + b + c) * (a*a + b*b + c*c );
        } else { // 셋 다 다르당
            answer = a + b + c;
        }
        return answer;
    }
}

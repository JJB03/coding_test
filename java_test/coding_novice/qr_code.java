public class qr_code {
/*
두 정수 q, r과 문자열 code가 주어질 때, 
code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
문자열의 0번 인덱스부터 끝까지 하나씩 살펴보면서 
**"이 인덱스 번호를 $q$로 나누었을 때 나머지가 $r$인가?"**를 체크하는 문제
 */
    public String solution(int q, int r, String code) {
        String answer = "";
        //하나부터 끝까지 가야하니까
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) { //이게 참일 시 추가
                answer += code.charAt(i); 
                //그냥 i로 하려고 했더니 이건 인덱스 번호를 붙이는 거라고 함.
            } 
        }
        return answer;
    }
}

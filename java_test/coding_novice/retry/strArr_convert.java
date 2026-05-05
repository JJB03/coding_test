package retry;
public class strArr_convert {
    //코드 처리하기 문제
    /* 그러니까 1) 문자가 1인지 0인지 체크하고 짝수 홀수 구분하는 문제인듯
     */
    public String solution(String code) {
        //바뀔 수 있는 문자열 생성
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        //반복-조건
        for (int i = 0; i < code.length(); i++) {
            //code.length 길이 체크해서 그만큼 돌아가기
            char currentS = code.charAt(i); //String -> Char
            // 이걸로 문자열 - 문자로 떼어내기
            if (currentS == '1') { // 문자가 1이라면
                mode = mode == 0 ? 1 : 0;
                // mode가 0이면 1 아니면 0
                continue;
            } 
            if (i % 2 == mode) { //만약 짝수라면
                answer.append(currentS); //그냥 합한다
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer.toString();
        //아무것도 없다면 엠티 출력 아니면 그대로 문자열로 출력
    }
}

//https://develop-me-z.tistory.com/326#google_vignette 참고
/*
문자열 code가 주어집니다.
code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. 
mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.

mode는 0과 1이 있으며, 
idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 
code[idx]의 값에 따라 다음과 같이 행동합니다.

mode가 0일 때
code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
mode가 1일 때
code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.

단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 
대신 "EMPTY"를 return 합니다.
*/


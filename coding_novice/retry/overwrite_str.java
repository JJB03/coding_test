public class overwrite_str {
    /* 문자열 겹쳐쓰기
     *문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
     *문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
     *문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요. 
     */
        public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
            //참고함
            //재도전 필수
            int myStringLen = my_string.length(); //길이 재기
            int overwriteStrLen = overwrite_string.length(); //길이 재기

            answer += my_string.substring(0, s); //인덱스 자르는 개념. 0위치에서 s만큼 잘라 를 뜻함.
            answer += overwrite_string; //자르고 overwrite를 붙임
            answer += my_string.substring(overwriteStrLen+s, myStringLen); 

        return answer;
    }
}

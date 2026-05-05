public class string_add_n {
    /*
    문자열 my_string과 정수 n이 매개변수로 주어질 때, 
    my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
    == 이해 실수, 뒤를 기준으로 n번째임.
     */
    public String solution(String my_string, int n) {
        String answer = "";
        //시작 위치를 정하자
        int start = my_string.length() - n;
        //mystring만큼 문자열 돌아서 뽑자
        for (int i = start; i < my_string.length(); i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

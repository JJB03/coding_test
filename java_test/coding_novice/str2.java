public class str2 {
    /*
    문자열 my_string과 정수 k가 주어질 때, 
    my_string을 k번 반복한 문자열을 return 
    하는 solution 함수를 작성해 주세요.
     */
        public String solution(String my_string, int k) {
        String answer = "";
        //단순하게 생각해보자 얘는 문자영 반복만 하면 된다.
        //foreach문도 단순반복인데 얘로 할까 근데 얜 배열 있어야 함
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        System.out.print(answer);
        return answer;
    }
}

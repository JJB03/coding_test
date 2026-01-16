package retry;
public class reverse_string {
/*
문자열 my_string과 정수 s, e가 매개변수로 주어질 때, 
my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
my_string	        s	e	result
"Progra21Sremm3"	6	12	"ProgrammerS123"
"Stanley1yelnatS"	4	10	"Stanley1yelnatS"
 */
    public String solution(String my_string, int s, int e) {
        if (my_string.length() <0) System.out.println("없음");
        String answer = "";
        //for 돌릴 필요없이 스위치 할 수 있는 걸 찾아보자.
        String part1 = my_string.substring(0, s); // 앞
        String part2 = my_string.substring(e + 1); // 뒤
        String part3 = new StringBuilder(my_string.substring(s, e+1))
        .reverse().toString(); //🌟🌟바꿀 부분
        answer += part1 + part3 + part2;
        return answer;
    }
}

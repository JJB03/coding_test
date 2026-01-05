package retry;
import java.util.Arrays;

public class suffix_arr {
/*
어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
예를 들어, "banana"의 모든 접미사는 
"banana", "anana", "nana", "ana", "na", "a"입니다.
문자열 my_string이 매개변수로 주어질 때, 
my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */
    public String[] solution(String my_string) {
        //이만큼 들어감. 문자열 길이만큼 배열크기 확보.
        String[] answer = new String[my_string.length()];
        // 쪼개달라는 얘기인가?
        // 일단 돌려서 쪼개서 등록하자.
        for (int i = 0; i < my_string.length(); i++) {
            //substring은 문자열로 나뉘고 split은 배열 형태로 나뉘어짐
            answer[i] = my_string.substring(i);
            //문자열 추가는 += 가 아니라 =
        }
        //정렬해야해.
        Arrays.sort(answer);
        return answer;
    }
}

/*
    이런 풀이도 있음.
    특정 문자열로 끝나는지 확인하는 거임.
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.endsWith(is_suffix)){
            answer =1;
        }
        return answer;
    }

*/

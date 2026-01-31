package retry;
public class string_remove {
/*
문자열 my_string과 정수 배열 indices가 주어질 때, 
my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고
이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
                my_string	indices	result
"apporoograpemmemprs"	[1, 16, 6, 15, 0, 10, 11, 3]	"programmers"
 */
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(); //가변 문자열
        
        //지우는 거 만들기, 해당 indices 칸을 찾아야 함.
        for (int i = 0; i < my_string.length(); i++) {
            boolean StringRM = false; //제거 대상이 아니다
            for (int idx : indices) {
                if (i == idx) {
                    StringRM = true; //제거 대상
                    break;
                }
            }
            //그외 것들
            if (!StringRM) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}

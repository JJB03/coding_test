package retry;
public class suffix_check {
/*
어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
예를 들어, "banana"의 모든 접미사는 
"banana", "anana", "nana", "ana", "na", "a"입니다.
문자열 my_string과 is_suffix가 주어질 때, 
is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
 */

//👩🏼‍💻for문을 돌릴 필요가 없다고 함. 이 이유가 뭔지 스스로 알도록 하자.
    public int solution(String my_string, String is_suffix) {
        //그니까 즉, 음절 모두 띄우는 게 아닌 위에서 하나씩 -
            //my_string == is_suffix가 같다면 1
            //다만 문자열 ==는 주소를 비교하는 것이다.
            if (is_suffix.length() <= my_string.length()
            && my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix)) {
                return 1;
            } return 0;
    
    }
}

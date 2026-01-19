package retry.point_retry;


public class vertical_string {
/*
문자열 my_string과 두 정수 m, c가 주어집니다.
my_string을 한 줄에 m 글자씩 가로로 적었을 때
왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
 */
//풀이가 생각보다 쉬운데 내가 잘못 생각하고 있는게 있나.
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int idx = my_string.length();
        for(int i = c - 1; i < idx; i += m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}

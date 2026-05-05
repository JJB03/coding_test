package retry.point_retry;


public class vertical_string {
/*
문자열 my_string과 두 정수 m, c가 주어집니다.
my_string을 한 줄에 m 글자씩 가로로 적었을 때
왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
 */
//저장할 필요가 없어서 List 소환 불필요. idx 개념을 잘 아는게 중요.
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int idx = my_string.length();
        //0부터 시작하니 실제로는 c - 1 위치.
        //- i += m : 한 줄에 m글자씩 있으니까, 같은 열의 다음 글자는 항상 m만큼 떨어져 있습니다.
        for(int i = c - 1; i < idx; i += m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}

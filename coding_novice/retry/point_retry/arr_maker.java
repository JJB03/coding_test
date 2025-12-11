package retry.point_retry;
import java.util.ArrayList;
import java.util.List;

public class arr_maker {
    /*
    정수 l과 r이 주어졌을 때, 
    l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 
    모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
     */
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        //반복 검사해야 해서 for문 필수
        //코파일럿 사용.
        for (int i = l; i <=r; i++) {
            String s = String.valueOf(i); //문자열로 변경해서 정확하게 확인
            boolean valid = true;

            for (char c : s.toCharArray()) {
                if (c != 0 && c != 5 ) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }
        // list -> int[] 로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

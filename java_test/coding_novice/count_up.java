import java.util.ArrayList;
import java.util.List;

public class count_up {
    /*
    정수 start_num와 end_num가 주어질 때
    start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
     */
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<Integer>();
        //리스트는 비연속적인 배열임.
        for (int i = start_num; i <= end_num; i++) {
            //시작부터 끝까지
            answer.add(i);
        }
        return answer;
    }
}

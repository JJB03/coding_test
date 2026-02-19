import java.util.ArrayList;
import java.util.List;

public class cut_list {
/*
정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. 
slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, 
n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
 */
    public int[] solution(int n, int[] slicer, int[] num_list) {
        //slice 에 n / a / b / c, num_list는 가지각색
        List<Integer> n_list = new ArrayList<>();
        //조건 반복문으로 돌려야 할 듯.
        for (int i = 0; i < num_list.length; i++) {
            if (slicer[n] == 1) { //n이 1이라면
                n_list.add(num_list[0] + num_list[2]);
            } else if(slicer[n] == 2){
                n_list.add(num_list[1] + num_list[3]);
            } else if(slicer[n] == 3) {
                n_list.add(num_list[1] + num_list[2]);
            } else if(slicer[n] == 4) {
                
            } else {

            }
        }
        int[] answer = {};
        return answer;
    }
}

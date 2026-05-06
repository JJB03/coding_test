import java.util.ArrayList;

public class list_cut {
/*
정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, 
n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
 */
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> num = new ArrayList<>();
        // 0 1 2 로 해도 초기값 안 겹쳐서 괜찮음
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n) {
            case 1: // 0번 인덱스부터 b번 인덱스까지
                for (int i = 0; i <= b; i++) {
                    num.add(num_list[i]);
                }
                break;
            case 2: // a번 인덱스부터 끝까지
                for (int i = a; i < num_list.length; i++) {
                    num.add(num_list[i]);
                }
                break;
            case 3: // a번 인덱스부터 b번 인덱스까지
                for (int i = a; i <= b; i++) {
                    num.add(num_list[i]);
                }
                break;
            case 4: // a번 인덱스부터 b번 인덱스까지 c 간격으로
                for (int i = a; i <= b; i += c) {
                    num.add(num_list[i]);
                }
                break;
        }

        // ArrayList → int[]
        return num.stream().mapToInt(Integer::intValue).toArray();
    }
}

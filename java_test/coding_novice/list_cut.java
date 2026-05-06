import java.util.ArrayList;

public class list_cut {
/*
정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, 
n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
 */
        public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {}; 
        //👩🏼‍💻배열 소환해서 넣기
        ArrayList<Integer> num = new ArrayList<>();

        //그러니까 잘라야 함. n이 1이면 0~b번까지, 2면 a ~ 끝까지 이런 식으로 조건이 있음.
        //조건문 switch 혹은 if문 사용.
        int a = num_list[1];
        int b = num_list[2];
        int c = num_list[3];
            switch (n) {
                case 1: //n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
                    for (int i = slicer[0]; i < b; i++) {
                        num.add(num_list[i]); //그냥 i말고 num_list에 담긴 i
                    }
                    break;
                case 2://n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
                    for (int i = a; i < num_list.length; i++) {
                        num.add(num_list[i]);
                    }
                    break;
                case 3: //n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
                    for (int i = a; i < b; i++) {
                        num.add(num_list[i]);
                    }
                    break;
                case 4: //n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
                    for (int i = a; i < b; ++c) {
                        num.add(num_list[i]);
                    }
                    break;
            
                default:
                    break;
            }
            //이제 반환값 돌려야 하는데 array는 어떤 식으로 돌리냐?
            int arr = num.size();
                answer = new int [arr];
                for (int i = 0; i < num.size(); i++) {
                    answer[i] = num.get(i);
                }
        return answer;
    }
}

public class first_minor {
    /*
    정수 리스트 num_list가 주어질 때, 
    첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 
    음수가 없다면 -1을 return합니다.
     */
    public int solution(int[] num_list) {
        //음수가 리스트가 될 수가 있나? 일단 조건문이 있음.
        //어디가 문제인지 체크
        if (num_list[0] >= 0) {
            return -1;
        } else {
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] < 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}

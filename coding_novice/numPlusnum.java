public class numPlusnum {
    /*
    정수가 담긴 리스트 num_list가 주어집니다. 
    num_list의 홀수만 순서대로 이어 붙인 수와 
    짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
    = 홀수 이어붙인 수 + 짝수 이어 붙인 수 = 합
     */
        public int solution(int[] num_list) {
            String even = "";
            String odd = "";
            //홀수 값 / 짝수 값 분리하기
            for (int i = 0; i < num_list.length; i++) { 
                if (num_list[i] % 2 == 0) {// 짝수라면 + 배열이니까 이런 식으로 넣어야 함 기억.
                    even += Integer.toString(num_list[i]);
                } else {
                    odd += Integer.toString(num_list[i]);
                }
            }
        return Integer.parseInt(odd) + Integer.parseInt(even);
        //아 valueOf는 String으로 변하게 하는 거임 잘못 판단
    }
}

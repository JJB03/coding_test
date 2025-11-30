public class mul_sum {
    /*
    정수가 담긴 리스트 num_list가 주어질 때, 
    모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 
    1을 크면 0을 return
     */
    public int solution(int[] num_list) {
        int answer = 0;
        int num_list_sum = 0;
        //배열 안의 값들을 계산할 수 있는 문제
        for (int i = 0; i < num_list.length; i++) {
            //일단 돌리고 곱 - 합 제곱 비교해야 함.
            num_list_sum += num_list[i]; 
        } 
        int sum = num_list_sum * num_list_sum; //합 제곱

        int num_list_mul = 1; //아 바보이슈, 0으로 시작하면 0곱하기 나옴
        for (int i = 0; i < num_list.length; i++) {
            //모든 원소들의 곱 만들기, 이게 맞나.
            num_list_mul *= num_list[i];
            /*오답일 시,
            num_list[i] * num_list[i]; 는 제곱이잖아.
             */
        }
        int mul = num_list_mul; //곱

        //두 값을 비교 근데 코드가 너무 길어지는데
        //곱이 합제곱보다 크면 0 작으면 1;
        answer = (mul>sum ? 0 : 1);

        return answer;
    }
}

public class arr_maker1 {
/*
정수 n과 k가 주어졌을 때, 
1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
1 이상 15 이하의 5의 배수는 5, 10, 15 이므로 [5, 10, 15]를 return 합니다. 
*/
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k]; //n/k만큼 들어감.
        //그러니까 n개 정수에서 k 배수 구하기.
        for (int i = 1, idx = 0; i <= n; i++) { //idx는 배열 처음에 채울 위치지정
            if (i % k == 0) {//k의 배수라면 넣자
                answer[idx]= i;
                //그냥 돌리면 되나 했는데 생각해보니 idx에 넣고 다음 위치 지정
                idx++;
            }
        } 
        return answer;
    }
}

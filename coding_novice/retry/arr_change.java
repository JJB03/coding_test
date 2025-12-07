package retry;
public class arr_change {
/*
정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. 
queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
위 규칙에 따라 queries를 처리한 이후의 arr를 return 
  */   
    public int[] solution(int[] arr, int[][] queries) {
        //버블?교환하라인가 이중 교환하라는 줄 알고 중첩 for문 하려 했는데 그게 아닌 듯.
        for (int i = 0; i < queries.length; i++) {
            //queries로 하는 이유는 아마 [][] 라서 그런 듯.
            //바뀌는 거 정의하기. 힌트 int
            int compare1 = queries[i][0];//첫번째 인덱스
            int compare2 = queries[i][1]; //두번째 인덱스

            //힌트2 서로 바꿀 수 있게 넣기.
            int temp = arr[compare1];
            arr[compare1] = arr[compare2];
            arr[compare2] = temp;

        }
        return arr;
    }
}

public class lastNum {
    /*
    정수 리스트 num_list가 주어질 때, 
    마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값
    마지막 원소가 그전 원소보다 크지 않다면 
    마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요. */
        public int[] solution(int[] num_list) {
        int[] answer = {};
        //그전 원소와 비교하는 함수가 필요함.
        //검색해보니 Arrays.equals()메소드 봄. 근데 배열끼리 비교하는 거 같은데
        //compare() 발견.
        for (int i = 0; i < num_list.length; i++) {
            //일단 돌리고 -1? 같은 거 해서 비교하면 되려나
            if (num_list[i]<num_list[i-1]) { //그전 원소보다 같거나 작다면 2배
                
            } else { //그전 원소보다 크다면 그냥 넣기
                
            }
        }

        return answer;
    }
}

/* 예시
num_list	result
[2, 1, 6]	[2, 1, 6, 5]
[5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]
 */

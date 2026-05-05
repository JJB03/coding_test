package retry;
import java.util.Arrays;

public class arr_flus2 {
    /* 배열 길이를 2의 거듭제곱으로 만들기
     * 정수 배열 arr이 매개변수로 주어집니다. 
     * arr의 길이가 2의 정수 거듭제곱이 되도록 
     * arr 뒤에 정수 0을 추가하려고 합니다. 
     * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
     */
    // 왜자꾸 틀리다고 나오는지 의문임. 다시 도전 예정
     public int[] solution (int[] arr){
        int arrlength = 1;
        while (arrlength < arr.length) {
            arrlength *= 2;
        }

        arr = Arrays.copyOf(arr, arrlength);

        return arr;
     }    
    }
//for -> 반복횟수 while -> 조건에 따라

/* 틀렸다고 해서 다시
 public int[] solution(int[] arr) {
   
 // 그러니까 answer이 거듭제곱이면 된다는 거임?
 // 2니까 홀수면 안 되겠네
   // 그러면 answer 길이를 만들자
   int arrlen = arr.length;
   //👽 pow() 는  거듭제곱 계산 임을 기억해야 함. 
   // math.pow일시 double 타입으로 변환
   int pow = 1;
   while (pow < arrlen) {
       //진도가 안 나가서 참고 시작 
       pow *= 2;
   }
   
   return Arrays.copyOf(arr, pow);
*/
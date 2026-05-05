package retry.point_retry;
public class odd_mul {
    /*
    양의 정수 n이 매개변수로 주어질 때,
    n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
    n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 
     */
    public int solution(int n) {
        int answer = 0;
        //원래는 while문으로 돌리려고 했으나 if문으로 전환.
        if (n%2==1) { //홀수라면
            //👩🏼‍💻gpt 도움 받기 0x 1부터 시작
            for (int i = 1; i <= n; i+=2) { //+= 로 2씩 추가
                answer += i;
            }
        }

        if (n%2==0) {//짝수라면, 정수*정수
            //👩🏼‍💻 2부터 시작
            for (int i = 2; i <= n; i+=2) {
                answer += i*i; 
            }
        }
        return answer;
    }

}

/*      비효율적 코드로 폐기, 시간 초과가 뜸.
        public int solution(int n) {
        int answer = 0;
        //if-for 이중 구조로 가려고 했는데 감이 안 잡혀 while문으로 돌입
        //👾while문은 조건반복식
        while (n%2==1){ //n%2 로 했을 시 홀수라면
            //n 이하 홀수 값 구하기.
            int odd = 0;
            //👩🏼‍💻감이 안 잡혀 gpt힘을 빌림
            while (odd <= n) {
                answer += odd;
                odd += 2; //다음 홀수 이동
            } 
        }  

        while (n%2==0){ //n%2 로 했을 시 짝수라면
            //n 이하 짝수 값 구하기.
            int mul = 0;
            while (mul <= n) {
                answer += mul*mul;
                mul += 2; //다음 짝수 이동
            } 
        }

        return answer;
    } */
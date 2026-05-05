public class commonMultiple {
    /* 공배수 구하기
    정수 number와 n, m이 주어집니다. 
    number가 n의 배수이면서 m의 배수이면 1을 아니라면 
    0을 return하도록 solution 함수를 완성해주세요.
     */
        public int solution(int number, int n, int m) {
        int answer = 0;
        //둘 모두의 배수의 경우와 아닐 경우 if문으로
        /* 👩🏼‍💻 오답노트
        ==로 사용 시, 둘 모두 거짓이어도 참이니 && 로 둘 다 맞을 때만 해야함.
         */
        if ((number%n==0) && (number%m==0)) {
            answer = 1;
        } else answer = 0;
        return answer;
    }
}

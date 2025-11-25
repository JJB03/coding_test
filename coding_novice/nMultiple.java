public class nMultiple {
    /*문제 설명
    정수 num과 n이 매개 변수로 주어질 때, 
    num이 n의 배수이면 1을 
    return n의 배수가 아니라면 0을 return하도록 완성해주세요.
     */
    public int solution(int num, int n) {
        //ai 도움 받아 작성 나도 이렇게 쓰도록 노력해야겠음
        return (num%n==0) ? 1:0;
        //나머지가 0으로 딱 떨어진다면 1로 호출
    }
}

//기존에 작성한 코드
 /*        int answer = 0;
        //일단 num / n -> 딱 떨어지면 1, 아니면 0 이니까 if문 사용
        if (num%n == 1) { //👩🏼‍💻오류 발견, /로 하면 몫 구해서 배수 구하는 건 안 됨
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;    */
public class arithmetic_sequence {
    /* 등차수열이 뭔지 부터 알아야 할 듯
    두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
    첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
    이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return
    */
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) { //n따로 만들어서 할까 했는데 그건 아닌 듯
            if (included[i]) { //i가 들어간다면 들어간다면
                //true인 것만 구해야 하는데.
                answer += (a + ( i * d));
            }
        }
        return answer;
    }
}

/*
등차수열이란
a , a+d , a+2d, a+3d로 이뤄진다!
*/
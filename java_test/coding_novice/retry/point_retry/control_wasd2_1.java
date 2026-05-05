package retry.point_retry;
public class control_wasd2_1 {
    //다시 해보기. 이게 더 보기 쉬움
        public String solution(int[] numLog) {
            StringBuilder answer = new StringBuilder();
            //문자열 계속 이어붙이는 용도
        for (int i = 1; i < numLog.length; i++) {
            int compare = numLog[i] - numLog[i-1];
            // 현재 i와 전 값 차이 비교해서 키 확인
            switch (compare) {
                case 1: 
                    answer.append("w");
                    //1이면 w로
                    break;
                case -1:
                    answer.append("s");
                    //-1이면 s로 = s면 -1 로 이동...
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
                default:
                    System.out.println("잘못된 값:" + compare);
                    break;
            }
        }
        return answer.toString();
        //문자열로 변환 시키기.
    }
}

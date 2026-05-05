package retry.point_retry;
public class string_reverse {

    /*
    문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. 
    queries의 원소는 [s, e] 형태로, 
    my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. 
    my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
     */

    public String solution(String my_string, int[][] queries) {
        //가변 가능 문자열 소환 🌟🌟🌟
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] query : queries) {
            int s = query[0]; //시작 인덱스
            int e = query[1]; // 끝 인덱스
            
            //부분 뒤집기
            // S부터 E까지 잘라낸 부분
            String sub = sb.substring(s, e + 1);
            //👩🏼‍💻감싸고 뒤집고 문자열로 변환하기
            String reverse = new StringBuilder(sub)
                                .reverse().toString();
            
            // 다시 문자열 교체
            sb.replace(s, e + 1, reverse);
        }
        //문자열 반환
        return sb.toString();
    }
}

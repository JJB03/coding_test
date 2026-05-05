package retry;
public class string_string {

/*
길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다. 
parts[i]는 [s, e] 형태로, 
my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 
각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 
이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
    public String solution(String[] my_strings, int[][] parts) {
  
        StringBuilder sb = new StringBuilder();
        //s는 시작, e는 끝 인덱스라고 보면 됨.
        //문자열 추출 -> strings에 이어 붙이기.
        for (int i = 0; i < parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            //자르면서 붙이기.
            sb.append(my_strings[i].substring(s, e+1));
                                            //subString은 끝 인덱스를 포함하지 않아서 e+1을 함.
        }
        return sb.toString();
    }
}

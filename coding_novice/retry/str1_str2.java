package retry;
public class str1_str2 {
    /*
     * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
    두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 
    한 번씩 등장하는 문자열을 만들어 return 하는  함수를 완성해 주세요.
     */
        public String solution(String str1, String str2) {
        String answer = ""; //이걸 받는다
        //for문으로 반복시켜서 작성할까? - 비효율적
        // append가 필요함
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i); 
            answer += str2.charAt(i);
        }
        return answer;
    }
    //문자열 코드에 잘 아는 것이 필요함.
    /*
     *  toString - 문자열로 변환
     *  charAt (문자 하나 출력)
     *  subString 하나 자르고 출력, 붙이고 하는 거 중요함
     */
}

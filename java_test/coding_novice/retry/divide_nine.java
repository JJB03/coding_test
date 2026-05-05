package retry;
public class divide_nine {
    /*
    음이 아닌 정수를 9로 나눈 나머지는 
    그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
    이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 
    이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
     */

    //문법 이해 필요함.
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] n_list = number.split("");
        //뭐 어쩌라는 거
        for (int i = 0; i < n_list.length; i++) {
            sum += Integer.parseInt(n_list[i]); //변환시킴
        } answer += sum%9;
        return answer;
    }
}

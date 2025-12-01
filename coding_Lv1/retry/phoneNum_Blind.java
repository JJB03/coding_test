package coding_Lv1.retry;

//vscode-gpt 연동해서 해결한 문제
public class phoneNum_Blind {
    /*
    프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
    전화번호가 문자열 phone_number로 주어졌을 때, 
    전화번호의 뒷 4자리를 제외한 
    나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수
     */

    public String solution(String phone_number) {
        // 전화번호의 길이를 구합니다.
        int len = phone_number.length();

        // 뒷 4자리를 제외한 앞부분과 뒷 4자리를 분리합니다.
        String front = phone_number.substring(0, len - 4);
        String back = phone_number.substring(len - 4);

        // 앞부분의 모든 문자를 '*'로 변경합니다.
        String maskedFront = front.replaceAll(".", "*");

        // 마스킹된 앞부분과 뒷 4자리를 합쳐서 반환합니다.
        return maskedFront + back;
    }
}
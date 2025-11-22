package retry;
public class babbling {
    /*
    머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
    조카는 아직 "aya", "ye", "woo", "ma" 
    네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 
    문자열 배열 babbling이 매개변수로 주어질 때, 
    머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 함수를 완성해주세요.
     */
    public int solution(String[] babbling) {
        int answer = 0;
        //할 수 있는 단어 추가함  
        //babbling 에 넣으면 덮는 거라 안 된다고 함
        String[] bb = {"aya", "ye","woo", "ma"};
        //그럼 각자 1번씩만 할 수 있는 함수
        //반복에 반복? 조건이니까 while문?
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < bb.length; j++) {
                babbling[i] = babbling[i].replaceAll(bb[j], "-");
                /*
                replace란,특정 문자열을 대체하는 것이다.
                relaceAll과 다른 점은 replace는 특정 문자열을 대체하고
                replaceAll은 특정 패턴의 문자열을 대체한다는 것이다.
                ex: replace - 컴퓨터 -> 전부 PC로 대체
                replaceAll - pc 104, pc 105, pc 106 -> 숫자 전부 공백으로
                "-" 넣은 이유는 새로운 문자열로 대체할 때 아예 다른 문자열로 인식해서
                카운트 시 문제가 생길 수 도 있다는 문제인 것 같다(중복 방지)
                자세히는 모르겠어서... 따로 해봐야 할 듯
                */ 
            }
            babbling[i] = babbling[i].replaceAll("-", "");
            //확인 후 "-" 지우는 작업이다.
            if (babbling[i].equals("")) { //bb로 넣을 시 String과 배열의 문제 발동
                //발음 카운트 할 수 있는 것만 찾았다면 + 시킨다.
                answer++;
            }

        }
        return answer;

        //다른 사람들 해석 특이하니 참조하기
        //https://tildacoderecorder.tistory.com/117
    }
    
}

/* 정규식으로 푼 사람 발견해서 코드 업로드 해놓음
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }
        return answer;
    }
 */

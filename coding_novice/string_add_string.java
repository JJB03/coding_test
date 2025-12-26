public class string_add_string {
    /*
    문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. 
    my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 
    순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    my_string	index_list	result
    "cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
    "zpiaz"	[1, 2, 0, 0, 3]	"pizza"
     */
    //String 배열 문제
    public String solution(String my_string, int[] index_list) {

        //가변 문자열 생성
        StringBuilder sb = new StringBuilder();

        //일단 String 을 List에 넣기?
        for (int i = 0; i < index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
            //split는 특정 구분자를 자름 그러니 필요x
        }
        return sb.toString();
    }
}

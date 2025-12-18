public class boolean_test {
    /*
    boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
    다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
    (x1 ∨ x2) ∧ (x3 ∨ x4)
     1      0      1     0
    ∨ = or
    ∧ = and
    Java에서는 ||가 OR, &&가 AND 
     */
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        answer = (x1 || x2) && (x3 || x4);
        return answer;
    }
}

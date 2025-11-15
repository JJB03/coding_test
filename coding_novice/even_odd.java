import java.util.Scanner;
/*
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 
 * 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 */

public class even_odd {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //지금 생각나는 방법은 for 돌리고 그 안에 if 적어서 거르기 -> 엥 for문을 왜 돌려 생각이 틀림
        //switch 문으로 거르기
    
            int even = ( n % 2 );
            if (even == 0) { // 40이면 2와 딱 떨어지니 even이 뜰 수 있음.
                System.out.println(n +" " +"is even");
            } else {
                System.out.println(n + " " + "is odd");
            }
            
        

        try {
            System.out.println("정상작동하였습니다");
        } catch (Exception e) {
            System.out.println("0으론 나눌 수 없습니다.");
        }
    }
    
}

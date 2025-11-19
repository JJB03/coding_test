class str_arr {
    /*
     * 문자들이 담겨있는 배열 arr가 주어집니다. 
     * arr의 원소들을 순서대로 이어 붙인 
     * 문자열을 return 하는 solution함수를 작성해 주세요.
     */
    public String solution(String[] arr) {
        
        //👩🏼‍💻하나의 버퍼를 사용해 문자열 계속 이어붙이는 것
        //객체를 새로 만들지 않아서 유용함 기억하자
        StringBuilder str = new StringBuilder();
        //배열을 빼오는 느낌으로 가야함.
        //그러면 pop을 써야하나? 
        //찾아보니 pop은 스택only 라 append 사용
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
        }
        return str.toString( ); //문자열로 반환
    }

    //String.join 방법도 있으며
    //join은 구분자와 문자열 컬렉션(리스트,배열)을 문자열로 합치는 메서드
    //foreach 문을 사용해서 (x만큼 반복)하는 방법도 있음을 유의
}

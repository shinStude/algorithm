
// /*
// 2. 대소문자 변환
// 설명
// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 
// 입력
// 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
// 문자열은 영어 알파벳으로만 구성되어 있습니다.
 
// 특정 문자열 1개를 입력받고
// 대문자 소문자 판단해서
// if문으로 반전
// */
 
// import java.util.*;
 
// class Main{
//     public String solution(String str){
//         String answer = "";
//         for (char X : str.toCharArray()){
//             if(Character.isLowerCase(X)) answer+=Character.toUpperCase(X);
//             else answer+=Character.toLowerCase(X);
//         }
 
//         return answer;
 
       
//     }
 
//     public static void main(String[] args){
//      Main T = new Main();
//      Scanner kb = new Scanner(System.in);
//      String str = kb.next();
//      System.out.print(T.solution(str));
//     }
// }
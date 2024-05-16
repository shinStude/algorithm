// // 첫 알고리즘 문제 풀이, 
// // 입력받은 문자열에서 대소문자를 무시하고 특정 문자의 출현 횟수를 계산하여 출력하는 문제.
// import java.util.*;

// class Main {
//     // solution 메서드: 문자열에서 대소문자를 무시하고 특정 문자의 출현 횟수를 계산하는 메서드
//     public int solution(String str, char t) {
//         int answer = 0; // 문자 t의 출현 횟수를 저장할 변수 초기화
//         str = str.toUpperCase(); // 문자열을 모두 대문자로 변환
//         t = Character.toUpperCase(t); // 문자 t를 대문자로 변환
//         // System.out.println(str + " " + t); // 디버깅용: 문자열과 대상 문자 출력
//         // 문자열을 순회하며 대상 문자 t의 출현 횟수 계산
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == t) // 대상 문자 t와 현재 문자가 일치하면
//                 answer++; // 출현 횟수 증가
//         }
//         return answer; // 최종 출현 횟수 반환
//     }

//     // main 메서드: 프로그램의 시작점
//     public static void main(String[] args) {
//         Main T = new Main(); // Main 클래스의 인스턴스 생성
//         Scanner kb = new Scanner(System.in); // 표준 입력 스캐너 객체 생성
//         String str = kb.next(); // 문자열 입력 받음
//         char c = kb.next().charAt(0); // 대상 문자 입력 받음
//         System.out.print(T.solution(str, c)); // solution 메서드 호출하여 결과 출력
//     }
// }

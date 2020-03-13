# 조건에 따른 분기문(if/else)

~~~java
class IfTest {                                            // IfTest 클래스 선언
  public static void main (String[] args) {
    int x = 3;                                            // int에 값 (3)를 대입
    if (x==3)  {                                          // 분기문의 시작점(if로 부터, if가 3일 경우)
      System.out.println("x는 3이군요.");
    } else {                                              // 분기문(else, 만약에 3이 아닐 경우)
      System.out.println("x는 3이 아니군요.");            
    }
  System.out.println("이 부분은 무조건 실행됩니다.");
  }
 


결과
% java IfTest
x는 3이군요.
이 부분은 무조건 실행됩니다.
~~~


위의 코드는 조건(x가 3과 같음)이 참인 경우에만 "x는 3이군요"를 출력하는 행을 실행. 
하지만 "이 부분은 무조건 실행됩니다" 부분은 아무 조건 및 제약을 걸지 않았으므로 바로 출력이 가능
따라서 x의 값에 따라 문장 1 개, 아니면 2 개가 출력

조건에 <code>else</code>를 추가하면 "커피가 아직 남아있으면 계속 코딩하고, 그렇지 않으면 안하는 명령을 내릴 수 있다.

~~~java
class IfTest {                                            // IfTest 클래스 선언
  public static void main (String[] args) {
    int x = 2;                                            // int에 값 (2)를 대입
    if (x==3)  {                                          // 분기문의 시작점(if로 부터, if가 3일 경우)
      System.out.println("x는 3이군요.");
    } else {                                              // 분기문(else, 만약에 3이 아닐 경우)
      System.out.println("x는 3이 아니군요.");            
    }
  System.out.println("이 부분은 무조건 실행됩니다.");
  }
 


결과
% java IfTest
x는 3이 아니군요.
이 부분은 무조건 실행됩니다.
~~~

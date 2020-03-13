# (돌리고 돌아가는) Loop statement

<img src = "https://user-images.githubusercontent.com/56021593/76580508-8ba74280-6513-11ea-9e87-aa4e653697f2.JPG">

JAVA에서는 while, do-while, for의 3 가지의 순환 구조가 있다. 
일단 문법 자체는 간단해서 설명을 하자면, 순환문(loop statement)은 어떤 조건(condition)이 만족되기만 하면 순환문 블록(block) 안에 들어있는 
모든 내용이 바로 순환문 블록이며 반복하고자 하는 내용은 그 블록 안에 집어넣으면 된다.

* 순환문에서 가장 중요한(!) 것은 바로 **조건 테스트** 부분. JAVA에서 조건 테스트의 결과는 부울 값(boolean)이다. 즉, 참(true) 또는 거짓(false) 값을
가지게 된다.
<br>
<br>

* 다음과 같은 비교 연산자를 이용하여 변수의 값을 확인함으로써 간단 부울 test를 할 수도 있다.

<code> < (오른쪽보다 작은) </code>
<code> > (오른쪽보다 큰) </code>
<code> == (동치,등호가 2개 들어가야 함) </code>

~~~java
int x = 4;   // x에 4를 대입 
while (x > 3)  {
  // x가 3보다 크기 때문에
  // 순환문 코드가 실행된다.
  x = x - 1; // 이런 조건이 없으면 순환문이 계속 반복되는 현상을 목격할 수 있음
}
int z = 27; // z에 27을 대입
while(z == 17)  {
  // z는 17과 같지 않으므로
  // 순환문 코드는 실행되지 않는다
~~~

~~~ java
public class Loopy                                        // 순환문 예제를 클래스로 만듬
  public static void main (String[] args)  {
    int x = 1;
    System.out.println("순환문 이전")
    while (x < 4)   {                                     // 조건 설정 (x 가 4보다 작으면)
      System.out.println("순환문 내부");                  // 계속 프린트(출력)을 찍어 상태를 알려준다.(ex 코드가 돌고 상태를 알려줌)            
      System.out.println("x의 값은 " + x  + "입니다.");
      x = x + 1;
      }
      System.out.println("여기는 순환문 이후입니다")
~~~
<br>

# 핵심정리 **(Key takeaway)**

* 모든 선언문은 세미콜론(;)으로 끝나야 함
* 코드 블록(code block)은 중괄호 한 쌍에 의하여 정의. <code>{} </code>
* <code>int</code>를 정의할 때 오른쪽과 같이 이름과 형식을 지정해줘야 한다. <code> ** int x; **</code>
* 대입 연산자는 등호 1개로 구성 =
* 동치 연산자는 등호 2개로 구성 ==
* <code> while </code> 순환문에서는 조건 테스트가 **참**이면 그 블록(중괄호 안에 있는 부분)에 있는 것을 모두 실행
* 조건 테스트가 **거짓** 이면 while 순환문 코드 블록은 실행되지 않으며 순환문 블록 바로 뒤에 있는 코드로 넘어감
* 부울 테스트는 괄호 안에 들어간다. <code> while (x==4) { } </code>

# Chapter 01 - About Java (자바를 다시 공부해보자!)



**먼저 Java(programming 언어)는 어떻게 돌아갈까?**<br>
<br>
> (애플리케이션 하나만 만들어서 (파티 초대장) 친구들이 가지고 있는 다양한 장치에서 돌아갈 수 있게 만드는 방법을 생각)
<br>
<br>

1. 소스 (Source)<br>
* Source 코드를 만들어낸다. (이때 정해진 규칙, Java 언어)를 지켜야 한다. </ul>

2. 컴파일러 (Compiler)<br>
* Source 코드를 컴파일러로 처리한다. 컴파일러에서는 오류가 없는지만 확인하고 모든 것이<br> 제대로 돌아가는 경우에만 최종 결과를 출력

3. 결과물(코드)<br>
* 컴파일러에서는 자바 (bytecode)라는 코딩된 문서를 만들어 준다. 자바를 돌릴 수 있는 모든 <br>
장치에서는 이 파일을 뭔가 실행시킬 수 있는 형태로 해석(번역) 할 수 있음.<br>
그리고 컴파일 바이트코드는 플랫폼에 무관하게 사용할 수 있음

4. 가상머신(virtual machine)<br>
* 초대장(코드로 작성 후 컴파일 된) 메세지를 받은 친구들은 물리적인 자바 머신은 없지만 다른<br>
전자제품 안에 돌아가는 가상 자바 머신(Software로 구현)을 가지고 있음<br>
이러한 자바 가상 머신에서 바이트코드로 실행 가능

<br>
<br>

**실제로 자바가 할 수 있는 일** 
<br>
<br>
> (일단 소스 코드를 입력하고 javac 컴파일러로 컴파일한 다음, 컴파일된 바이트코드를 자바가상머신(JVM)에서 실행)
<br>
<br>

```java
import java.awt.*;
import java.awt.event.*;
class Party {
  public void buildinvite() {
    Frame f = new Frame();
    Label l = new Label("Party at Tim's");
    Button b = new Button("You bet");
    Button c = new Button("Shoot me");
    panel p = new Panel();
    p.add(i);
    }  //etc code
}
```

1. 소스 (Source)<br>
* Source 코드를 입력. 그리고 <code>Party.java</code>라는 이름으로 저장 한다. 

```java
%javac Party.java
```

2. 컴파일러 (Compiler)<br>
* javac(컴파일러 애플리케이션)을 실행 후 <code>Party.java</code> 파일을 컴파일. 아무런 오류도 없으면 <code>Party.class</code>라는 새로운 파일 생성

```java
Method Party()
  0 alod_0
  1 invokespecial # 1 <Methodjava.lang.Object()>
  
  4 return

Method void buildinvite()
  0 new #2 <Class java.awt.Frame>
  3 dup
  4 invokespecial #3 <Method java.awt.Frame()>
```

3. 결과물(코드)<br>
* 컴파일된 코드: <code>Party.class</code> <br>

4. 가상머신(virtual machine)<br>
* JVM을 통해 <code>Party.class</code> 파일을 실행. JVM은 bytecode를 해당 플랫폼에서 이해할 수 있는 형태로 해석하여 그 프로그램을 실행


```java
int size = 27;                            // 'size'라는 정수(integer,int) 변수(variable)을 선언하고 27을 대입
String name = "fido";                     // 'name'이라는 문자열(String) 변수를 선언하고 "fido" 라는 값을 대입 
Dog myDog = new Dog(name, size);          // 'myDog'라는 Dog변수를 선언하고 'name', 'size'를 써서 새로운 Dog 객체 만듬
x = size - 5;                             // 27('size'의 값)에서 5를 빼고 'x'라는 변수에 대입
if (x < 15) myDog.bark(8);                // x(22)가 15보다 작으면 개가 8번 짖도록 함

while (x > 3) {                          // x가 3보다 크면 순환문(while loop)을 돌림.
  myDog.play();                          // 강아지가 놀도록 만듬. 즉 (play() method를 실행)
  }                                      // 순환문(loop)이 끝나는 부분 -{}안에 있는 것들이 조건에 따라 반복됨
  
int [] numList = {2,4,6,8};              // 'numList'라는 정수 배열을 선언하고 2,4,6,8을 집어넣음
System.out.print("Hello");               // "Hello"를 출력. 명령행으로 출력예상
System.out.print("Dog: "+ name);         // 명령행에 "Dog:Fido"라고 출력
String num = "8";                        // 'num'이라는 문자열 변수를 선언하고 "8"이라는 값을 대입
int z = Integer.parseInt(num);           // "8" 이라는 문자열을 8이라는 숫자 값으로 변환(parsing).

try{                                     // 뭔가를 시도. 안됄 수도 있음
  readTheFile("myFile.txt");             // "myFile.txt"라는 txt파일을 읽는다.
}                                        // "시도하는 부분이 끝나는 지점. 여러가지를 함께 시도할 수도 있음
catch(FileNotFoundException ex) {        // 시도했던 것이 잘 안 됐을때 쓰이는 부분
  System.out.print("File not found");    // 실패했을 경우에 명령행(Sys.out.print)에 "File not found"를 출력, 파일을 찾을 수 없다는 뜻 
}                                        // 'try' 부분이 잘 안됐을 경우에 실행할 내용이 끝났나 봄
  

```

<h1> 자바 코드의 구조 </h1>
<br>
<br>
<img src = "https://user-images.githubusercontent.com/56021593/76533464-730b3e00-64bb-11ea-8436-f6b1f9dbe648.JPG">

```java
public class dog{


}                  // 클래스(Class)
```
<br>
<br>
1. 소스 코드 파일(.java라는 확장자가 분은 파일)에서는 <code>class</code> 각각 한 개씩을 정의. 클래스는 보통 프로그램의 한 부분이라고 할
수 있지만 아주 작은 애플리케이션 중에는 클래스 단 하나만으로 이뤄진 것도 있다. 클래스는 한 쌍의 중괄호({})안에 들어가야 한다.

<br>
<br>

```java
public class dog{
    void bark() {
   }               //메소드(method)
}                  // 클래스(Class)

```

<br>
<br>
2. 클래스에는 method가 한 개 이상 들어간다. 예를 들어, (개를 나타내는) Dog 클래스에 (짖는 것을 의미하는) bark라는 메소드가 들어갈 수 있으며, 이 메소드에는 개가 짖는 방법을 지시하는 내용이 들어가면 된다. 메소드는 클래스 안에서 (즉, 클래스 전체를 감싸는 중괄호 안에서 선언해야 한다)

<br>
<br>
```java
public class dog{
    void bark() {
     statement1;
     statement2;
   }               
}                  // 선언문
```
<br>
<br>

 3. 메소드를 감싸는 중괄호 안에는 메소드에서 처리할 일을 지시하는 내용이 들어간다. 메소드 코드는 기본적으로 일련의 선언문을 모아놓은 것이므로 지금은 메소드를 일종의 함수나 프로시저와 비슷한 것으로 생각해도 무방.

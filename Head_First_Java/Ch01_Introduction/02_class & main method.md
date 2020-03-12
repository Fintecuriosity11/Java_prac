# <h1> 클래스를 해부해서 자세히 알아보자<h1>

<image src="https://upload.wikimedia.org/wikipedia/commons/d/dd/JvmSpec7.png">

JVM(Java Virtual Machine / 자바가상머신)이 실행 되면 우선 사용자가 명령행에서 지정한 클래스를 살펴봅니다.
그리고 나서 다음과 같은 특별한 메소드를 찾아봅니다.


```java
public static void main (String[] args) {
    // 코드가 들어갈 자리
}
```

이런 메소드를 찾으면 JVM에서는 <code> main</code> 메소드의 중괄호<code>({})</code> 안에 있는 것을 모두 실행시킵니다.
모든 자바 애플리케이션에는 최소한 클래스 한 개가 있어야 하며 적어도 main 메소드 하나가 있어야 합니다. 
(클래스마다 하나씩 아니라 애플리케이션마다 하나!)

<img src="https://user-images.githubusercontent.com/56021593/76542519-778a2380-64c8-11ea-94be-0e5536cbd286.JPG ">

# main이 들어있는 클래스 만들기


<br>

```java
public class MyFirstApp { 
  
   public static void main (String[]args){
    System.out.println("I Rule!");
    System.out.println("The World");
   }
}
```
1. 저장 = MyFirstApp.java
2. 컴파일 = javac MyFirstApp.java
3. 실행
<br>

<img src = "https://user-images.githubusercontent.com/56021593/76542252-12363280-64c8-11ea-8fd1-b8cb1f337f3e.JPG">

Java에서는 모든 것인 **클래스** 안에 들어갑니다. 우선(<code>.java</code> 확장자가 붙어있는) 소스 코드 파일을 입력한 다음 컴파일해서 
(<code>.class</code> 확장자가 붙어있는) 새로운 클래스 파일을 만들면 됩니다. 프로그램을 실행시킨다는 것은 사실 클래스 실행과 동일.

프로그램을 실행시킨다는 것은 JVM(자바가상머신)에 "**"Hello"** 클래스를 불러오고 그 <code>main()</code> 메소드를 시작. 그리고 
<code>main()</code> 메소드에 있는 모든 코드가 실행될 때까지 계속 실행시켜라" 라는 뜻의 명령을 내린다.

프로그램 실행 절차가 시작되는 부분은 바로 <code>main()</code> 메소드입니다.
프로그램이 아무리 커도 (많은 개수의 클래스를 사용하든 상관없이) 프로그램을 실행시키려면 반드시 <code>main()</code> 메소드가 필요
<br>

```java
1. 뭔가를 하는 것
   선언문: 선언, 대입 메소드 호출 등
   
   int x = 3;
   String name = "Dirk";
   x = x * 17;
   System.out.print("x는 "+ x + "입니다.");
   double d = Math.random();
   // 주석(comment)는 이렇게 기록

2. 뭔가 여러 번을 반복 하는 것
   순환문: for and while
   
   while (x > 12) {
      x = x - 1;
   }

   for (int x = 0; x < 10; x = x + 1) {
    System.out.print("x의 값은 "+x+ "입니다.");
   }

3. 조건에 따라 뭔가를 하는 것

   분기문: if/else
if (x == 10) {    
      System.out.print("x는 10이 아닙니다.") 
} else {
      System.out.print("x는 10이 아닙니다.")
}
if ((x < 3) && (name.equals("Dirk"))) {
   System.out.print("Gently") 
   }
   System.out.print("이 선언문은 무조건 실행됩니다.");
   
```

일단 <code> main </code> 안으로 들어가면 (또는 어느 메소드든) 본격적으로 뭔가가 돌아갑니다. 즉 대부분의 프로그래밍 언어에서 
컴퓨터로 하여금 어떤 일을 하게 만드는 모든 일반적인 지시사항은 메소드 안에 들어있습니다.

코드에서는 위와 같이 JVM에서 다음과 같은 것들을 지시할 수 있습니다. 

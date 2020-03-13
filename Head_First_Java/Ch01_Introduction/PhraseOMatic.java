public class PhraseOMatic  {                   // 자동구문 생성기를 클래스로 만듬
  public static void main (String[] args) {
 
 // 3가지 종류의 단어 목록을 만든다. 
  
  String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
                          
  String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "sweep", "back-end", "SQL", "align", "Markup", "static"};
                          
  String[] wordListThree = {"process", "portal", "mission", "business", "math", "statistic", "strategy", "passive", "solution", "space", "paradigm"};
                          
// 각 단어 목록에 단어가 몇 개씩 들어있는지 확인

   int oneLength = wordListOne.length;             // 첫번째 String[] wordListOne에 단어 갯수 계산
   int twoLength = wordListTwo.length;             // 두번째 String[] wordListOne에 단어 갯수 계산
   int threeLength = wordListThree.length;         // 세번째 String[] wordListOne에 단어 갯수 계산
   
// 난수 3 개를 발생

  int rand1 = (int) (Math.random() * onelength);
  int rand2 = (int) (Math.random() * twolength);
  int rand3 = (int) (Math.random() * threelength);
  
// 이제 구문을 생성

  String phrase = wordListOne[rand1] + "  " +
  wordListTwo[rand2] + " " + wordListThree[rand3];
  
  // 구문을 출력
  
  System.out.println ("What we need is a " + phrase);
    }
}    

## 객체(Object)
### 1. 객체
 * 객체란 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성과 기능을 가지고 다른 것과 식별이 가능한 것을 말한다. (ex. 유형, 무형, 개념 등)
### 2. 객체 지향 프로그래밍(OOP, Object-Oriented Programming)
* 프로그램을 개발하는 기법으로 객체들을 만들고 이러한 객체들을 연결해서 프로그램을 완성하는 기법을 객체 지향 프로그래밍이라고 한다.
* 객체 지향 프로그래밍 특성을 지원하는 언어를 객체 지향 프로그래밍 언어라고 한다.
### 3. 객체 지향 프로그래밍의 특징
#### 3.1. 추상화
* 추상화는 객체들이 가진 공통의 특성들을 파악하고 불필요한 특성들을 제거하는 과정을 말한다.
#### 3.2. 캡슐화
* 캡슐화란 객체의 속성(필드)과 기능(메소드)을 하나로 묶고 실제 구현 내용을 감추는 것을 말한다. 
#### 3.3. 상속
* 하나의 객체가 가지고 있는 속성(필드)과 기능(메소드)을 다른 객체가 물려받는 것을 말한다.
#### 3.4. 다형성
* 다형성은 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질을 말한다.
### 4. 클래스
* 클래스는 객체의 특성(속성, 기능)을 정의하는 설계도이다.
* 객체의 속성은 필드를 통해서 정의한다.
* 객체의 기능은 메소드를 통해서 정의한다.
#### 4.1. 객체와 클래스
* 클래스로부터 메모리에 생성된 객체를 인스턴스(Instance)라고 한다.
* 객체(Object)는 프로그램에서 구현할 대상으로 이를 구현하기 위한 설계도가 클래스(Class)이고, 클래스로부터 메모리에 생성된 실체가 인스턴스(Instance)이다.
#### 4.2. 클래스 선언
* 클래스를 선언하는 구문은 `[접근 제한자] [예약어] class 클래스명 { ... }`이다.
* 클래스의 이름은 자바의 식별자 작성 규칙에 따라서 만들어야 한다.
* 소스 파일의 이름은 반드시 선언된 클래스 이름과 같도록 해야 한다.
* 접근 제한자는 public, default 설정이 가능하다.
* 클래스에는 구성 멤버로 필드(Field), 메소드(Method), 생성자(Constructor)가 정의된다.
* 클래스 작성 시 객체 지향 언어의 특징 중 추상화(Abstraction), 캡슐화(Encapsulation)가 적용되어야 한다.
  ``` java
  public class Member {
    // 필드, 생성자, 메소드 정의
    ...
  }
  ```
#### 4.3. 객체 생성
* 객체를 생성하는 구문은 `클래스명 변수명 = new 클래스명();`이다.
* 자바에서 객체는 new 연산자를 사용해서 생성한다.
* new 연산자는 Heap 영역에 객체를 생성하고 객체의 주소값을 리턴한다.
* 객체의 주소값을 참조 타입인 변수에 저장해서 객체를 사용할 수 있다.
  ``` java
  // new 연산자와 클래스의 생성자를 사용해서 객체를 생성한다.
  Member member = new Member();
  ```
### 5. 필드(Field)
* 필드는 객체의 데이터, 상태 등의 속성이 저장되는 공간이다.
* 선언 형태는 변수와 비슷하지만, 필드를 변수라고 부르지 않는다.
* 필드는 생성자와 메소드 전체에서 사용되며 객체가 생성되고 소멸되기 전까지 객체와 함께 존재한다.
#### 5.1. 필드 선언
* 필드를 선언하는 구문은 `[접근 제한자] [예약어] 자료형 변수명[ = 초기값];`이다.
* 필드 선언은 클래스 중괄호 블록 어디서든 존재할 수 있다. 단, 생성자와 메소드 중괄호 블록 내부에는 선언될 수 없다.
* 접근 제한자는 public, private, default, protected 설정이 가능하다.
* 필드의 초기값은 필드 선언 시 주어질 수도 있고, 생략될 수도 있다.
* 초기값이 지정되지 않은 필드는 객체 생성 시 자동으로 기본 초기값으로 설정된다.
  ``` java
  public class Member {
    // 필드 정의
    public String name; // null
    private int age = 20;
    
    // 생성자, 메소드 정의
    ...
  }
  ```
#### 5.2. 필드 사용
* 클래스 외부에서 필드를 사용하려면 클래스로부터 객체를 생성하고 필드를 사용해야 한다.
* 클래스 내부에서 필드는 생성자와 모든 메소드에서 사용이 가능하다.
* 접근 제한자가 public인 필드의 경우 도트(.) 연산자를 사용해서 필드에 접근할 수 있다.
  ``` java
  Member member = new Member();

  // 도트(.) 연산자를 사용해서 필드에 접근
  member.name; // 접근 가능
  member.age; // 에러 발생
  ```
### 6. 생성자(Constructor)
* 생성자는 new 연산자로 호출되는 특별한 메소드로 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다.
* 모든 클래스는 생성자가 반드시 존재해야 하고 생성자를 하나 이상을 가질 수 있다. 
* 생성자와 new 연산자에 의해 힙(Heap) 영역에 객체가 생성되고 생성된 객체의 주소가 리턴된다.
#### 6.1. 생성자 선언
* 생성자를 선언하는 구문은 `[접근 제한자] 클래스명([매개 변수]) { ... }`이다.
* 생성자의 선언은 메서드와 다르게 반환값이 없고 생성자명은 클래스명과 똑같이 지정해 주어야 한다.
* 클래스에 생성자 선언을 생략하면 컴파일러가 내용이 비어있는 기본 생성자(Default Constructor)를 자동으로 추가해 준다.
* 단, 클래스에서 생성자를 한 개라도 명시적으로 선언했다면 컴파일러는 기본 생성자를 추가하지 않는다.
* 생성자도 메소드이기 때문에 오버로딩이 가능하며 오버로딩의 조건은 메소드 오버로딩과 동일하다.
* 생성자 오버로딩을 통해서 여러 개의 생성자를 만들고 객체 생성 시 필요한 생성자를 호출해서 객체를 만들 수 있다.
  ``` java
  public class Member {
    // 필드 정의
    private String name;
    private int age;
    
    // 생성자 정의
    // 기본 생성자
    public Member() {
    }

    // 매개 변수가 있는 생성자 (필드 초기화)
    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
    
    // 메소드 정의
    public String information() {
      return "이름은 " + this.name + ", 나이는 " +  this.age + "살 입니다."
    }
  }
  ```
  ``` java
  Member member1 = new Member(); // 기본 생성자 호출
  Member member2 = new Member("홍길동", 38); // 이름과 나이를 매개값으로 받는 생성자 호출
  ```
### 7. 메소드(Method)
* 메소드는 객체의 기능, 동작에 해당하는 코드 블록({})이다.
* 메소드는 수학의 함수와 비슷하며 호출을 통해 사용한다. 
* 메소드를 호출하게 되면 중괄호 블록에 있는 코드들이 순차적으로 실행한다.
* 메소드는 외부로부터 필요한 값을 전달받을 수도 있고 메소드 실행 후 결과 값을 반환할 수도 있다.
#### 7.1. 메소드 선언
* 메소드를 선언하는 구문은 `[접근 제한자] [예약어] 반환형 메소드명([매개 변수]) { ... }`이다.
* 메소드 선언은 선언부(리턴 타입, 메소드 이름, 매개 변수)와 실행 블록({})으로 구성된다.
* 접근 제한자로는 public, private, default, protected 설정이 가능하다.
* 매개 변수는 메소드가 실행할 때 필요한 데이터를 외부로부터 받기 위해 사용된다. 
* 메소드를 호출한 곳으로 돌아가면서 결과값을 반환하기 위해 return 문을 사용한다.
  ``` java
  public class Member {
    // 필드 정의
    private String name;
    private int age;
    
    // 생성자 정의
    ...
    
    // 메소드 정의
    public String information() {
      return "이름은 " + this.name + ", 나이는 " +  this.age + "살 입니다."
    }
  }
  ```
#### 7.2. 메소드 호출
* 클래스 내부의 다른 메소드에서 호출할 경우에는 메소드 이름으로 호출하면 된다.
* 클래스 외부에서 메소드를 호출할 경우에는 클래스로부터 객체를 생성한 후 메소드를 호출해야 한다. 
* 메소드를 호출하고 리턴 값을 받고 싶다면 변수를 선언하고 대입하면 된다.
* 접근 제한자가 public인 메소드의 경우 도트(.) 연산자를 사용해서 메소드를 호출할 수 있다.
  ``` java
  String info = null;
  Member member = new Member();

  // 도트(.) 연산자를 사용해서 메소드에 접근
  info = member.information();
  ```
#### 7.3. 메소드 오버로딩
* 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것을 메소드 오버로딩(Overloading)이라고 한다. 
* 메소드 오버로딩을 통해서 매개값을 다양하게 받아서 필요한 처리할 수 있다.
* 메소드 오버로딩의 조건은 매개 변수의 타입, 개수, 순서 중 하나가 달라야 한다. 
* 매개 변수 이름만 바꾸는 것은 메소드 오버로딩이 아니다. 또한 리턴 타입만 다르고 매개 변수가 동일한 것도 메소드 오버로딩이 아니다.
  ``` java
  // 오버로딩의 대표적인 예시
  System.out.println(1);
  System.out.println(false);
  System.out.println('A');
  System.out.println("Hello World!");
  ```
#### 7.4. Getter와 Setter 메소드
* 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것이 불가능하다.
* 메소드를 통해서 필드값을 가공한 후 외부로 전달하는 역할을 하는 메소드가 Getter이다.
* 메소드를 통해서 검증된 유효한 값만 데이터로 저장하는 역할을 하는 메소드가 Setter이다.
* 필드 타입이 boolean일 경우에는 Getter는 get으로 시작하지 않고 is로 시작하는 것이 관례이다.
  ``` java
  public class Member {
    // 필드 선언
    private String name;
    private int age;

    // Getter & Setter
    public void setName(String name) {
      // 매개변수의 이름과 필드의 이름이 동일할 경우 this를 사용해서 필드에 접근할 수 있다.
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public void setAge(int age) {
      // 유효한 값만 데이터로 저장되도록 Setter 작성
      this.age = (age >= 1) ? age : 1 ;
    }

    public int getAge() {
      return this.age;
    }
  }
  ```
### 8. 접근 제한자
* 자바에서 제공하는 접근 제한자는 public, protected, default, private 4가지 종류가 있다.
* public 접근 제한자는 외부에서 자유롭게 접근이 가능하다.
* protected 접근 제한자는 같은 패키지 또는 자식 클래스에서만 접근이 가능하다.
* default 접근 제한자는 같은 패키지에 소속된 클래스에서만 접근이 가능하다.
* private 접근 제한자는 외부에서의 접근을 제한하고 선언된 클래스에서만 접근이 가능하다.
  |구분|클래스|패키지|자식 클래스|전체|
  |:--:|:--:|:--:|:--:|:--:|
  |public(+)|O|O|O|O|
  |protected(#)|O|O|O|X|
  |default(~)|O|O|X|X|
  |private(-)|O|X|X|X|
### 9. this
* 객체 내부에서 객체는 자신을 this라고 표현한다.
* 객체 내부에서 다른 멤버에 접근하기 위해 this를 사용한다.
* this는 주로 생성자와 메소드의 매개변수 이름이 필드와 동일한 경우에 매개변수와 필드를 구분하기 위해 사용한다.
#### 9.1. 다른 생성자 호출
* 생성자에서 다른 생성자를 호출할 때 this()를 사용한다. 단, 생성자의 첫 줄에서만 사용해야 한다.
* this()를 통해서 생성자 간에 중복되는 코드를 제거할 수 있다.

  ``` java
  public class Member {
    private String name;    
    private int age;

    public Member() {
      // 생성자의 매개변수 타입과 순서에 맞게 전달해야 한다.
      this("아무개", 0);
    }

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  ```
### 10. 정적(Static) 멤버
* 정적 멤버는 클래스에 고정된 멤버로 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말한다.
* 정적 멤버는 인스턴스에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스 멤버라고도 한다. 
#### 10.1. 정적 멤버 선언
* 정적 멤버를 선언하는 방법은 필드와 메소드 선언 시 static 키워드를 붙여주면 된다.
* 필드를 선언할 때 객체들이 공유할 목적의 데이터라면 정적 필드로 선언한다. 
* 메소드를 선언할 때 메소드 내부에서 정적 멤버를 사용하거나 필드를 사용하지 않는다면 정적 메소드로 선언한다.
  ``` java
  // java.lang에서 제공하는 Math 클래스
  public final class Math {
    public static int max(int a, int b) {
      return (a >= b) ? a : b;
    }

    public static int min(int a, int b) {
      return (a <= b) ? a : b;
    }
    ...
  }
  ```
#### 10.2. 정적 멤버 사용
* 정적 멤버는 객체를 생성하지 않고 클래스 이름과 도트(.) 연산자로 접근한다.
* 정적 메소드에서 객체의 필드나 메소드에 접근할 수 없고 this 키워드를 사용할 수 없다.
* 정적 필드와 정적 메소드는 객체 참조 변수로도 접근이 가능하지만 정적 요소는 클래스 이름으로 접근하는 것이 좋다.
  ``` java
  int max = 0;
  int min = 0;

  max = Math.max(10, 20);
  min = Math.min(10, 20);
  ```
#### 10.3. 초기화 블록(Initialization Block)
* 인스턴스 블록은 필드의 초기화를 수행하는 역할을 한다.
* 인스턴스 블록은 객체 생성 시 생성자보다 먼저 실행된다.
  ``` java
  {
    .....  // 초기화 구문 작성
  }
  ```
* 정적 블록은 정적 필드의 초기화를 수행하는 역할을 한다.
* 정적 블록은 클래스가 메모리로 로딩될 때 자동적으로 실행된다. 
  ``` java
  static {
    .....  // 초기화 구문 작성
  }
  ```
### 11. final 필드와 상수
#### 11.1. final 필드
* final 필드는 초기값이 저장되면 이후 값을 변경할 수 없다.
* final 필드의 초기값은 필드를 선언할 때 명시적으로 지정하는 방법과 생성자를 통해서 지정하는 방법이 있다. 
  ``` java
  public class Member {
    public final String gender;

    // 생성자를 통해 final 필드 초기화
    public Member(String gender) {
      this.gender = gender;
    }
  }
  ```
#### 11.2. 상수(static final)
* final 필드는 한 번 초기화되면 수정할 수 없는 필드지만 객체마다 다른 값으로 초기화될 수 있기 때문에 final 필드를 상수라고 하지 않는다.
* static final 필드는 객체마다 저장되지 않고, 클래스에만 포함되고 한 번 초기값이 저장되면 변경할 수 없기 때문에 static final 필드를 상수라고 한다.
* 상수의 이름은 모두 대문자로 작성하는 것이 관례이고 서로 다른 단어가 혼합된 이름이라면 언더바(_)로 단어들을 구분한다.
  ``` java
  // java.lang에서 제공하는 Math 클래스
  public final class Math {
    public static final double PI = 3.14159265358979323846;
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295;
    ...
  }
  ```

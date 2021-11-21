### 기능 요구 사항

---

- 이 게임은 프로그램이 1에서 9까지 서로 다른 임의의 수 3개를 정하고 이를 플레이어가 맞추는 게임이다.
- 정답을 맞추기 위해 3자리수를 입력하고 힌트를 받는다.
- 힌트는 야구용어인 볼과 스트라이크로 받는데, 같은 자리에 같은 숫자가 있는 경우를 `스트라이크`, 다른 자리에 숫자가 있는 경우를 `볼`로 정한다.
- 같은 숫자가 하나도 없는 경우 힌트로 `낫싱`을 받는다.
    - 예시) 상대방(컴퓨터)의 수가 425일 때, 123을 제시한 경우: 1스트라이크, 456을 제시한 경우: 1볼 1스트라이크, 789를 제시한 경우: 낫싱
- 3자리 숫자가 정답과 같은 경우 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 아래의 프로그래밍 실행 결과 예시와 동일하게 입력과 출력이 이루어져야 한다.

### 입출력 요구사항

---

**입력**

- 입력한 수에 대한 결과를 볼, 스트라이크 갯수로 표시
    - `1볼 1스트라이크`
- 하나도 없는 경우
    - `낫싱`
- 3개의 숫자를 모두 맞힐 경우
    
    ```
    3스트라이크
    3개의 숫자를 모두 맞히셨습니다! 게임 종료
    ```

### 코딩 요구 사항

---

- 기본적으로 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)을 원칙으로 한다
- indent(인덴트, 들여쓰기) 2까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
- 3항 연산자를 쓰지 않는다.
- 가급적이면 반복문보단 스트림을 쓰자 → 들여쓰기 줄일 수 있음.
- 비정상적 입력에 대해서는 IllegalArgumentException을 발생시킨다.
- 요구 사항을 먼저 적고 [readme.md](http://readme.md) 파일로 만든다.
- 요구 사항에 적힌 순서대로 commit 을 한다.
- 요구 사항이 변경되면 문서 변경 또한 커밋.
- commit convention은 뭐 다 알거니까 알아서 하시고
    - [https://gist.github.com/stephenparish/9941e89d80e2bc58a153](https://gist.github.com/stephenparish/9941e89d80e2bc58a153)
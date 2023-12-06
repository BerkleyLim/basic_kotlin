# ver01
- Kotlin의 대한 기본적인 문법과 간단한 사용법을 익혀본다.
- 이 프로젝트에서는 어떻게 사용하는지만 감각을 잡아본다.
- 환경 설정 참조 : https://velog.io/@chris_seed/Kotlin-Visual-Studio-Code%EC%97%90%EC%84%9C-Kotlin-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0


# 설명서

- vscode 기준으로 개발 시 아래 링크 참조 (kotlin까지 환경 설정 할 것!)
  - https://velog.io/@chris_seed/Kotlin-Visual-Studio-Code%EC%97%90%EC%84%9C-Kotlin-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0

- intelliJ에서는 손쉽게 gradle 기반으로 kotlin 설정 가능 (프로젝트 구조는 Java 기반과 유사함)

- test.kt이라는 파일 생성하고 hello world 작성

- 다음은 아래와 같은 명령어로 실행 가능
cd "본인파일경로" && kotlinc test.kt -include-runtime -d test.jar && java -jar test.jar


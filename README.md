# 스프링 마이크로서비스 코딩 공작소

> 각 phase 별로 마지막 커밋을 기록 되어있습니다.

[origin example code](https://github.com/gilbutITbook/080283)

### Environment

- kotlin, spring boot, docker

## How to run

1. docker 로 실행

```shell
> ./run.sh
```

2. eureka 접속
    1. http://localhost:8761/
3. xml 로 application 확인
    1. http://localhost:8761/eureka/apps

---

## Phase 1

> 3. 스프링 부트로 마이크로서비스 구축하기
> 4. 도커
>
> Last Commit - `:memo: README & end Phase 1`

[Blog - 스프링 마이크로서비스 코딩 공작소 (1)](https://hyune-c.tistory.com/entry/%EC%8A%A4%ED%94%84%EB%A7%81-%EB%A7%88%EC%9D%B4%ED%81%AC%EB%A1%9C%EC%84%9C%EB%B9%84%EC%8A%A4-%EC%BD%94%EB%94%A9-%EA%B3%B5%EC%9E%91%EC%86%8C-1)

### 1. licensing-service 구현

- 최소한의 마이크로서비스 구현
- 국제화 생략

### 2. docker-compose & boot script

```shell
> ./run.sh
```

![image](https://user-images.githubusercontent.com/55722186/193564404-2388a203-72f2-446f-88d6-dec7fd60b87a.png)

## Phase 2

> 5. 스프링 클라우드 컨피그 서버로 구성 관리
> 6. 서비스 디스커버리
>
> Last Commit - `:memo: README & end Phase 2`

[Blog - 스프링 마이크로서비스 코딩 공작소 (2)](https://hyune-c.tistory.com/entry/%EC%8A%A4%ED%94%84%EB%A7%81-%EB%A7%88%EC%9D%B4%ED%81%AC%EB%A1%9C%EC%84%9C%EB%B9%84%EC%8A%A4-%EC%BD%94%EB%94%A9-%EA%B3%B5%EC%9E%91%EC%86%8C-2)

### 1. eureka-server 구현

- 서비스 디스커버리를 위한 eureka-server 구현

### 2. docker setting

- 좀 더 적극적인 docker 활용
- docker container 와 localhost 간의 오해에 대해 블로깅

### 3. 환경 변수 관리 by Dockerfile

- 책에는 `스프링 클라우드 컨피그 서버` 를 말하지만 아직까지의 경험상 크게 필요함을 느끼지 못했습니다.
- 대신 환경 변수를 외부에서 관리할 수 있는 Dockerfile 을 활용했습니다.

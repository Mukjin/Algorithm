T = int(input())  # 테스트 케이스 수

for t in range(1, T + 1):
    N = int(input())  # 입력

    result = 0  # 누적 합

    # 1부터 N까지 반복
    for i in range(1, N + 1):
        if i % 2 == 0:
            result -= i  # 짝수는 빼기
        else:
            result += i  # 홀수는 더하기

    print(f"#{t} {result}")  # 출력
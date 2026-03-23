T = int(input())

for t in range(1, T + 1):
    N = int(input())

    visited = set()  # 본 숫자 저장
    k = 1

    while True:
        num = N * k  # 배수

        # 자리수 확인
        for digit in str(num):
            visited.add(digit)

        # 0~9 다 모였으면 종료
        if len(visited) == 10:
            print(f"#{t} {num}")
            break

        k += 1
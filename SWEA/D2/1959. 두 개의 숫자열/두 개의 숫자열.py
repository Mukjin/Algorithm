T = int(input())

for t in range(1, T + 1):
    N, M = map(int, input().split())

    A = list(map(int, input().split()))
    B = list(map(int, input().split()))

    # 항상 A를 짧게 만들기
    if N > M:
        A, B = B, A
        N, M = M, N

    max_value = float('-inf')

    # 슬라이딩
    for i in range(M - N + 1):
        total = 0

        for j in range(N):
            total += A[j] * B[i + j]

        max_value = max(max_value, total)

    print(f"#{t} {max_value}")
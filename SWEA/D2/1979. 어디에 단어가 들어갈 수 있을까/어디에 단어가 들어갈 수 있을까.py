T = int(input())

for t in range(1, T + 1):
    N, K = map(int, input().split())
    puzzle = [list(map(int, input().split())) for _ in range(N)]

    result = 0

    # 1. 가로 탐색
    for i in range(N):
        cnt = 0
        for j in range(N):
            if puzzle[i][j] == 1:
                cnt += 1
            else:
                if cnt == K:
                    result += 1
                cnt = 0
        if cnt == K:  # 줄 끝 처리
            result += 1

    # 2. 세로 탐색
    for j in range(N):
        cnt = 0
        for i in range(N):
            if puzzle[i][j] == 1:
                cnt += 1
            else:
                if cnt == K:
                    result += 1
                cnt = 0
        if cnt == K:
            result += 1

    print(f"#{t} {result}")
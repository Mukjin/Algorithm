T = int(input())
for t in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]
    max_flies = 0
    
    for i in range(N - M + 1):
        for j in range(N - M + 1):
            current_flies = 0
            for r in range(M):
                for c in range(M):
                    current_flies += arr[i + r][j + c]
            if current_flies > max_flies:
                max_flies = current_flies
                
    print(f"#{t} {max_flies}")
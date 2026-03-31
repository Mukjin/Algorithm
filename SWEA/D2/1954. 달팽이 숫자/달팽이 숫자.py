T = int(input())
dx = [0, 1, 0, -1] # 우, 하, 좌, 상
dy = [1, 0, -1, 0]

for t in range(1, T + 1):
    N = int(input())
    arr = [[0] * N for _ in range(N)]
    x, y, d = 0, 0, 0
    
    for i in range(1, N * N + 1):
        arr[x][y] = i
        nx, ny = x + dx[d], y + dy[d]
        
        # 범위를 벗어나거나 이미 숫자가 채워져 있으면 방향 전환
        if nx < 0 or nx >= N or ny < 0 or ny >= N or arr[nx][ny] != 0:
            d = (d + 1) % 4
            nx, ny = x + dx[d], y + dy[d]
        x, y = nx, ny
        
    print(f"#{t}")
    for row in arr:
        print(*row)
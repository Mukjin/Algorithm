T = int(input())
for t in range(1, T + 1):
    arr = [list(map(int, input().split())) for _ in range(9)]
    ans = 1
    
    for i in range(9):
        row = set()
        col = set()
        for j in range(9):
            row.add(arr[i][j])
            col.add(arr[j][i])
        if len(row) != 9 or len(col) != 9:
            ans = 0
            break
            
    if ans == 1:
        for i in range(0, 9, 3):
            for j in range(0, 9, 3):
                grid = set()
                for r in range(3):
                    for c in range(3):
                        grid.add(arr[i+r][j+c])
                if len(grid) != 9:
                    ans = 0
                    break
                    
    print(f"#{t} {ans}")
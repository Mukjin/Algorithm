T = int(input())
for t in range(1, T + 1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    
    # 90도 회전
    deg_90 = list(map(list, zip(*arr[::-1])))
    # 180도 회전
    deg_180 = list(map(list, zip(*deg_90[::-1])))
    # 270도 회전
    deg_270 = list(map(list, zip(*deg_180[::-1])))
    
    print(f"#{t}")
    for i in range(N):
        print("".join(map(str, deg_90[i])), "".join(map(str, deg_180[i])), "".join(map(str, deg_270[i])))
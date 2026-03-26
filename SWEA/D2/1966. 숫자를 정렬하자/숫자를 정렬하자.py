T = int(input())

for t in range(1, T + 1):
    N = int(input())

    arr = list(map(int, input().split()))

    # 정렬
    arr.sort()

    # 출력
    print(f"#{t}", end=" ")
    print(*arr)
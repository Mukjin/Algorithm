T = int(input())
for test_case in range(1, T + 1):
    total = sum(map(int, input().split()))
    print(f"#{test_case} {round(total/10)}")
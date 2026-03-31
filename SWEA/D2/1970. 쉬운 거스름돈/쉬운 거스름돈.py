T = int(input())
money_types = [50000, 10000, 5000, 1000, 500, 100, 50, 10]

for t in range(1, T + 1):
    N = int(input())
    counts = []
    
    for money in money_types:
        counts.append(N // money)
        N %= money
        
    print(f"#{t}")
    print(*counts)
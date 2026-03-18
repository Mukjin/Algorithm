T = int(input())
primes = [2, 3, 5, 7, 11]

for t in range(1, T + 1):
    N = int(input())
    counts = [0] * 5
    
    for i in range(5):
        while N % primes[i] == 0:
            counts[i] += 1
            N //= primes[i]
            
    # 결과 출력 (언패킹 혹은 join 활용)
    print(f"#{t} {' '.join(map(str, counts))}")
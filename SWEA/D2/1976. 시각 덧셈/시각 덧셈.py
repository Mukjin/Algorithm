T = int(input())
for t in range(1, T + 1):
    h1, m1, h2, m2 = map(int, input().split())
    
    total_m = m1 + m2
    add_h = total_m // 60
    final_m = total_m % 60
    
    final_h = (h1 + h2 + add_h) % 12
    if final_h == 0:
        final_h = 12
        
    print(f"#{t} {final_h} {final_m}")
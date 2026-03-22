T = int(input())  # 테스트 케이스 수

for t in range(1, T + 1):
    P, Q, R, S, W = map(int, input().split())  # 입력

    # A회사 요금
    costA = P * W

    # B회사 요금
    if W <= R:
        costB = Q  # 기본요금
    else:
        costB = Q + (W - R) * S  # 초과 요금

    # 더 저렴한 요금 선택
    result = min(costA, costB)

    # 출력
    print(f"#{t} {result}")
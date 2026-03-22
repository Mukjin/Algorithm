def solution(n):
    count = 0  # 순서쌍 개수

    # 1부터 n까지 반복
    for i in range(1, n + 1):
        if n % i == 0:  # 약수인지 확인
            count += 1  # 개수 증가

    return count  # 결과 반환
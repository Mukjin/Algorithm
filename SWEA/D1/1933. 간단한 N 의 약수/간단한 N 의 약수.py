# 정수 N 입력
n = int(input())
# 1부터 N까지 반복하며 검사
for i in range(1, n + 1):
    if n % i == 0:         # 나누어 떨어지면
        print(i, end=' ')  # 약수 i를 출력
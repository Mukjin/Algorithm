# A와 B의 입력을 공백을 기준으로 분리하여 정수로 변환
a, b = map(int, input().split())

# A가 이기는 조건 확인
if (a == 1 and b == 3) or (a == 2 and b == 1) or (a == 3 and b == 2):
    print("A")
else:
    print("B")
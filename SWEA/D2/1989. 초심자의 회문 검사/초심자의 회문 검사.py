T = int(input())  # 테스트 케이스 수

for t in range(1, T + 1):
    s = input()  # 문자열 입력

    # 문자열 뒤집기
    reversed_s = s[::-1]

    # 비교
    if s == reversed_s:
        result = 1  # 회문
    else:
        result = 0  # 아님

    print(f"#{t} {result}")
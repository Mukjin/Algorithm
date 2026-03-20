T = int(input())

for t in range(1, T + 1):
    N = int(input())
    long_string = "" # 길게 뽑아낼 가래떡(문자열) 상자
    
    # 1. 압축 풀어서 하나의 긴 문자열로 만들기
    for _ in range(N):
        char, count = input().split()
        long_string += char * int(count) # 알파벳을 횟수만큼 곱해서 뒤에 붙임
        
    print(f"#{t}")
    
    # 2. 10글자씩 싹둑싹둑 잘라서 출력하기
    for i in range(0, len(long_string), 10):
        print(long_string[i:i+10]) # i번째부터 i+10번째 전까지 잘라서 출력
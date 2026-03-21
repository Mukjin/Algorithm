T = int(input())

# Base64 암호 해독표 (인덱스 0~63)
decode_table = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

for t in range(1, T + 1):
    # 양옆 공백이나 줄바꿈이 섞여 들어오는 것을 방지하기 위해 strip() 사용
    encoded_str = input().strip() 
    
    # 1. 암호화된 글자들을 모두 6자리 이진수(0과 1)로 바꿔서 하나로 쭉 이어 붙이기
    binary_str = ""
    for char in encoded_str:
        value = decode_table.index(char) # 문자가 표에서 몇 번째인지 찾기
        binary_str += format(value, '06b') # 숫자를 6자리 이진수로 변환 (예: '000110')
        
    # 2. 길게 이어진 이진수를 다시 8자리씩 끊어서 원래 글자로 복원하기
    decoded_str = ""
    for i in range(0, len(binary_str), 8):
        byte = binary_str[i:i+8]
        decoded_str += chr(int(byte, 2)) # 이진수를 십진수로 바꾼 뒤 아스키 문자로 변환
        
    print(f"#{t} {decoded_str}")
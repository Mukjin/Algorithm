N = int(input())
result = []

for i in range(1, N + 1):
    s = str(i)
    count = s.count('3') + s.count('6') + s.count('9')
    if count > 0:
        result.append('-' * count)
    else:
        result.append(s)

print(" ".join(result))
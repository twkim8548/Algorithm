n = int(input())

ans = 0
for i in range(1, n + 1):
    s = str(i)
    if not {'2', '3' ,'0'}.issubset(set(s)):
        continue
    tmp = []
    for j in s:
        if j == '2' and (tmp == ['2', '0'] or tmp == []):
            tmp.append(j)
        elif j == '0' and tmp == ['2']:
            tmp.append(j)
        elif j == '3' and tmp == ['2', '0', '2']:
            ans += 1
            break
print(ans)
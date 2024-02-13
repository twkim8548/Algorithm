str = input()
cnt = 0
isOther = False
for i in range(len(str) - 1):
    cnt += 1
    if str[i] != str[i+1]:
        isOther = True
        break

if isOther:
    print(cnt)
else:
    print(cnt + 1)
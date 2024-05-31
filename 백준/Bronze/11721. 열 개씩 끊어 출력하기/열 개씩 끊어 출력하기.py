str = input()

cnt = 0

for i in range(len(str) // 10 + 1):
    print(str[cnt:cnt + 10])
    cnt += 10
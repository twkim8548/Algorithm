map = {}
for i in range(7):
    s = input().split()
    map[s[0]] = int(s[1])


print(sorted(map, key=lambda x: map[x], reverse=True)[0])

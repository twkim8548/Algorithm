map = {}

n = int(input())
for c in input():
    if c != ' ':
        map[c] = map.get(c, 0) + 1


print(max(map.values()))
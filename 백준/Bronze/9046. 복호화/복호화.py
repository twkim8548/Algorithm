import sys

input = sys.stdin.readline

n = int(input())

for i in range(n):
    str = input().strip()
    map = {}

    for c in str:
        if c != ' ':
            map[c] = map.get(c, 0) + 1

    max_map = 0
    for k, v in map.items():
        if v > max_map:
            max_map = v

    ans = []
    for k, v in map.items():
        if v == max_map:
            ans.append(k)

    if len(ans) == 1:
        print(ans[0])
    else:
        print('?')
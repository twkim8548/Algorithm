import sys

input = sys.stdin.readline

n = int(input())

for i in range(n):
    m = int(input())
    type_map = {}
    for j in range(m):
        name, type = input().split()
        if not type in type_map:
            type_map[type] = 1
        else:
            type_map[type] += 1


    ans = 1
    for type in type_map.values():
        ans *= (type + 1)

    print(ans - 1)



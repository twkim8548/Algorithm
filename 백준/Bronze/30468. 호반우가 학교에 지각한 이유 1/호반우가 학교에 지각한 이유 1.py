import sys

input = sys.stdin.readline

STR, DEX, INT, LUK, N = map(int, input().split())
ans = 0
while (STR + DEX + INT + LUK) / 4 < N:
    ans += 1
    STR += 1
print(ans)

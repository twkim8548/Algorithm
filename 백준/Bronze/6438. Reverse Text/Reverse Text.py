import sys

input = sys.stdin.readline
for _ in range(int(input())):
    str = input().strip()
    print(''.join(reversed(str)))
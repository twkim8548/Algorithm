import sys

input = sys.stdin.readline
def factorial_recursive(n):
    return n * factorial_recursive(n-1) if n > 1 else 1

while True:
    ans = 0
    num = input().strip()
    if num == '0':
        break

    for index, c in enumerate(num):
        ans += int(c) * factorial_recursive(len(num) - int(index))
    print(ans)
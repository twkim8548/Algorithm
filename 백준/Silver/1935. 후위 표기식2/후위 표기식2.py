import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
str = input().strip()
arr = list(str)
nums = []
stk = []
for _ in range(N):
    nums.append(int(input()))

def cal(num1, num2, c):
    if c == '+':
        return num1 + num2
    elif c == '-':
        return num1 - num2
    elif c == '*':
        return num1 * num2
    elif c == '/':
        return num1 / num2


for c in str:
    if c != '+' and c != '-' and c != '*' and c != '/':
        stk.append(nums[ord(c) - 65])
    else:
        num1 = stk.pop()
        num2 = stk.pop()
        stk.append(cal(num2, num1, c))
print(f"{stk[0]:0.2f}")

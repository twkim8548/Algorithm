import sys

input = sys.stdin.readline

prefix = []
suffix = []

n = int(input())
m = int(input())

for _ in range(n):
    prefix.append(input().strip())
for _ in range(m):
    suffix.append(input().strip())

for pre in prefix:
    for suf in suffix:
        print(f"{pre} as {suf}")


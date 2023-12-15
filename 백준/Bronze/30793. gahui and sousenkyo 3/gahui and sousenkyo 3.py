import sys

input = sys.stdin.readline

px, rx = map(int, input().split())

vx = px / rx

if vx < 0.2:
    print("weak")
elif vx < 0.4:
    print("normal")
elif vx < 0.6:
    print("strong")
else:
    print("very strong")
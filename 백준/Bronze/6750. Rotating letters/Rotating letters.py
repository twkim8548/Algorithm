import sys

input = sys.stdin.readline

str = input().strip()
"I O S H Z X N"

if len(str.replace("I", "").replace("O", "").replace("S", "").replace("H", "").replace("Z", "").replace("X", "").replace("N", "")) == 0:
    print("YES")
else:
    print("NO")
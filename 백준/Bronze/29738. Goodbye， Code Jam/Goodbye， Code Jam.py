import sys

input = sys.stdin.readline

for i in range(int(input())):
    N = int(input())
    if N <= 25:
        print(f"Case #{i+1}: World Finals")
    elif N <= 1000:
        print(f"Case #{i+1}: Round 3")
    elif N <= 4500:
        print(f"Case #{i+1}: Round 2")
    else:
        print(f"Case #{i+1}: Round 1")


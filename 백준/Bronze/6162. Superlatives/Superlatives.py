import sys

input = sys.stdin.readline

N = int(input())

for i in range(N):
    print(f"Data Set {i+1}:")
    E, A = map(int, input().split())
    if E <= A:
        print("no drought")
    else:
        mega = E / A
        n = 0
        while mega > 1:
            mega /= 5
            n += 1
        print("mega " * (n - 1) + "drought")
    print()

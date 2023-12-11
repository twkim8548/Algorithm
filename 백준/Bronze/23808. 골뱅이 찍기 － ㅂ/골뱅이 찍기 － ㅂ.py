import sys

input = sys.stdin.readline

N = int(input())

for _ in range(2):
    for _ in range(N):
        for _ in range(N):
            print("@", end="")
        for _ in range(N * 3):
            print(" ", end="")
        for _ in range(N):
            print("@", end="")
        print("")
for _ in range(N):
    for _ in range(N * 5):
        print("@", end="")
    print("")
for _ in range(N):
    for _ in range(N):
        print("@", end="")
    for _ in range(N * 3):
        print(" ", end="")
    for _ in range(N):
        print("@", end="")
    print("")
for _ in range(N):
    for _ in range(N * 5):
        print("@", end="")
    print("")
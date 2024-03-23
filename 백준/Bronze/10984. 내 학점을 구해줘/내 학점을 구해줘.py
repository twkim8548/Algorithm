import math

for _ in range(int(input())):
    totC = 0
    totG = 0.0
    for _ in range(int(input())):
        c, g = map(float, input().split())
        totC += c
        totG += c*g
    print(int(totC), round(totG/totC, 1))

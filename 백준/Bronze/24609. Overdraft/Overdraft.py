minimum = 0
tot = 0
for _ in range(int(input())):
    t = int(input())
    tot += t
    if tot < minimum:
        minimum = tot
print(-minimum)
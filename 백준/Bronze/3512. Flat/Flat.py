import sys

input = sys.stdin.readline

n, c = map(int, input().split())
tot_bed = 0
tot_room = 0

cost = 0
for _ in range(n):
    str = input().split()
    num = int(str[0])
    name = str[1]
    if name == "bedroom":
        tot_bed += num
    if name != "balcony":
        cost += c * num
    else:
        cost += c * num/2
    tot_room += num

print(tot_room)
print(tot_bed)
print(cost)
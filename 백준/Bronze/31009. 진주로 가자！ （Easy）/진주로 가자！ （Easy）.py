arr = {}
jinju = 0
tot = 0
for i in range(int(input())):
    des, num = input().split()
    num = int(num)
    if des == 'jinju':
        jinju = num
    arr[des] = num

for k, v in arr.items():
    if v > jinju:
        tot += 1
print(jinju)
print(tot)

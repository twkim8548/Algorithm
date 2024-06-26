n = int(input())
arr = list(map(int, input().split()))

ans = 0
isPush = False
height = 0
for (index, num) in enumerate(arr):
    if index == 0:
        isPush = True
        ans += 1
        height = num
    else:
        if height <= num:
            ans += 1
        height = num


print(ans)

n = int(input())
num = int(input())

arr = list(map(int, input().split()))
arr.sort(reverse=True)

ans = 1
for i in arr:
    if i < num:
        break
    ans += 1
print(ans)

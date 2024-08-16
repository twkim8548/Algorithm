n = int(input())
arr = list(map(int, input().split()))
ans = 0
for i in arr:
    ans += i 
    ans += 8
ans -= 8

print(ans // 24, ans % 24)
    

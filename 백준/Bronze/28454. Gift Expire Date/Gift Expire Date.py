from datetime import datetime

now = datetime.strptime(input(), "%Y-%m-%d")
ans = 0
for i in range(int(input())):
    d1 = datetime.strptime(input(), "%Y-%m-%d")
    if d1 >= now:
        ans += 1
print(ans)
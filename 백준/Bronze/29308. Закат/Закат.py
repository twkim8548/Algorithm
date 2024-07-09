max = 0
ans = ''
for i in range(int(input())):
    money, name, country = input().split()
    money = int(money)
    if country == 'Russia':
        if max < money:
            ans = name
            max = money
print(ans)
str = input()
dic = {}
arr = []
for c in str:
    dic[c] = dic.get(c, 0) + 1

isEven = False
for i in dic.values():
    if i % 2 == 0:
        arr.append(0)
    else:
        arr.append(1)

if len((list(filter(lambda x: x == 0, arr)))) == 0:
    print(1)
elif len(list(filter(lambda x: x == 1, arr))) == 0:
    print(0)
else:
    print(2)

o, alyssa, konari = map(int, input().split())

n = o // alyssa

isAns = False

for i in range(1, o // alyssa + 1):
    for j in range(1, o // konari + 1):
        if alyssa * i + konari * j == o:
            isAns = True

print(+isAns)

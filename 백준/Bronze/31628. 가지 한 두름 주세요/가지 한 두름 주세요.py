board = []

for _ in range(10) :
    board.append(list(map(str, input().split())))

sign = 0
for i in range(10) :
    l = set(board[i])

    if len(l) == 1 :
        sign = 1
        break

if sign == 0 :
    for i in range(10) :
        l = set()
        for j in range(10) :
            l.add(board[j][i])

        if len(l) == 1 :
            sign = 1
            break

if sign == 1 :
    print(1)
else :
    print(0)
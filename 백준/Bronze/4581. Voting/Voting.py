while True:
    str = input()
    if str == '#':
        break
    yCnt = 0
    nCnt = 0
    aCnt = 0
    pCnt = 0
    for c in str:
        if c == 'Y':
            yCnt += 1
        elif c == 'N':
            nCnt +=1
        elif c == 'A':
            aCnt += 1
        elif c == 'P':
            pCnt += 1

    if aCnt >= len(str) / 2:
        print('need quorum')
    else:
        if yCnt > nCnt:
            print('yes')
        elif nCnt > yCnt:
            print('no')
        else:
            print('tie')


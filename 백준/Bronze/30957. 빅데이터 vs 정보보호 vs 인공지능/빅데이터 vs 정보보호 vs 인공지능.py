import sys

input = sys.stdin.readline

N = int(input())
arr = list(input().strip())
bCnt = 0
sCnt = 0
aCnt = 0

for c in arr:
    if c == 'A':
        aCnt += 1
    elif c == "B":
        bCnt += 1
    else:
        sCnt += 1
if aCnt == bCnt and bCnt == sCnt:
    print("SCU")
else:
    if aCnt == bCnt and aCnt > sCnt:
        print("BA")
    elif bCnt == sCnt and bCnt > aCnt:
        print("BS")
    elif aCnt == sCnt and aCnt > bCnt:
        print("SA")
    else:
        if aCnt > bCnt and aCnt > sCnt:
            print("A")
        elif bCnt > aCnt and bCnt > sCnt:
            print("B")
        elif sCnt > bCnt and sCnt > aCnt:
            print("S")

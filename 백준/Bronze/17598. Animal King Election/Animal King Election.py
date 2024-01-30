import sys

input = sys.stdin.readline

lionCnt = 0
tigerCnt = 0
for _ in range(9):
    animal = input().strip()

    if animal == 'Lion':
        lionCnt += 1
    else:
        tigerCnt += 1

if lionCnt >=5:
    print("Lion")
else:
    print("Tiger")
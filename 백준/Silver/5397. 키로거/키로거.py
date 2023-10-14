import sys

input = sys.stdin.readline

for _ in range(int(input())):
    leftArr = []
    rightArr = []
    str = input().strip()
    for key in str:
        if key == "<":
            if len(leftArr):
                rightArr.append(leftArr.pop())
        elif key == ">":
            if len(rightArr):
                leftArr.append(rightArr.pop())
        elif key == "-":
            if len(leftArr):
                leftArr.pop()
        else:
            leftArr.append(key)
    print("".join(leftArr) + "".join(reversed(rightArr)))

import sys

input = sys.stdin.readline

p1, y1, s1 = input().strip().split()
p2, y2, s2 = input().strip().split()
p3, y3, s3 = input().strip().split()
arr = [(p1, y1, s1), (p2, y2, s2), (p3, y3, s3)]


arr.sort(key=lambda x:int(x[1])%100)
for i in range(3):
    print(int(arr[i][1])%100, end="")

print()
arr.sort(key= lambda x:int(x[0]), reverse=True)
for i in range(3):
    print(arr[i][2][0], end="")

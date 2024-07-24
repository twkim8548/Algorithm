import sys
for _ in range(int(input())):
    a = int(sys.stdin.readline())
    t = int(bin(a)[2:])
    if t&(-t) == a:
        print(1)
    else:
        print(0)
from collections import deque

num_case = int(input())
for case in range(num_case):
    input()
    n, m = map(int, input().split())
    sj = deque(sorted(list(map(int, input().split()))))
    sb = deque(sorted(list(map(int, input().split()))))
    while sj and sb:
        if sj[0] >= sb[0]:
            sb.popleft()
        else:
            sj.popleft()
    if sj:
        print("S")
    elif sb:
        print("B")
    else:
        print("C")
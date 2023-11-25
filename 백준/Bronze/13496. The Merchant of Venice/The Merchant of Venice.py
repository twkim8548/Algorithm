N, k = 0, 0

for i in range(int(input())):
    N, S, D = map(int, input().split())
    tot = 0
    for _ in range(N):
        A, B = map(int, input().split())
        if D * S >= A:
            tot += B
    print(f"Data Set {i + 1}:")
    print(tot)
    print()
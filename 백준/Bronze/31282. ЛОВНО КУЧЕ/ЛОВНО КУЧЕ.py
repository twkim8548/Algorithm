N, M, K = map(int, input().split())

if N % (K - M) == 0:
    print(N // (K - M))
else:
    print(N // (K - M) + 1)
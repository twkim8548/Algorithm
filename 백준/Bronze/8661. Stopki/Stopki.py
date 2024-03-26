x, k, a = map(int, input().split())
x %= (k + a)
while True :
    x -= k
    if x < 0 :
        print(1)
        break
    x -= a
    if x < 0 :
        print(0)
        break
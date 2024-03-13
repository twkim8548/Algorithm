def function(n):
    tot = 0
    for i in range(1, n):
        if n % i == 0:
            tot += i
    return tot


for _ in range(int(input())):
    n = int(input())
    if n == function(n):
        print(f"{n} is a perfect number.")
        print()
    elif n > function(n):
        print(f"{n} is a deficient number.")
        print()
    else:
        print(f"{n} is an abundant number.")
        print()
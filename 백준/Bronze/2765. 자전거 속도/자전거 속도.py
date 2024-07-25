PI = 3.1415927
index = 1
while True:
    l, r, s = map(float, input().split())
    if r == 0:
        break
    d = (PI * l * r) / 12 / 5280
    mph = d / (s / 3600)
    print(f"Trip #{index}: {round(d, 2):.2f} {round(mph, 2):.2f}")
    index += 1
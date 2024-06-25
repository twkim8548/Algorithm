for i in range(int(input())):
    b, p = map(float, input().split())
    bpm = 60 * b / p
    print("{:.4f}".format(bpm * (1 - 1 / b)), "{:.4f}".format(bpm), "{:.4f}".format(bpm * (1 + 1 / b)))

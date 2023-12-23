w = int(input())
l = int(input())
h = int(input())

if (min(w, l) >= h * 2) and (min(w,l) * 2 >= max(w,l)):
    print("good")
else:
    print("bad")
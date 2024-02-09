V = 100
max = V

for _ in range(int(input())):
    C = int(input())
    V = V + C
    if max < V:
        max = V
print(max)

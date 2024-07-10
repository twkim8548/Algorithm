isStart = False
cnt = 0
str = input()

start = str.find('U')
end = str.rfind('F')

for _ in range(start):
    print('-', end='')
print('U', end='')
for _ in range(end - start - 1):
    print('C', end ='')
print('F', end='')
for _ in range(len(str) - end - 1):
    print('-', end='')
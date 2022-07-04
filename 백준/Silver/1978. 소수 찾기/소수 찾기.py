N = int(input())
numbers = map(int, input().split())
x = 0
for i in numbers:
    y = 0
    if i == 1:
        continue
    if i == 2:
        x += 1
        continue
        
    for j in range(2, i+1):
        if i % j == 0:
            y += 1
    if y == 1:
        x += 1

print(x)


A = int(input())
B = int(input())
C = int(input())

X = A * B * C
Y = str(X)

for i in range(0, 10):
    count = Y.count(str(i))
    print(count)


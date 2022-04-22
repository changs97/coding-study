n = int(input())

for i in range(1, n):
    print('*'*i+' '*((2*n-2)-((i-1)*2))+'*'*i)

for j in range(n, 0, -1):
    print('*'*j+' '*((2*n-2)-((j-1)*2))+'*'*j)
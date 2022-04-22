n = int(input())

for i in range(n, 0, -1):
    print(' '*((2*n-1-(2*i-1))//2)+'*'*(2*i-1))

for j in range(2, n+1):
    print(' '*((2*n-1-(2*j-1))//2)+'*'*(2*j-1))
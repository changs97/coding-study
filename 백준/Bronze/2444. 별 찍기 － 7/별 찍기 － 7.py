a = int(input())
b = a-1

for i in range(1, a+1):
    print(' '*(a-i)+'*'*((2*i)-1))

for j in range(1, b+1):
    print(' '*j+'*'*(2*b-(1+2*(j-1))))
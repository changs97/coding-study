def swap(n):
    temp = n[0]
    n[0] = n[2]
    n[2] = temp
    return ''.join(n)


a, b = input().split()

# swap
newA = int(swap(list(a)))
newB = int(swap(list(b)))

if newA > newB:
    print(newA)
else:
    print(newB)
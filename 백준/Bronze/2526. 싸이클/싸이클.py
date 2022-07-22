list1 = []
list2 = []
N, P = map(int, input().split())
n = N

while True:
    n = n * N % P 
    if list1.count(n) == 1:
        list2.append(n)
    elif list1.count(n) == 2:
        break
    list1.append(n)

print(len(list2))
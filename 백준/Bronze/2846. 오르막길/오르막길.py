N = int(input())

nList = list(map(int, input().split()))
nList.append(0)
hList = []
subList = []
check = False
for i in range(N):
    if nList[i] < nList[i+1]:
        subList.append(nList[i])
        check = True
    else:
        if check:
            subList.append(nList[i])
            check = False
        if len(subList) > 1:
            hList.append(subList)
        subList = []

pList = []
for j in hList:
    pList.append(j[len(j)-1]-j[0])
if len(pList) > 0:
    print(max(pList))
else:
    print(0)

N = int(input())
numList = []
for i in range(N):
    numList.append(int(input()))

numList.sort()

for j in numList:
    print(j)
sumList = list()
mList = list()
mSum = 0

for i in range(10):
    mSum += int(input())
    sumList.append(mSum)
    mList.append(abs(100-sumList[i]))

tmp = min(mList)
index = mList.index(tmp)

mList.append(1000)

if mList[index] == mList[index+1]:
    index += 1

print(sumList[index])


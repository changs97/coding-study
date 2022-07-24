K = int(input())

mList = list()

for i in range(K):
    n = int(input())

    if n == 0:
        if len(mList) != 0:
            mList.pop()
    else:
        mList.append(n)

print(sum(mList))
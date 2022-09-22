for i in range(3):
    val = input()
    val += ";"
    mList = list()
    mList.append(1)
    a = val[0]
    b = 1

    for j in range(1, len(val)):
        if a == val[j]:
            b += 1
        else:
            mList.append(b)
            b = 1
        a = val[j]

    print(max(mList))
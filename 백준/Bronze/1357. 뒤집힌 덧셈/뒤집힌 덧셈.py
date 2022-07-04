x, y = input().split()


def rev(val):
    if type(val) == int:
        val = str(val)
    val = list(val)
    val.reverse()
    rangeNum = len(val)
    i = 0
    while i < rangeNum:
        if val[i] == "0":
            val.pop(i)
            rangeNum -= 1
            i -= 0
            continue
        else:
            break
        i += 1
    return int("".join(val))


print(rev(rev(x)+rev(y)))
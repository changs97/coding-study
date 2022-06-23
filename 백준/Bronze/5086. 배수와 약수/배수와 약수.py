while True:
    x, y = map(int, input().split())
    if y == 0 or x == 0:
        break
    elif y % x == 0:
        print("factor")
        continue
    elif x % y == 0:
        print("multiple")
        continue
    else:
        print("neither")
        continue




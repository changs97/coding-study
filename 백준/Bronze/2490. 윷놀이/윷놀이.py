a = {"도": "A", "개": "B", "걸": "C", "윷": "D", "모": "E"}
for i in range(3):
    b = sum(list(map(int, input().split())))
    if b == 3:
        print(a["도"])
        continue
    elif b == 2:
        print(a["개"])
        continue
    elif b == 1:
        print(a["걸"])
        continue
    elif b == 0:
        print(a["윷"])
        continue
    elif b == 4:
        print(a["모"])
        continue
    else:
        break
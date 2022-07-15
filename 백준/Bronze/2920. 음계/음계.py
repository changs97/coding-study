n = list(map(int, input().split()))
checkList = [1, 2, 3, 4, 5, 6, 7, 8]
if n == checkList:
    print("ascending")
else:
    checkList.reverse()
    if n == checkList:
        print("descending")
    else:
        print("mixed")
while True:
    test = list(map(int, input().split()))
    test.sort()

    if(test[0]==0 and test[1]==0 and test[2]==0):
        break

    if test[2]**2 == test[0]**2 + test[1]**2:
        print("right")
    else:
        print("wrong")
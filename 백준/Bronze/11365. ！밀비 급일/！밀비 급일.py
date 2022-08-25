while True:
    inputString = input()
    if inputString == "END":
        break

    inputStringToList = list(inputString)
    newInputString = list()

    for i in range(len(inputStringToList)-1, -1, -1):
        newInputString.append(inputStringToList[i])
  
    print("".join(newInputString))

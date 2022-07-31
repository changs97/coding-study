mList = ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

while True:
    char = input()
    count = 0
    if char == '#':
        break
    for i in mList:
        count += char.count(i)
    print(count)
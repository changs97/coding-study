s = input()

check = True

r = len(s) // 2
rIndex = len(s) - 1

for i in range(r):
    if s[i] != s[rIndex]:
        check = False
        break
    rIndex -= 1

if check:
    print("true")
else:
    print("false")
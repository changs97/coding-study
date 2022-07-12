a = list()
for i in range(7):
    a.append(int(input()))

c = list()
for j in a:
    if j % 2 == 1:
        c.append(j)

if len(c) > 0:
    print(sum(c))
    print(min(c))
else:
    print(-1)

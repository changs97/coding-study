S = input()
# ex) b a e k j o o n
A = ('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
          'w', 'x', 'y', 'z')

for i in A:
    count = S.count(i)
    print(count, end=' ')
import sys

class Stack(list):
    def push(self, x):
        self.append(x)

    def pop2(self):
        if len(self) != 0:
            print(self.pop())
        else:
            print(-1)

    def size(self):
        print(len(self))

    def empty(self):
        if len(self) == 0:
            print(1)
        else:
            print(0)

    def top(self):
        if len(self) == 0:
            print(-1)
        else:
            print(self[-1])


stack = Stack()
N = int(sys.stdin.readline().rstrip())

for i in range(N):
    commend = sys.stdin.readline().split()

    if len(commend) < 2:
        if commend[0] == 'top':
            stack.top()
        elif commend[0] == 'size':
            stack.size()
        elif commend[0] == 'empty':
            stack.empty()
        elif commend[0] == 'pop':
            stack.pop2()
    else:
        data = commend[1]
        stack.push(data)

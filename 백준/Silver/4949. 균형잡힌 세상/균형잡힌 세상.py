from collections import deque
import sys


class Stack(deque):
    def addStack(self, x):
        self.append(x)

    def popStack(self):
        return self.pop()

    def getTop(self):
        if len(self) != 0:
            return self[-1]
        else:
            return None


stack = Stack()

while True:
    stack = Stack()
    read = sys.stdin.readline().rstrip()
    if read == '.':
        break

    b = True

    for i in read:
        if i == '.' and len(stack) != 0:
            b = False
            break

        if i == '(' or i == "[":
            stack.addStack(i)
            continue
        elif i == ')':
            top = stack.getTop()
            if top == '(':
                stack.pop()
                continue
            else:
                b = False
                break
        elif i == ']':
            top = stack.getTop()
            if top == '[':
                stack.pop()
                continue
            else:
                b = False
                break

    if b:
        print('yes')
    else:
        print('no')

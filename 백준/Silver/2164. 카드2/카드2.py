import sys


class Queue(list):
    __head = 0
    __tail = 0

    def push(self, x):
        self.append(x)
        self.__tail += 1

    def queue_pop(self):
        if self.__head != self.__tail:
            data = self[self.__head]
            self.__head += 1
            return data

    def size(self):
        return self.__tail - self.__head

    def front(self):
        if self.__head == self.__tail:
            return -1
        else:
            return self[self.__head]

    def back(self):
        if self.__head == self.__tail:
            return -1
        else:
            return self[self.__tail - 1]


queue = Queue()

N = int(sys.stdin.readline().rstrip())

for i in range(1, N+1):
    queue.push(i)

while queue.size() != 1:
    queue.queue_pop()
    card = queue.queue_pop()
    queue.push(card)

print(queue.front())

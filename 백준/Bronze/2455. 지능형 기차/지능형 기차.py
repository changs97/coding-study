person_count_list = list()
person_count_list.append(0)
for i in range(4):
    person_out, person_in = map(int, input().split())
    person_count_list.append(person_count_list[i] + person_in - person_out)
print(max(person_count_list))
def solution(nums):
    size = len(nums) / 2
    dic = dict()

    for i in nums:
        try:
            dic[i] += 1
        except:
            dic[i] = 0

    dic_size = len(dic.keys())

    if dic_size > size:
        answer = size
    else:
        answer = dic_size

    return answer

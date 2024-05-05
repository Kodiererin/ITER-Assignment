#
#
# import random
# from enum import Enum
#
#
# class Kid(Enum):
#     girl = 0
#     boy = 1
#
# def randomKid():
#     return random.choice([Kid.boy.value , Kid.girl.value])
#
# print(randomKid())
# b = 0
# g = 0
# bg = 0
#
# for _ in range(1000):
#     boy = randomKid()
#     girl = randomKid()
#     if(boy==1 and girl==0):
#         b+=1
#     elif (boy==0 and girl==1):
#         g+=1
#     else:
#         bg+=1
#
# print(b)
# print(g)
# print(bg)
#
# print(bg/g)
#
#
#
#
#
#
# # x = [1,2,3,1,2,1,3,4,5,]
# #
# # from collections import Counter
# #
# # y = Counter(x)
# # print(y)
# #
# # maxData = max(y.values())
# # # print(maxData)
# #
# #
# # for i , j in y.items():
# #     if j==maxData:
# #         print(i)








from collections import Counter

for i in Counter([1,2,1,1,2,3,4,2,1,1,1,1,1]).items():
    print(i[1])
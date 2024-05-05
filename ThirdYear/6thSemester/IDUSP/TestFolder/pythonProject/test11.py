# # a = [1,2,3,4,5,6,7,8,9]
# # data = {}
# #
# # for i,j in enumerate(a):
# #     data.update({j:a[i]})
# #
# # print(data)
#
#
from collections import  Counter
#
# count = Counter(a=1,b=2,c=3,d=4,e=5,f=6)
# print(count.items())
#
# for letter,c in count.most_common():
#     print(letter,c)


from collections import Counter

# a = [[10,20,30],[10,20,30]]
# b = Counter(map(tuple, a))  # Convert sublists to tuples
# c = sorted(b, sum(b.values()), reverse=True)
# print(c)
#
#


list_of_lists = [[10, 20, 30], [5, 15, 25], [40, 30, 20], [5, 15, 25]]

# Sort the list of lists based on the sum of elements in each sublist
sorted_list = sorted(list_of_lists, key=lambda x: sum(x), reverse=True)

print(sorted_list)

# # # # Binary Search in Python
# # #
# # #
# # # # Binary Search using Recursion
# # # def binarySearch(low,high,arr,target):
# # #     if(low<high):
# # #         mid = (low+high)//2
# # #         if(target==arr[mid]):
# # #             return mid
# # #         elif(target<arr[mid]):
# # #             return binarySearch(low,mid+1,arr,target)
# # #         else:
# # #             return binarySearch(mid-1,high,arr,target)
# # #     return -1
# # #
# # # # Binary Search without Recursion
# # #
# # # m = 'I am okay' > 'I am not okay'
# # # print(m)
# # #
# # # a = (1,2,3,4)
# # # b = {1,2,3,4}
# # # c = [1,2,3,4]
# # #
# # # print(type(a))
# # # print(type(b))
# # # print(type(c))
# # #
# # # x,y,z = 1,2,3
# # # print(x," ",y," ",z)
# # #
# # # x = x^y^z
# # # y = x^y^z
# # # z = x^y^z
# # # x = x^y^z
# # #
# # #
# # # print(x," ",y," ",z)
# # #
# # # x = x^y^z
# # # y = x^y^z
# # # z = x^y^z
# # # x = x^y^z
# # # print(x," ",y," ",z)
# # #
# # #
# # # a = [1,2,3,1,2,43,23]
# # #
# # # def printMax(a):
# # #     i=0
# # #     getmax = 0
# # #     while(i<len(a)):
# # #         getmax = max(getmax,a[i])
# # #         i=i+1
# # #     print(getmax)
# # #
# # #
# # # printMax(a)
# # #
# # #
# # # print(eval('7+9-9*9 '))
# # #
# # #
# # #
# # # # String Slicing
# # #
# # # x = "abcde"
# # # m = -1*(len(x))
# # # print(x[-1:-6:-1])
# # #
# # #
# # #
# # # c = 'abaaacaabc'
# # # m=''
# # # for i in c:
# # #     if(i not in m):
# # #         ctr=0
# # #         j=0
# # #         while(j<len(c)):
# # #             if(c[j]==i):
# # #                 ctr=ctr+1
# # #             j=j+1
# # #         m = m+i
# # #         print(i,ctr,sep ='--')
# # #
# # #
# # #
# # # import re
# # # myNameEmail = ["ujjwal@whoisujjwal.live","rajhota99@soa.ac.in"]
# # #
# # # print(re.findall('[ .\w]+',myNameEmail[0]))
# # # print(re.findall('[.\w]+',myNameEmail[1]))
# # #
# # #
# # # m = 'aaaaeeeeeqqqtttcccsssiou'
# # # n = re.findall('[aeiou]+',m)
# # # print(n)
# # #
# # #
# # #
# # #
# # # myGlob = 100
# # # def g():
# # #     global  myGlob
# # #     myGlob = 200
# # #     print(myGlob)
# # #     x = 10
# # #     def gg():
# # #         # print(x) error
# # #         global myGlob
# # #         myGlob = 999
# # #         print(myGlob)
# # #         nonlocal x
# # #         x = 20
# # #         print(x)
# # #
# # #         print(x)
# # #     print(x)
# # #     print(myGlob)
# # #     gg()
# # #
# # # print(myGlob)
# # # g()
# # # print(myGlob)
# # #
# # #
# # # # 100 200 10 200 999 20 20 999
# # #
# # #
# # # # Using FindIter
# # #
# # # m = "Dancing Loving Caring Ujjwall lHugging Kumar Teasing"
# # # n = re.finditer(r"([.\w]+ing)",m)
# # # for i in n:
# # #     print(i.group())
# # #
# # #
# # #
# # # # x = set(list(input("Enter Your Address")))
# # # y = list(input("Enter Your Name"))
# # #
# # #
# # # print(y)
# #
# #
# # m = {1,1, 2,3,4,5}
# # n = {3,4,5,6,7}
# #
# # # print(m-n)
# # # print(n-m)
# # # print(m+n)
# # print(m.intersection(n))
# # print(n.intersection(m))
# # print(m.union(n))
# # print(m.symmetric_difference(n))
# # print(n.symmetric_difference(m))
# # print(m.symmetric_difference(m))
# # print(m.intersection(n))
# # print()
#
# #
# # list1 = [1,2,3,4,5]
# #
# # print(list1.pop())
# # print(list1.remove(2))
# # print(list1)
# # print(list1)
#
# #
# # x = 'Hello'
# #
# # print(x[-1:-6:-2])
# #
# #
# # h = {"1":"a","2":"b"}
# # h["1"].join("v")
# # print(h)
# #
# #
# # m = {1,2,3,4}
# # n = {4,5,6,7}
# #
# # print(m)
#
#
# m = {"1": "a", "2": "b"}
#
# for i in m.items():
#     print(i)
#
#
# from functools import reduce
#
# list2 = [1, 2, 3]
#
# y = map(lambda x,y : x*2 + y , list2)
# print(y)
#
#
# import re
#
# m = "ujjwal   Kumar"
#
# print(re.findall(r'[^a]+',m))
#
#
# print([x for x in list2 if x>1])









import re
m = "Ujjjjjwal Kumar 1234456"

print(re.findall(r'[a-zA-Z]+',m))




m = [1,2,3]

m.append(10)
print(m)
m.pop()
print(m)

m = {1,2,4}

m.add(45)
print(m)


m = "ujjwal"
print(m[-3::-1])

n = "Kumar   Kumar Kumar"
print(len(re.findall(r'[.\w]+',n)))


# Pattern Matchign

m = "Hellowing Worlding Kemchoing Hellllloooiiinnng"

o = re.finditer(r'[.\w]+ing',m)
for i in o:
    print(i.group())



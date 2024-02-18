address = 'B-6, Lodhi road, Delhi'
list1 = [1, 2, 3]
list2 = ['a', 1, 'z', 26, 'd', 4]
tuple1 = ('a', 'e', 'i', 'o', 'u')
tuple2 = ([2,4,6,8], [3,6,9], [4,8], 5)
dict1 = {'apple': 'red', 'mango': 'yellow', 'orange': 'orange'}
dict2 = {'X': ['eng', 'hindi', 'maths','science'], 'XII': ['english', 'physics',
'chemistry', 'maths']}

print(list[3])
print(list1*2)
list1[3] = 4
print(list1 * 2)
# print(min(list2))
print(max(list1))
print(list(address))
list2.extend(['e', 5])
print(list2)
list2.extend(['e', 5])
print(list2)

names = ['rohan', 'mohan', 'gita']
names.sort(key=len)
print(names)

list3 = [(x * 2) for x in range(1, 11)]
print(list3)


del list3[1:]
print(list3)

list4 = [ x+y for x in range(1,5) for y in range(1,5)]
print(list4)

tuple2[3] = 6
print(tuple2)


tuple2.append(5)
print(tuple2)

t1 = tuple2 +(5)
print(t1)


','.join(tuple1)


list(zip(['apple', 'orange'], ('red','orange')))
print(list)


dict2['XII']
print(dict2['XII'])

dict2['XII'].append('computer science')
print(dict2)



'red' in dict1

list(dict1.items())
print(list)

list(dict2.keys())
print(list)

dict2.get('XI', 'None')
print(dict2)

dict1.update({'kiwi':'green'})
print(dict1)
print(dict1)
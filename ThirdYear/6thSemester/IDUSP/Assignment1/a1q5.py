#
# Read a lists named StringList1 containing strings from the key board. Generate a string MStringList1
# that contains all items of StringList1 that are repeated twice or more number of times and print this
# list. By observing the outcome of MStringList1 perform the following tasks:
# a. Check wather an item of MStringList1 occurs even number of times or odd number of times in
# StringList1.
# b. Remove the i
# th (i ≥ 2) occurrence of a given word in a StringList1


def MStringList1(data):
    list = []
    for words in data:
        i = 0
        w = words

        for word in data:
            if(words.lower() == w.lower()):
                i = i+1
            if(i>=2):
                # print(word)
                list.append(word)
                i=0
    print(list)


MStringList1(data = ["apple", "banana", "Apple", "banana", "Cherry", "cherry", "grape", "banana"])

# Read a lists named StringList1 containing strings from the key board. Generate a string MStringList1
# that contains all items of StringList1 that are repeated twice or more number of times and print this
# list. By observing the outcome of MStringList1 perform the following tasks:
# a. Check wather an item of MStringList1 occurs even number of times or odd number of times in
# StringList1.
# b. Remove the i
# th (i ≥ 2) occurrence of a given word in a StringList1


def remove_second_occurrence(word, word_list):
    count = 0
    for i, w in enumerate(word_list):
        if w == word:
            count += 1
            if count == 2:
                del word_list[i]
                break


StringList1 = input("Enter strings separated by spaces: ").split()

MStringList1 = []
for word in StringList1:
    if StringList1.count(word) >= 2 and word not in MStringList1:
        MStringList1.append(word)

print("MStringList1:", MStringList1)

for word in MStringList1:
    count = StringList1.count(word)
    print(f"{word} occurs {count} {'time' if count == 1 else 'times'} in StringList1.")
    if count % 2 == 0:
        print(f"{word} occurs even number of times.")
    else:
        print(f"{word} occurs odd number of times.")
    remove_second_occurrence(word, StringList1)

print("Updated StringList1 after removing the second occurrences:")
print(StringList1)

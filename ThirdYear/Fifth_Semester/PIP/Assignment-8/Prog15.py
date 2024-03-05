def remove_adjacent_duplicates(lst):
    if len(lst) <= 1:
        return lst

    if lst[0] == lst[1]:
        # Skip all adjacent duplicates
        while len(lst) > 1 and lst[0] == lst[1]:
            lst.pop(0)
        return remove_adjacent_duplicates(lst)
    else:
        # Keep the current element and process the rest of the list
        return [lst[0]] + remove_adjacent_duplicates(lst[1:])

# Example usage:
original_list = [1, 2, 4, 4, 5, 7, 7, 7, 8, 8, 9, 7]
result_list = remove_adjacent_duplicates(original_list)
print(result_list)

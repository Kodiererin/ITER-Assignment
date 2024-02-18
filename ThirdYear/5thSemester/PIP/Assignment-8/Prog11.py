def generate_binary_strings(n: int) -> list[str]:
    if n == 0:
        return ['']
    else:
        prev_strings = generate_binary_strings(n - 1)
        new_strings = []
        for string in prev_strings:
            new_strings.append(string + '0')
            new_strings.append(string + '1')
        return new_strings

print("Hello World")
print(generate_binary_strings(3))
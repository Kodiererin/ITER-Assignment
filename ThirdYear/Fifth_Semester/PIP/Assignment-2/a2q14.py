# 14. Write a function main that accpets inputs from the user interactively and converts the lowercase alphabet to ussercass using the function upperCase


def upperCase(x):
    assert 97 <= ord(x) <= 122, "The input is not a lowercase alphabet or a word."
    return chr(ord(x) - 32)



def main():
    if __name__=='__main__':
        print(upperCase(input("Enter A Character ")))

main()
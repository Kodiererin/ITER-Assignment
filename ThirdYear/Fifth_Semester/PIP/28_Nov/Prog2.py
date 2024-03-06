
# WAPS to input 5 cricket players name and score and store them in a dictionary


cricket = {}
y=input("Enter the Number of Cricketers")

for i in range(int(y)):
    key,value= input("Enter Cricker Name ") ,int(input("Enter Cricketer Score "))
    #cricket.update({key:value})
    cricket[key]= value

    
x = input("Enter the Cricketer Name that You want to search ")
print(cricket.get(x))

print(cricket)

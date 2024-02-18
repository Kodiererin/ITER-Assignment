def sum(a):
   if (a==0):
       return 0
   else:
        return a+sum(a-2)

    
print(sum(6))

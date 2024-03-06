def test1():
    test1.a = 10
def test2():
    test1.a = 8
    print('Inside function test2 ', test1.a)
test2()
print('Outside function test2 ', test1.a)
test1()


'''>>> 
= RESTART: /media/student/ESD-USB/ITER-Assignment/ThirdYear/Fifth_Semester/PIP/Assignment-5/A5_M4.py
Inside function test2  8
Outside function test2  8
>>> '''

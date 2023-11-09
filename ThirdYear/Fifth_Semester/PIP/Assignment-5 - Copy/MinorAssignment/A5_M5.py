a = 4
def f():
    a=5
    def g():
        nonlocal a
        a = 10
        print('Inside function g, ', 'a=', a)
        def h():
            nonlocal a
            a = 20
            print('Inside function h, ', 'a=', a)
        h()
    g()

f()

'''>>> 
= RESTART: /media/student/ESD-USB/ITER-Assignment/ThirdYear/Fifth_Semester/PIP/Assignment-5/A5_M5.py
Inside function g,  a= 10
Inside function h,  a= 20
>>> '''

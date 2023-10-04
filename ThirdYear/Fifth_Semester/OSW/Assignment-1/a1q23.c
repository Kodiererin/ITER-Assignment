/*23. Evaluate the expressions;
Assume A, B, num, xy, f, t, p, q, r
are int type variables;
(1) A=10+(num=2)*3;
(2) B +=(xy *=3); [here xy=10]
(3) x +=(f=(t*=20)); [here x=20, t=10]
(4) p=q=r=100;*/

#include <stdio.h>
int main(){
    printf("%d\n",(10+2*3));
    int B;
    int xy = 10;
    B+=(xy*=3);
    printf("%d\n",B);

    int x = 20;
    int t = 10;
    int f;
    x +=(f=(t*=20));
    printf("%d\t",x);


    int p;
    int q;
    int r;
    p=q=r=100;
    printf("%d\t%d\t%d",p,q,r);
        return 0;
}
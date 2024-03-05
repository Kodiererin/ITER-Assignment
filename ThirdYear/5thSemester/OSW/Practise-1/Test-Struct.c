#include<stdlib.h>
#include<stdio.h>

struct Ujjwal{
    int age;
    int regNo;
    // char college[20];
};
int main(){
    struct Ujjwal u1;
    struct Ujjwal *u2 = (struct Ujjwal*)malloc(10*sizeof(struct Ujjwal));
    u1.age = 22;
    u1.regNo = 213131;
    // strcpy(u1.college,"SOA");
    for(int i=0 ; i<10 ; i++){
        (u2+i)->age = i;
        (u2+i)->regNo = i;
    }
    
     for(int i=0 ; i<10 ; i++){
        printf("%d %d \n",u2[i].age,(u2+i)->regNo);
    }
    
    return 0;
}
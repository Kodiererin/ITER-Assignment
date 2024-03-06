//  11. Write a menu driven program which has following options:
//  1. Factorial of a number.
//  2. Prime or not
//  3. Odd or even
//  4. Exit
//  Use input-validation loop and program should terminate only when option 4 is selected

#include<stdio.h>
int main(){
    while(1){
        printf("Enter 1 - For Factorial Of Number \n");
        printf("Enter 2 - For Prime or Not Of Number \n");
        printf("Enter 3 - For Odd or Even Of Number \n");
        printf("Enter 4 - Exit \n");
        int choice;
        scanf("%d",&choice);
        switch(choice){
            case 1 : {
                printf("Enter the Number ");
                int num;
                scanf("%d",&num);
                for(int i=1 ; i<num ; i++){
                    if(num%i==0){
                        printf("%d ",i);
                    }
                }
                break;
            }
             case 2 : {
                printf("Enter the Number ");
                int num;
                scanf("%d",&num);
                int i=1 ;
                for(i=1; i<num ; i++){
                    if(num%i==0){
                        printf("Not Prime");
                    }
                }
                if(i==num){
                    printf("The Number is Prime ");
                }
                break;
            }

            case 3 : {
                printf("Enter the Number ");
                int num;
                scanf("%d",&num);
                if(num%2==0){
                    printf("The Number is Odd");
                }else{
                    printf("The Number is Even");
                }
            }
            case 4 : {
                printf("Exiting.........");
                return 0;
            }
        }
    }
    return 0;
}

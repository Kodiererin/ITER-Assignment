/*5. Write a nested if statement for the decision diagrammed in the accompanying flowchart. Use a
multiple-alternative if for intermediate decisions where possible.*/


#include<stdio.h>
int main(){
    printf("Enter The PH of your Solution?");
    int ph;
    scanf("%d",&ph);
    if(ph>7){
        if(ph==7)
            printf("Neutral");
        else if(ph>2)
            printf("Acidic");
        else
            printf("Very Acidic");
    }
    else{
        if(ph<12)
            printf("Alkaline");
        else
            printf("Very Alkaline ");
    }
    return 0;
}
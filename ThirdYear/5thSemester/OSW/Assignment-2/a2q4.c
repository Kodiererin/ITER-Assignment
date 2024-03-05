/*4. Write an interactive program that contains an if statement that may be used to compute the area of a
square ( area = side2
) or a circle ( area = pi × radius2
) after prompting the user to type the first
character of the figure name (S or C).*/

#include<stdio.h>
int main(){
    char c;
    printf("Enter Your Choice\nS-Area of Square\nC- Area of Circle\n");
    scanf("%c",&c);
    float area;
    printf(c=='S'||c=='s'?"Enter The Side of Square\n":"Enter The Radius of the Circle\n");
    int sideOrRadius;
    scanf("%d",&sideOrRadius);
    area = (c=='S'||c=='s')?sideOrRadius*sideOrRadius:3.14*sideOrRadius*sideOrRadius;
    printf("%Area = .2f",area);
    return 0;
}
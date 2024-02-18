//  8.Writeaprogramtoprocessacollectionofscoresobtainedbystudentsofaclassofcertainstrength.
//  Yourprogramshouldcountandprint thenumberofstudentswithGradeA(80andhigher),Grade
//  B(65-79),GradeC(40-64)andGradeF(39andbelow).Ensurethattheenteredscoresmustremainin
//  between0and100(inclusive).Testyourprogramonthefollowingdata:
//  8
//  23676512
//  89321745
//  41586078
//  82881922
//  70884189
//  78797268
//  74597581
//  44592312
//  a. Readthesameinputfromafileusinginputredirection.Firstlinerepresentsnumberofstudents
//  andrestofthelinesrepresentthemarksobtainedbyeachstudentin4subjects.
//  b. Displayaveragescoreandgradeofeachstudent informofatable.(Hint:Averagescoreofa
//  student=(m1+m2+m3+m4) 4 wheremi i=1234representmarkinsubjectiand
//  calculategradeaccordingtothespecifiedconditiongivenabove

#include <stdio.h>

int main(){
    int totalMarks = 0;
    int marks = 0;
    int studentMarks = 0;
    int students = 0;
    int subjects = 4;
    int averageMarks = 0;
    printf("Enter Total No Of Students \n");
    scanf("%d",&students);
    
    for(int i=0 ; i<students  ; i++){
        for(int j=0 ; j<students ; j++){
            printf("Enter Students Marks \n");
            scanf("%d\n",&marks);
            totalMarks+=marks;
        }
        averageMarks = totalMarks/4;
        printf("Average Marks = \n",averageMarks);

       if(averageMarks<=39 && averageMarks>=0){
        printf("Obtained Grade : F");
       }else if(averageMarks>39 && averageMarks<=64){
            printf("Obatined Grade : C");
       }else if(averageMarks>64 && averageMarks<=79){
            printf("Obatined Grade : B");
       }else if(averageMarks>79 && averageMarks<=100){
            printf("Obatined Grade : A");
       }else{
        printf("Invalid Score");
       }
    }

    return 0;
}
#include<string.h>
#include<stdlib.h>
#include<stdio.h>


int main(int argc , char *argv[]){
    // for(int i=0 ; i<argc ; i++){
    //     printf("%s\n",argv[i]);
    // }
    // char s[100];
    // strcpy(s,argv[1]);
    // char d[10];
    // strcpy(d,argv[2]);

    // // char *token = strtok(s,d);
    // // while(token!=NULL){
    // //     printf("%s\n",token);
    // //     printf("%d\n",strlen(token));
    // //     token = strtok(NULL,d);
    // // }
    // char * last;
    // char *token = strtok_r(s,d ,&last);
    // while(token!=NULL){
    //     printf("%s\n",token);
    //     printf("%d\n",strlen(token));
    //     token = strtok_r(NULL,d,&last);
    // }

    printf("%s",getenv("USER"));

    return 0;
}
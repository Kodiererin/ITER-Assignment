#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
// Here atextr uses stack.


void display();
void display2();
void display3();

void display(){
	printf("I am called Display 1 \n");
}
void display2(){
	printf("I am called Display 2\n");
}void display3(){
	printf("I am called Display 3\n");
}


int main(int argc , char *argv){
	atexit(display);
	atexit(display2);
	atexit(display3);
	// created a user defined handler.
	printf("At Exit \n");
	for(int i=0 ; i<10 ; i++){
		printf("%d\n",i);
	}
	//exit(0);
	//_exit(0);
	//_Exit(0);  // in this Exit handler will not work 
	//return 0;
}


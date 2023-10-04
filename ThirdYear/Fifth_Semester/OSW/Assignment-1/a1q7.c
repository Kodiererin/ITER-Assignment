/*7. ASCII code for the character ? is 63. Characters are represented by integer codes, C permits con-
version of type char to type int and vice versa. So find the output for the given code snippet;*/
#include<stdio.h>
int main(){
	char c = '?';
	int q_code = (int)'?';
	printf("%d %c %d\n",q_code,'?','?');
	return 0;
}

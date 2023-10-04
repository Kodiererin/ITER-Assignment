/*2. Determine the output of the following code snippet*/
int main(){
int m1,a,b,c;
printf("Enter the values of a,b,c:");
scanf("%d%d%d",&a,&b,&c);
m1=a>b?a>c?a:c:b;
printf("m1=%d\n",m1);
return 0;
}

/*10. The following C code snippet illustrate the use of minimum field width feature in printf function.
Write the output of the code snippet assuming as 1 blank space.*/

int main(){
    int  i = 54321;
    float x = 876.543;
    printf(":%-3d:  :%-5d:  :%-10d: %12d:\n",i,i,i,i);
    printf(":%-3f: :%-10f: :%-13f: :%f:\n",x,x,x,x);
    return 0;
}
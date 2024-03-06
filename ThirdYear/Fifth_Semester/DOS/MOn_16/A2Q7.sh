echo -e "7. Write a shell script named as ndisp that will take three command line arguments
specifying the value of n, m and a filename and display the first n number of lines and
last m number of lines of the file given as argument.
(Make the script an executable file and run it as a command using its name only.) \n \n"

$3
echo -e "File Name  : " : $3
echo -e "n No of Lines : $(wc -l  $0 < $3)"
echo -e "n No of Lines : $(tail -n $2 < $3)"

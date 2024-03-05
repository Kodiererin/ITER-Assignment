echo -e "4. Write a shell script named as nvwc which will display the filename and linecount,
wordcount and char count of the file dtcal in the following format:
Filename: dtcal
Line count: -
Word count: -
Charcout: -
(Make the script an executable file and run it as a command using its name only.) \n \n"


echo -e "Line Count \t : $(wc -l < a.txt)"
echo -e "Word Count \t : $(wc -w < a.txt)"
echo -e "Char Count \t : $(wc -c < a.txt)"

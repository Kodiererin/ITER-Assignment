#!/bin/bash

echo -e "5. Write a shell script named as nvwc2 which will display the filename and linecount, word
count and char count of any file given as argument to nvwc2 in the following format:
filename linecount wordcount charcount
file1 - - -
(Make the script an executable file and run it as a command using its name only.) \n \n"

echo -e "Enter Your File Name \n"



read  fileName

echo $fileName

echo -e "File Name \t LineCount \t WordCount \t CharCount"
echo -e "${fileName} \t $(wc -l < ${fileName}) \t $(wc -c < ${fileName}) \t $(wc -c < ${fileName})"

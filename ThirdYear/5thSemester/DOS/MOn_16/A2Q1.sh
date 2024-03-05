#!/bin/bash

touch result.txt
sort -n a.txt b.txt c.txt
a.txt >> result.txt | b.txt >> result.txt | c.txt >> result.txt
 
echo 'Your Result File is '
cat result.txt

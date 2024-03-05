# Year is Leap year or not

read -p "Enter The Year " year

leap=0
c=`echo $year % 4 | bc`
echo $c

if ((c>leap))
then
"Not a Leap Year"
else
echo "A Leap Year"
fi

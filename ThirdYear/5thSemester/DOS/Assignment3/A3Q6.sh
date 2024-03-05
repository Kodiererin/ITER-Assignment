echo "Check Leap Year"
a=$1
echo $a

if [ -z "$a" ]; then
    a=$(date +'%Y')
    echo "No input provided. Using current year: $a"
fi

if [ $((a % 4)) -eq 0 ] && [ $((a % 100)) -ne 0 ] || [ $((a % 400)) -eq 0 ]; then
    echo "$a is a leap year."
else
    echo "$a is not a leap year."
fi

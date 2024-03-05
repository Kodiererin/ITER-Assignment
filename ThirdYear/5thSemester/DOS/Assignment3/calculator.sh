echo "Enter input in following format: op1 operator op2 "
a=$1
b=$2
c=$3
echo "$a $b $c = "

if [ $b = "+" ]; then
    echo $(($a+$c))
elif [ $b = "-" ]; then
    echo $(($a-$c))
elif [ $b = "x" ]; then
    echo $(($a*$c))
elif [ $b = "/" ]; then
    echo $(($a/$c))
elif [ $b = "%" ]; then
    echo $(($a%$c))
elif [ $b = "^" ]; then
    echo $(($a^$c))
else
    echo "Invalid Operator"
fi
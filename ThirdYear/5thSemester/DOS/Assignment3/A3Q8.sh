a=$1
b=$2
c=$3

if (($a>$b && $b>c)); then 
    echo $a is the greatest number
elif (($b>$a && $a>$c)); then
    echo $b is the greatest number
else
    echo $c is the greatest number
fi
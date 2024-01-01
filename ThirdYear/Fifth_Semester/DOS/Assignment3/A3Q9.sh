read -p "Enter a Character " ch
a=$(echo $ch | wc -c)
# echo $a
if(($a==2)); then
if (($ch>=A && $ch<=Z)); then
        echo "Uppercase"
elif (($ch>=a && $ch<=z)); then
        echo "Lowercase"
elif (($ch>=0 && $ch<=9)); then
        echo "Digit"
else
        echo "Special Character"
fi
else
    echo "Enter a single character"
fi
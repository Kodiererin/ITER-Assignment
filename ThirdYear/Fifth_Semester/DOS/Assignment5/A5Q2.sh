count=1
for arg in "$@"; do 
    echo "Argument : $count :  $arg"
    ((count++))
done
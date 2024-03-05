echo "Enter the 2 File Names"
a=$1
b=$2

if cmp -s $a $b; then
    echo "Files are same"
else
    echo "Files are different"
fi
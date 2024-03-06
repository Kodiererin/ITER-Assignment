read -p " Enter the Cost Price and Selling Price " cp sp

if (( cp>sp )) ;  then
echo "Loss"
echo $cp - $sp | bc
else
echo "Profit"
echo $sp - $cp | bc
fi

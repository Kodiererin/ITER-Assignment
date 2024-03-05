read -p " Enter the Selling Price " sp
read -p " Enter the Cost Price " cp 

proloss=$(echo $sp-$cp | bc)

if((sp>cp))
then 
    echo " Profit = $proloss"
    echo " Profit Percentage = $(echo $proloss*100/$cp | bc)%"
else
    echo " Loss = $proloss"
    echo " Loss Percentage = $(echo $proloss*100/$cp | bc)%"
fi


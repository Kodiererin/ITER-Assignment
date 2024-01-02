for file in "$@"; do
    if [ -f "$file" ] ; then
        size=$(wc -c < "$file")
        echo "File Name : $file"
        echo "Size in Bytes : $size"
        echo
    else
        echo "Error in : $file"
    fi
done
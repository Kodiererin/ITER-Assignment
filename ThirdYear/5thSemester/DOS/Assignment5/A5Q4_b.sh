until [ "$choice" -ne 1 ]; do
    read -p "Enter a filename: " filename

    if [ -f "$filename" ]; then
        echo "Filename: $filename"
        cat "$filename"
    else
        echo "Error: $filename is not a valid file."
    fi

    read -p "Do you want to display another file (1/0)? " choice
done

echo "Exiting..."
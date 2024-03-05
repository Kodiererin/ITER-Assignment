if [ "$#" -eq 0 ]; then
    echo "Error: No arguments provided. Please provide filenames or directories."
    exit 1
fi

for item in "$@"; do
    if [ -f "$item" ]; then
        echo "File: $item"
        lines=$(wc -l < "$item")
        echo "Number of lines: $lines"
        echo
    elif [ -d "$item" ]; then
        echo "Directory: $item"
        echo
    else
        echo "Error: $item is neither a file nor a directory."
        echo
    fi
done
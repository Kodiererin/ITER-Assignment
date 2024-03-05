file_exists() {
    [ -e "$1" ]
}

create_and_copy() {
    mkdir mydir
    for file in "$@"; do
        cp "$file" mydir/
    done
}

if [ "$#" -eq 0 ]; then
    echo "Error: No files provided. Please provide filenames to check."
    exit 1
fi

existing_files=""
for file in "$@"; do
    if file_exists "$file"; then
        existing_files+=" $file"
    fi
done

if [ -d mydir ]; then
    num_files_in_mydir=$(find mydir -maxdepth 1 -type f | wc -l)
    echo "mydir already exists. Number of files in mydir: $num_files_in_mydir"
else
    create_and_copy "$@"
    echo "mydir created and files copied."
fi

if [ -n "$existing_files" ]; then
    echo "Existing files:$existing_files"
fi
if [ "$#" -eq 0 ]; then
    echo "Error: No files provided. Please provide file names to copy."
elif [ "$(( $# % 2 ))" -eq 1 ]; then
    echo "Error: Odd number of files provided. No copying will take place."
else
    args=("$@")
    for ((i = 0; i < $#; i += 2)); do
        source_file="${args[i]}"
        destination_file="${args[i + 1]}"

        if [ -e "$source_file" ]; then
            cp "$source_file" "$destination_file"
            echo "Copied: $source_file to $destination_file"
        else
            echo "Error: $source_file does not exist."
        fi
    done
fi
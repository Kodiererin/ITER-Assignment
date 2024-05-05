# import PyPDF2
import PyPDF2

def merge_pdfs(pdf1_path, pdf2_path, output_path):
    # Create a writer object
    pdf_writer = PyPDF2.PdfWriter()

    # Open the first PDF
    with open(pdf1_path, 'rb') as pdf1_file:
        pdf1_reader = PyPDF2.PdfReader(pdf1_file)

        # Loop through each page in the first PDF and add it to the writer object
        for page_num in range(len(pdf1_reader.pages)):
            page = pdf1_reader.pages[page_num]
            pdf_writer.add_page(page)

    # Open the second PDF
    with open(pdf2_path, 'rb') as pdf2_file:
        pdf2_reader = PyPDF2.PdfReader(pdf2_file)

        # Loop through each page in the second PDF and add it to the writer object
        for page_num in range(len(pdf2_reader.pages)):
            page = pdf2_reader.pages[page_num]
            pdf_writer.add_page(page)

    # Write the merged PDF to the output file
    with open(output_path, 'wb') as merged_pdf_file:
        pdf_writer.write(merged_pdf_file)
path1 = '12th Certificate-WithSign.pdf'
path2 = '12th Certificate.pdf'
merge_pdfs(path1, path2, 'merged.pdf')

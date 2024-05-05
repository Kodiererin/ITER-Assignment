import time
import ctypes

def show_message(message, duration):
    # Show the message
    ctypes.windll.user32.MessageBoxW(0, message, "Dekh le Bhai!", 0)
    # Wait for the specified duration
    time.sleep(duration)

if __name__ == "__main__":
    # Your message
    message = "Bhai, tereko baaki sbse 3X mehnat krna hoga, tbhi hoga wrna naai!!"
    # Duration to display the message (in seconds)
    duration = 15

    # Show the message for the specified duration
    show_message(message, duration)

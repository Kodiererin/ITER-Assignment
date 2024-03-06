import psutil
import time

# Function to get dynamic hardware data
def get_dynamic_hardware_data():
    while True:
        # Get CPU usage
        cpu_percent = psutil.cpu_percent(interval=1)
        # Get memory usage
        memory = psutil.virtual_memory()
        print("Hardware Data:")
        print(f"CPU Usage (%): {cpu_percent}")
        print(f"Memory Usage (MB): Total: {memory.total}, Used: {memory.used}, Free: {memory.free}, Percent: {memory.percent}")
        time.sleep(5)  # Update every 5 seconds

# Function to get dynamic energy consumption data (simulated, replace with actual API)
def get_dynamic_energy_consumption_data():
    while True:
        # Simulated energy consumption data
        print("Energy Consumption Data:")
        print("Energy Consumption (Watt): 75.5")
        print("Battery Status: Charging")
        time.sleep(5)  # Update every 5 seconds

if __name__ == "__main__":
    import threading

    # Create threads to collect dynamic data
    hardware_thread = threading.Thread(target=get_dynamic_hardware_data)
    energy_thread = threading.Thread(target=get_dynamic_energy_consumption_data)

    # Start the threads
    hardware_thread.start()
    energy_thread.start()

    # Wait for the threads to complete (in practice, you might use a more robust method)
    hardware_thread.join()
    energy_thread.join()

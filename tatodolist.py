# Simple To-Do List Application

tasks = []

while True:
    print("\nTo-Do List Menu")
    print("1. Add Task")
    print("2. View Tasks")
    print("3. Delete Task")
    print("4. Exit")

    choice = input("Enter choice: ")

    # Add Task
    if choice == "1":
        task = input("Enter task: ")
        tasks.append(task)
        print("Task added.")

    # View Tasks
    elif choice == "2":
        if len(tasks) == 0:
            print("\nNo tasks available.")
        else:
            print("\nYour Tasks:")
            for i in range(len(tasks)):
                print(i + 1, ".", tasks[i])

    # Delete Task
    elif choice == "3":
        if len(tasks) == 0:
            print("No tasks to delete.")
        else:
            try:
                num = int(input("Enter task number to delete: "))
                if 1 <= num <= len(tasks):
                    tasks.pop(num - 1)
                    print("Task deleted.")
                else:
                    print("Invalid task number.")
            except ValueError:
                print("Please enter a valid number.")

    # Exit Program
    elif choice == "4":
        print("Exit")
        break

    # Invalid Choice
    else:
        print("Invalid choice. Please select from 1 to 4.")

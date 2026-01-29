package p2methods.method;

import java.util.ArrayList;

public class ToDoManager {

    // Main method with command line arguments
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ToDoManager <username>");
            System.out.println("Example: java ToDoManager John");
            return;
        }

        String username = args[0];
        System.out.println("Welcome to To-Do Manager, " + username + "!");
        System.out.println();

        // Create user instance
        User user = new User(username);

        // Add personal tasks using instance methods
        user.addTask("Complete Java assignment", "High");
        user.addTask("Read chapter 5", "Medium");
        user.addTask("Practice coding problems", "High");
        user.displayTasks();

        // Complete a task
        System.out.println("Completing task #1...");
        user.completeTask(0);
        user.displayTasks();

        // Add shared team tasks using static methods
        System.out.println("Adding team tasks...");
        TeamTask.addSharedTask("Prepare presentation", "High");
        TeamTask.addSharedTask("Review code", "Medium");
        TeamTask.displaySharedTasks();

        // Complete team task
        System.out.println("Completing team task #1...");
        TeamTask.completeSharedTask(0);
        TeamTask.displaySharedTasks();

        // Show stats
        user.showStats();
        TeamTask.displayStatistics();
    }
}

// Task class - demonstrates encapsulation with private fields
class Task {
    private String description;
    private boolean completed;
    private String priority;

    public Task(String description, String priority) {
        this.description = description;
        this.completed = false;
        this.priority = priority;
    }

    public void markComplete() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String toString() {
        String status = completed ? "[✓]" : "[ ]";
        return status + " " + description + " (Priority: " + priority + ")";
    }
}

// User class - demonstrates instance methods
class User {
    private String username;
    private ArrayList<Task> tasks;

    public User(String username) {
        this.username = username;
        this.tasks = new ArrayList<>();
    }

    // Instance method - operates on specific user object
    public void addTask(String description, String priority) {
        Task task = new Task(description, priority);
        tasks.add(task);
        System.out.println(username + " added: " + description);
    }

    // Instance method - displays this user's tasks
    public void displayTasks() {
        System.out.println("\n" + username + "'s Tasks:");
        System.out.println("=".repeat(40));

        if (tasks.isEmpty()) {
            System.out.println("No tasks yet!");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
        System.out.println();
    }

    // Instance method - completes specific task
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
            System.out.println("Task completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    // Instance method - shows personal stats
    public void showStats() {
        int completed = 0;
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completed++;
            }
        }

        System.out.println("\n" + username + "'s Stats:");
        System.out.println("Total: " + tasks.size() + " | Completed: " + completed + " | Pending: " + (tasks.size() - completed));
    }
}

// TeamTask class - demonstrates static methods
class TeamTask {
    private static ArrayList<Task> sharedTasks = new ArrayList<>();
    private static int totalCreated = 0;

    // Static method - belongs to class, not instance
    public static void addSharedTask(String description, String priority) {
        Task task = new Task(description, priority);
        sharedTasks.add(task);
        totalCreated++;
        System.out.println("Team task added: " + description);
    }

    // Static method - displays all shared tasks
    public static void displaySharedTasks() {
        System.out.println("\nTeam Shared Tasks:");
        System.out.println("=".repeat(40));

        if (sharedTasks.isEmpty()) {
            System.out.println("No shared tasks!");
        } else {
            for (int i = 0; i < sharedTasks.size(); i++) {
                System.out.println((i + 1) + ". " + sharedTasks.get(i));
            }
        }
        System.out.println();
    }

    // Static method - completes shared task
    public static void completeSharedTask(int index) {
        if (index >= 0 && index < sharedTasks.size()) {
            sharedTasks.get(index).markComplete();
            System.out.println("Team task completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    // Static method - shows team statistics
    public static void displayStatistics() {
        int completed = 0;
        for (Task task : sharedTasks) {
            if (task.isCompleted()) {
                completed++;
            }
        }

        System.out.println("\nTeam Statistics:");
        System.out.println("Total: " + sharedTasks.size() + " | Completed: " + completed + " | Created: " + totalCreated);
    }
}
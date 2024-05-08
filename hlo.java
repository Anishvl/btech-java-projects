import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {
    private static Map<String, User> users = new HashMap<>();
    private static Map<String, String> websites = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            clearScreen();
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Forgot Password");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = getChoice();

            switch (choice) {
                case 1:
                    loginInterface();
                    break;
                case 2:
                    registerInterface();
                    break;
                case 3:
                    forgotPasswordInterface();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static void loginInterface() {
        clearScreen();
        System.out.println("Login");
        System.out.println("------");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        if (!email.contains("@")) {
            System.out.println("Invalid email format. Please enter a valid email address.");
            waitForEnter();
            return;
        }

        System.out.print("Enter password: ");
        String password = getPasswordFromUser("");
        login(email, password);
    }

    private static void login(String email, String password) {
        User user = users.get(email);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            waitForEnter();
            manageWebsites(user);
        } else {
            System.out.println("Invalid email or password.");
            waitForEnter();
        }
    }

    private static void registerInterface() {
        clearScreen();
        System.out.println("Register");
        System.out.println("--------");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        if (!email.contains("@")) {
            System.out.println("Invalid email format. Please enter a valid email address.");
            waitForEnter();
            return;
        }
        String password = getPasswordFromUser("Enter password: ");
        String securityQuestion = getPasswordFromUser("Enter a security question: ");
        String securityAnswer = getPasswordFromUser("Enter the answer to the security question: ");
        register(email, password, securityQuestion, securityAnswer);
    }

    private static void register(String email, String password, String securityQuestion, String securityAnswer) {
        if (users.containsKey(email)) {
            System.out.println("Email already exists.");
            waitForEnter();
        } else {
            User newUser = new User(email, password, securityQuestion, securityAnswer);
            users.put(email, newUser);
            System.out.println("Registration successful!");
            waitForEnter();
        }
    }

    private static void forgotPasswordInterface() {
        clearScreen();
        System.out.println("Forgot Password");
        System.out.println("----------------");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        forgotPassword(email);
    }

    private static void forgotPassword(String email) {
        User user = users.get(email);
        if (user != null) {
            String securityQuestion = user.getSecurityQuestion();
            System.out.println(securityQuestion);
            System.out.print("Enter your answer to the security question: ");
            String answer = scanner.nextLine();
            if (user.getSecurityAnswer().equals(answer)) {
                String newPassword = getPasswordFromUser("Enter new password: ");
                user.setPassword(newPassword);
                System.out.println("Password reset successful!");
                waitForEnter();
            } else {
                System.out.println("Incorrect answer to the security question.");
                waitForEnter();
            }
        } else {
            System.out.println("User not found.");
            waitForEnter();
        }
    }

    private static void manageWebsites(User user) {
        while (true) {
            clearScreen();
            System.out.println("1. Add a new website");
            System.out.println("2. View website passwords");
            System.out.println("3. Change website name");
            System.out.println("4. Change website password");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = getChoice();

            switch (choice) {
                case 1:
                    addWebsiteInterface(user);
                    break;
                case 2:
                    viewWebsitePasswords(user);
                    break;
                case 3:
                    changeWebsiteName(user);
                    break;
                case 4:
                    changeWebsitePassword(user);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    waitForEnter();
            }
        }
    }

  private static void addWebsiteInterface(User user) {
      clearScreen();
      System.out.print("Enter website name: ");
      String website = scanner.nextLine();
      if (!website.contains(".com")) {
          System.out.println("Invalid website format. Please include '.com'.");
          waitForEnter();
          return;
      }
      System.out.print("Enter password: ");
      String password = getPasswordFromUser("");
      addWebsite(user, website, password);
  }


    private static void changeWebsiteName(User user) {
        clearScreen();
        System.out.print("Enter the current website name: ");
        String currentWebsiteName = scanner.nextLine();

        if (websites.containsKey(currentWebsiteName)) {
            System.out.print("Enter the new website name: ");
            String newWebsiteName = scanner.nextLine();

            if (!websites.containsKey(newWebsiteName)) {
                String currentPassword = getPasswordFromUser("Enter your login password: ");
                if (user.getPassword().equals(currentPassword)) {
                    websites.put(newWebsiteName, websites.remove(currentWebsiteName));
                    System.out.println("Website name changed successfully!");
                } else {
                    System.out.println("Incorrect password.");
                }
            } else {
                System.out.println("New website name already exists.");
            }
        } else {
            System.out.println("Website not found.");
        }
        waitForEnter();
    }

    private static void changeWebsitePassword(User user) {
        clearScreen();
        System.out.print("Enter the website name: ");
        String websiteName = scanner.nextLine();

        if (websites.containsKey(websiteName)) {
            String currentPassword = getPasswordFromUser("Enter the current website password: ");

            if (websites.get(websiteName).equals(currentPassword)) {
                String newPassword = getPasswordFromUser("Enter the new website password: ");
                websites.put(websiteName, newPassword);
                System.out.println("Website password changed successfully!");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Website not found.");
        }
        waitForEnter();
    }

  private static void addWebsite(User user, String website, String password) {
      for (Map.Entry<String, String> entry : websites.entrySet()) {
          if (entry.getKey().equalsIgnoreCase(website) && entry.getValue().equals(password)) {
              System.out.println("Website and password combination already exists.");
              waitForEnter();
              return;
          }
      }
      websites.put(website, password);
      System.out.println("Website added successfully!");
      waitForEnter();
  }


    private static void viewWebsitePasswords(User user) {
        clearScreen();
        System.out.print("Enter login password: ");
        String password = getPasswordFromUser("");

        if (user.getPassword().equals(password)) {
            System.out.println("Website Passwords:");
            if (websites.isEmpty()) {
                System.out.println("No websites added yet.");
            } else {
                for (Map.Entry<String, String> entry : websites.entrySet()) {
                    System.out.println("Website: " + entry.getKey() + ", Password: " + entry.getValue());
                }
            }
        } else {
            System.out.println("Incorrect password.");
        }
        waitForEnter();
    }

    private static String getPasswordFromUser(String prompt) {
        System.out.print(prompt);
        return new String(System.console().readPassword());
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void waitForEnter() {
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            // Ignore the exception
        }
    }

    private static class User {
        private String email;
        private String password;
        private String securityQuestion;
        private String securityAnswer;

        public User(String email, String password, String securityQuestion, String securityAnswer) {
            this.email = email;
            this.password = password;
            this.securityQuestion = securityQuestion;
            this.securityAnswer = securityAnswer;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSecurityQuestion() {
            return securityQuestion;
        }

        public String getSecurityAnswer() {
            return securityAnswer;
        }
    }
}
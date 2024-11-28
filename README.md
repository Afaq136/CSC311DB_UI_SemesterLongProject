
# **JavaFX Database Management System**

## **Overview**

This project is a **JavaFX-based Database Management System** designed to efficiently manage user data through an interactive, responsive GUI. It features **authentication**, **CRUD operations**, **file uploads to Azure Blob Storage**, **data import/export**, and **report generation**. The application integrates a MySQL database for storing user information and Azure Blob Storage for managing file uploads. This system showcases real-world software engineering skills, including backend database management, cloud integration, user authentication, and responsive UI design.

---

## **Key Features**

### **Authentication & User Management**
- **Login/Sign-up System**: Secure user authentication with session management using a custom `UserSession` class.
- **Real-time Session Tracking**: Maintain active sessions, enabling personalized user experiences.

### **Database Integration**
- **MySQL Database**: Supports automatic database creation if not already present.
- **CRUD Operations**: Manage user records with full **Create, Read, Update, Delete** functionality.
- **Advanced Querying**: Perform complex queries for data manipulation and reporting.

### **Cloud File Uploads**
- **Azure Blob Storage**: Seamless integration to upload and manage images and files in cloud storage with progress tracking.
- **Efficient File Handling**: Users can upload files related to their records for secure cloud storage.

### **Data Import/Export**
- **CSV Import/Export**: Easily import and export user data in CSV format for backup or sharing.
- **Custom Data Parsing**: Robust CSV parsing to ensure data integrity during import.

### **Report Generation**
- **PDF Reports**: Generate and download reports summarizing user data, with filters for department and major, in PDF format.
- **Real-time Data Visualization**: Generate dynamic reports based on live data, providing valuable insights for decision-making.

### **Graphical User Interface**
- **Interactive UI**: A clean, modern, and intuitive user interface built with **JavaFX**, featuring editable tables and form-based validation.
- **Splash Screen & Transitions**: Professional splash screen with smooth transitions and animations for a polished user experience.
- **Customizable Themes**: Toggle between light and dark modes to suit user preferences.

### **Error Logging**
- **Comprehensive Logging**: Track and log errors, events, and user actions using the `MyLogger` class, ensuring efficient debugging and system monitoring.

---

## **Project Structure**

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controller/
│   │   │   ├── dao/
│   │   │   ├── model/
│   │   │   ├── service/
│   │   ├── resources/
│   │   │   ├── css/
│   │   │   ├── fxml/
│   │   │   ├── images/
│   └── target/
├── pom.xml
└── README.md
```

### **Main Components:**
- **MainApplication.java**: The entry point for launching the application.
- **DB_GUI_Controller.java**: The core controller handling user operations (CRUD).
- **LoginController.java**: Manages user authentication and login.
- **SignUpController.java**: Handles new user registration.
- **SplashScreenController.java**: Controls the splash screen and transitions.

### **Database & Services:**
- **DbConnectivityClass.java**: Manages database connections and queries using **JDBC**.
- **UserSession.java**: Tracks and manages the current user session.
- **StorageUploader.java**: Handles image uploads to **Azure Blob Storage**.
- **MyLogger.java**: Logs critical application events for debugging and system monitoring.

### **UI & Resources:**
- **FXML**: Defines the layout and controls for UI screens (`about`, `db_interface_gui`, `login`, `signup`, `splashscreen`).
- **CSS**: Stylesheets for UI theming (light/dark modes).
- **Images**: Icons and resources used in the application.

---

## **Setup Instructions**

### **Prerequisites**
- **Java Development Kit (JDK)**: Version 11 or higher.
- **MySQL Server**: Ensure MySQL is installed and running on your machine.
- **Azure Account**: Set up an **Azure Blob Storage** account to store user images.
- **IDE**: IntelliJ IDEA (recommended), Eclipse, or any IDE supporting JavaFX.

### **Database Configuration**
1. Open the `DbConnectivityClass.java` file.
2. Update the following constants with your database credentials:
   ```java
   final static String SQL_SERVER_URL = "jdbc:mysql://<your-server-name>";
   final static String DB_URL = SQL_SERVER_URL + "/<database-name>";
   final static String USERNAME = "<your-database-username>";
   final static String PASSWORD = "<your-database-password>";
   ```

### **Azure Blob Storage Configuration**
1. Open the `StorageUploader.java` file.
2. Update the Azure connection string and container name:
   ```java
   .connectionString("<your-azure-connection-string>")
   .containerName("<your-container-name>");
   ```

### **Running the Application**
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/JavaFX-Database-Management-System.git
   ```
2. Open the project in your IDE.
3. Ensure **JavaFX SDK** is properly configured in your IDE.
4. Build the project using Maven:
   ```bash
   mvn clean install
   ```
5. Run the `MainApplication.java` file to start the application.
6. Follow the splash screen to log in or create a new account.

---

## **How to Use**

1. **Login**: Enter your username and password on the login screen. If you don't have an account, click "Sign Up" to create one.
2. **Managing Records**:
   - View, add, edit, or delete user records in the interactive table.
   - Upload user profile images via the file upload button, which stores images in Azure Blob Storage.
3. **Import/Export CSV**:
   - Import user data from a CSV file to populate the database.
   - Export data to CSV for backup or sharing.
4. **Generate Reports**:
   - Use the "Generate Report" feature to create PDF reports based on user data, filtered by department or major.
5. **Theme Management**:
   - Toggle between light and dark themes from the menu for better user experience.

---

## **Known Issues**
- Ensure that valid **database credentials** and **Azure Blob Storage connection strings** are configured.
- Some Azure Blob Storage operations may require correct permissions in the storage account.
- PDF report generation might require additional libraries for handling complex formatting.

---

## **Future Improvements**
- **Password Security**: Implement password hashing using modern algorithms such as **BCrypt** or **PBKDF2** for better security.
- **User Role Management**: Implement role-based access control (RBAC) to restrict access based on user roles (Admin, User).
- **File Validation**: Improve file upload validation to support multiple file types and sizes.
- **Performance Optimization**: Optimize queries and improve overall application speed, especially when dealing with large datasets.

---

## **License**

This project is open-source and available under the **MIT License**. See the [LICENSE](LICENSE) file for more details.

---

## **Acknowledgments**
- **Azure Blob Storage SDK**: For file storage and cloud integration.
- **JavaFX Documentation**: For UI development.
- **JUnit**: For automated testing of the application.
- Thanks to the open-source community for providing the tools and libraries used in this project.

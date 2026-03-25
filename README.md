# 🏨 Hostel Management System (Java)

A console-based Hostel Management System built using Java.  
This project demonstrates Object-Oriented Programming (OOP) concepts and file handling to manage student records and hostel entry logs.

---

## 📌 Features

- ➕ Add new students  
- 📋 View all students  
- 🔍 Search student by ID  
- 🕒 Record IN/OUT entry logs  
- 📊 View entry logs  
- 💾 Store data using file handling  

---

## 🛠 Technologies Used

- Java  
- Object-Oriented Programming (OOP)  
- File Handling (CSV format)  
- Maven  

---

## 📂 Project Structure

```
src/main/java/com/mycompany/hostelmanager/
 ├── Entry.java
 ├── HostelManager.java
 ├── Person.java
 └── Student.java

student.txt   # Student data
Entry.txt     # Entry logs
pom.xml       # Maven configuration
```

---

## ▶️ How to Run

### 🔹 Using Maven
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.mycompany.hostelmanager.HostelManager"
```

### 🔹 Using Java (without Maven)
```bash
javac -d . src/main/java/com/mycompany/hostelmanager/*.java
java com.mycompany.hostelmanager.HostelManager
```

---

## 📊 How It Works

- Uses inheritance (`Person → Student`) to manage student data  
- Entry logs track IN and OUT movements with date and time  
- Data is stored in CSV format using text files  
- Records are loaded and saved automatically  

---

## ⚠️ Notes

- Ensure `student.txt` and `Entry.txt` exist in the project directory  
- Data is stored in CSV format  
- Console-based application  

---

## 🚀 Future Improvements

- GUI interface (JavaFX / Swing)  
- Database integration (MySQL)  
- User authentication system  
- Search by name  

---

## 👨‍💻 Author

- Rubanthanu  

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and feel free to improve it!

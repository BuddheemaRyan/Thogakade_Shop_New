# 🛒 Thoga Kade — Shop Management System

A desktop-based shop management application built with **JavaFX**, designed to streamline retail operations with a clean and intuitive user interface.

---

## 🚀 Tech Stack

![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-19-0078D7?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-9.4-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-1.18-BC4521?style=for-the-badge&logo=lombok&logoColor=white)

---

## 📋 Features

- 🔐 **Login System** — Secure username & password authentication
- 🗄️ **MySQL Integration** — Persistent data storage via MySQL database
- 🎨 **Modern UI** — Dark-themed JavaFX interface with FXML layouts

---

## 🛠️ Prerequisites

- Java **17** or higher
- Maven **3.6+**
- MySQL **8.0+**

---

## ⚙️ Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/BuddheemaRyan/Thogakade_Shop_New.git
   cd Thogakade_Shop_New
   ```

2. **Set up the database**
   - Create a MySQL database (e.g., `thogakade_db`)
   - Update your database credentials in the application's configuration

3. **Build and run**
   ```bash
   mvn clean javafx:run
   ```

---

## 📁 Project Structure

```
src/
└── main/
    ├── java/
    │   ├── Main.java                          # Application entry point
    │   ├── Starter.java                       # JavaFX launcher
    │   └── Controller/
    │       └── LoginFormController.java       # Login UI controller
    └── resources/
        ├── view/
        │   └── login_form.fxml                # Login screen layout
        └── images/                            # Application images
```

---

## 🧰 Dependencies

| Dependency              | Version |
|-------------------------|---------|
| OpenJFX Controls        | 19      |
| OpenJFX FXML            | 19      |
| Project Lombok          | 1.18.40 |
| MySQL Connector/J       | 9.4.0   |

---

## 📄 License

This project is intended for educational purposes at **ICET**.

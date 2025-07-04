# 🧪 SauceDemoTestAutomation

This project is an automated UI test for the login functionality of [https://www.saucedemo.com](https://www.saucedemo.com).  
It is implemented using **Java**, **Selenium WebDriver**, **TestNG**, and follows the **Page Object Model (POM)** design pattern.

---

## 📂 Project Structure

src/
├── test/
│ ├── java/
│ │ └── com/saucedemo/
│ │ ├── base/
│ │ │ └── BaseTest.java
│ │ ├── pages/
│ │ │ └── LoginPage.java
│ │ └── tests/
│ │ └── LoginTest.java
│ └── resources/
│ └── testng.xml




---
## 🛠 Technologies Used

- ✅ Java 17+
- ✅ Selenium WebDriver 4.21.0
- ✅ TestNG 7.10.2
- ✅ Maven (project management)
- ✅ Page Object Model (POM) architecture
- ✅ (Optional) WebDriverManager – for automatic driver handling

---

## 🚀 Setup & Run Instructions

1️⃣ Clone the Repository


https://github.com/furkankadirogullari/hw10_projera_pom.git
cd SauceDemoTestAutomation

2️⃣ Install Dependencies
Make sure you have Maven installed, then run:


mvn clean install
3️⃣ Run the Test
You can run the tests via Maven:

mvn test
Or run testng.xml directly via your IDE (e.g., IntelliJ IDEA or Eclipse) by right-clicking and selecting Run.

🧪 Test Scenario
Scenario: Invalid Login Attempt

Steps:

Navigate to https://www.saucedemo.com

Enter an invalid username and password

Click the login button

Assert that the following error message appears:


Epic sadface: Username and password do not match any user in this service
📸 Console Output (Optional)
If you include System.out.println() in your test, the error message will appear in the console like this:


Error Message: Epic sadface: Username and password do not match any user in this service
🔐 Notes
The test uses Google Chrome by default.

Make sure your local ChromeDriver version matches your installed browser version, or use WebDriverManager to manage it automatically.

An internet connection is required since the test runs on a live website.
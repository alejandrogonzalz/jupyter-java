# Java in Jupyter Notebooks

Use Java just like Python in Jupyter notebooks with full IDE support in VS Code and IntelliJ IDEA!

## 📋 Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
  - [macOS](#macos)
  - [Windows](#windows)
- [IDE Setup](#ide-setup)
  - [VS Code](#vs-code-setup)
  - [IntelliJ IDEA](#intellij-idea-setup)
- [Usage](#usage)
- [Features](#features)
- [Troubleshooting](#troubleshooting)
- [Resources](#resources)

---

## Prerequisites

### Required Software

- **Java 9+** (JShell support required, Java 11+ recommended)
- **Python 3.8+**
- **Jupyter**
- **IDE**: VS Code (free) or IntelliJ IDEA Professional (paid)

---

## Installation

### macOS

#### Step 1: Install Java

Check if Java is installed:
```bash
java -version
```

If not installed, install via Homebrew:
```bash
brew install openjdk@21
```

Or download from [Amazon Corretto](https://aws.amazon.com/corretto/) or [Oracle](https://www.oracle.com/java/technologies/downloads/).

#### Step 2: Install Python & Jupyter

Using Homebrew:
```bash
brew install python3
pip3 install jupyter
```

Or using Conda:
```bash
brew install --cask anaconda
conda install jupyter
```

#### Step 3: Install IJava Kernel

Download and install IJava:
```bash
# Create a directory for installation
mkdir ~/ijava && cd ~/ijava

# Download IJava
curl -L https://github.com/SpencerPark/IJava/releases/download/v1.3.0/ijava-1.3.0.zip -o ijava-1.3.0.zip

# Extract
unzip ijava-1.3.0.zip

# Install
python3 install.py --sys-prefix
```

#### Step 4: Verify Installation

```bash
jupyter kernelspec list
```

You should see `java` in the list of available kernels.

---

### Windows

#### Step 1: Install Java

1. Download **Java 21** from [Amazon Corretto](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html) or [Oracle](https://www.oracle.com/java/technologies/downloads/)
2. Run the installer (`.msi` or `.exe`)
3. Verify installation in Command Prompt:
   ```cmd
   java -version
   ```

If `java` is not recognized, add to PATH:
1. Search "Environment Variables" in Windows
2. Edit "System variables" → "Path"
3. Add: `C:\Program Files\Amazon Corretto\jdk21.0.x\bin`

#### Step 2: Install Python & Jupyter

**Option A: Using Python.org**
1. Download Python from [python.org](https://www.python.org/downloads/)
2. Run installer (check "Add Python to PATH")
3. Install Jupyter:
   ```cmd
   pip install jupyter
   ```

**Option B: Using Anaconda** (Recommended)
1. Download [Anaconda](https://www.anaconda.com/download)
2. Run installer
3. Jupyter is included

#### Step 3: Install IJava Kernel

Open **Command Prompt** or **PowerShell**:

```cmd
:: Create directory
mkdir %USERPROFILE%\ijava
cd %USERPROFILE%\ijava

:: Download IJava (using curl or browser)
curl -L https://github.com/SpencerPark/IJava/releases/download/v1.3.0/ijava-1.3.0.zip -o ijava-1.3.0.zip

:: Extract (Windows 10+)
tar -xf ijava-1.3.0.zip

:: Install
python install.py --sys-prefix
```

**If you don't have curl**, download manually:
1. Go to: https://github.com/SpencerPark/IJava/releases/latest
2. Download `ijava-1.3.0.zip`
3. Extract to a folder
4. Open Command Prompt in that folder
5. Run: `python install.py --sys-prefix`

#### Step 4: Verify Installation

```cmd
jupyter kernelspec list
```

You should see `java` in the list.

---

## IDE Setup

### VS Code Setup

VS Code provides **free**, excellent Jupyter support with IntelliSense, debugging, and variable inspection.

#### Installation

**macOS:**
```bash
# Install VS Code
brew install --cask visual-studio-code

# Install required extensions
code --install-extension ms-toolsai.jupyter
code --install-extension vscjava.vscode-java-pack
```

**Windows:**
1. Download [VS Code](https://code.visualstudio.com/)
2. Install it
3. Open VS Code
4. Install extensions:
   - Press `Ctrl + Shift + X`
   - Search and install:
     - **Jupyter** (by Microsoft)
     - **Extension Pack for Java** (by Microsoft)

#### Configuration

1. Open VS Code
2. Open your notebook: `File → Open File → HelloJava.ipynb`
3. Click **"Select Kernel"** (top right)
4. Choose **"Jupyter Kernel"** → **"Java"**

#### Usage in VS Code

**Running Cells:**
- Click ▶️ play button next to each cell
- `Shift + Enter` - Run cell and move to next
- `Ctrl + Enter` - Run cell and stay
- `Alt + Enter` - Run cell and insert below

**Features:**
- **IntelliSense**: Type for auto-complete (`Ctrl + Space`)
- **Variable Inspector**: Click "Variables" button at top
- **Debugging**: Set breakpoints in cells
- **Command Palette**: `Ctrl + Shift + P` (Windows) or `Cmd + Shift + P` (Mac)

**Creating New Notebooks:**
1. `Ctrl/Cmd + Shift + P`
2. Type: "Jupyter: Create New Blank Notebook"
3. Select **Java** kernel
4. Save as `.ipynb`

---

### IntelliJ IDEA Setup

IntelliJ IDEA Professional has **superior** Jupyter integration with advanced debugging and refactoring.

> ⚠️ **Note**: Jupyter support requires **IntelliJ IDEA Professional** (not Community Edition)

#### Installation

**macOS:**
```bash
brew install --cask intellij-idea
```

**Windows:**
1. Download [IntelliJ IDEA Professional](https://www.jetbrains.com/idea/download/)
2. Run installer
3. Follow installation wizard

#### Configuration

1. **Open IntelliJ IDEA**

2. **Enable Jupyter Plugin** (if not already):
   - `File → Settings` (Windows) or `IntelliJ IDEA → Preferences` (Mac)
   - Navigate to `Plugins`
   - Search for "Jupyter"
   - Ensure it's enabled (bundled with Professional)

3. **Configure Jupyter Server**:
   - `File → Settings/Preferences`
   - Go to `Languages & Frameworks → Jupyter`
   - Click `+` to add server
   - Select **"Configured Server"**
   - Choose **"Local"**
   - IntelliJ auto-detects Jupyter

4. **Open Notebook**:
   - `File → Open → HelloJava.ipynb`
   - Or drag `.ipynb` file into IntelliJ

5. **Select Kernel**:
   - Click kernel selector (top right of notebook)
   - Choose **"Java"**

#### Usage in IntelliJ

**Running Cells:**
- Click green ▶️ button next to cell
- `Shift + Enter` - Run and move to next
- `Ctrl + Enter` - Run and stay

**Features:**
- **Advanced Code Completion**: Full Java IDE features
- **Debugging**: Set breakpoints, step through code
- **Refactoring**: Rename, extract methods, etc.
- **Variable Inspector**: View all variables in scope
- **Integrated Terminal**: Run commands without leaving IDE

**Creating New Notebooks:**
1. `File → New → Jupyter Notebook`
2. Choose **Java** kernel
3. Start coding!

---

## Usage

### Basic Java Code

```java
// Hello World
System.out.println("Hello from Java!");
```

### Variables

```java
int number = 42;
String message = "The answer is: " + number;
System.out.println(message);
```

### Collections & Streams

```java
import java.util.*;

List<String> languages = Arrays.asList("Java", "Python", "Kotlin", "Ruby");
languages.stream()
    .filter(lang -> lang.startsWith("J"))
    .forEach(System.out::println);
```

### Methods

```java
int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

fibonacci(10); // Returns: 55
```

### Classes

```java
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + " years old)";
    }
}

Person person = new Person("Alice", 30);
System.out.println(person);
```

### Return Values

The **last expression** in a cell is automatically displayed:

```java
"Java " + "rocks! 🚀"
// Displays: Java rocks! 🚀
```

---

## Features

### What Works ✅

- ✅ All Java standard library classes
- ✅ Variables persist across cells
- ✅ Methods and classes defined in any cell
- ✅ Imports work across entire notebook
- ✅ Full Java 21 features (Records, Pattern Matching, etc.)
- ✅ External dependencies (via Maven/Gradle)
- ✅ Streams, Lambdas, Generics
- ✅ Output with `System.out.println()`
- ✅ Auto-display last expression value

### IDE Features

| Feature | VS Code | IntelliJ Professional | Browser (Jupyter Lab) |
|---------|---------|----------------------|----------------------|
| **Cost** | Free | Paid | Free |
| **Code Completion** | ✅ Excellent | ✅ Excellent | ⚠️ Basic |
| **Debugging** | ✅ Good | ✅ Excellent | ❌ Limited |
| **Variable Inspector** | ✅ Yes | ✅ Yes | ⚠️ Basic |
| **Refactoring** | ⚠️ Basic | ✅ Advanced | ❌ No |
| **Git Integration** | ✅ Built-in | ✅ Built-in | ❌ No |
| **Performance** | ✅ Fast | ✅ Fast | ✅ Fast |
| **Learning Curve** | ⚠️ Moderate | ⚠️ Steep | ✅ Easy |

**Recommendation:**
- **Beginners**: Browser or VS Code
- **Professional Java Devs**: IntelliJ IDEA
- **Budget Conscious**: VS Code (free, great features)

### Using External Libraries

Add Maven dependencies directly in notebooks using the `%maven` command:

```java
// Add a library
%maven com.google.guava:guava:33.0.0-jre

// Use it immediately
import com.google.common.collect.*;
ImmutableList<String> list = ImmutableList.of("a", "b", "c");
```

**Popular libraries:**

```java
// Google Guava - Collections and utilities
%maven com.google.guava:guava:33.0.0-jre

// Jackson - JSON processing
%maven com.fasterxml.jackson.core:jackson-databind:2.16.1

// Apache Commons - String/Array utilities
%maven org.apache.commons:commons-lang3:3.14.0

// Jsoup - HTML parsing
%maven org.jsoup:jsoup:1.17.2

// Apache Commons Collections
%maven org.apache.commons:commons-collections4:4.4
```

**Using local JARs:**

```java
%jars /path/to/your-library.jar
```

**Find dependencies:** Search [Maven Central](https://search.maven.org/)

**Example notebook:** See `ExternalLibraries.ipynb` for complete examples with:
- Google Guava (collections)
- Jackson (JSON)
- Apache Commons (utilities)
- Jsoup (HTML parsing)

---

## Troubleshooting

### Java kernel not showing up

**Problem**: `jupyter kernelspec list` doesn't show `java`

**Solution**:
```bash
# macOS/Linux
cd ~/ijava  # or wherever you extracted IJava
python3 install.py --sys-prefix

# Windows
cd %USERPROFILE%\ijava
python install.py --sys-prefix
```

### "java" command not found

**Problem**: Terminal doesn't recognize `java`

**macOS Solution**:
```bash
# Add to ~/.zshrc or ~/.bash_profile
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=$JAVA_HOME/bin:$PATH
```

**Windows Solution**:
1. Search "Environment Variables"
2. Edit "System variables" → "Path"
3. Add: `C:\Program Files\Amazon Corretto\jdk21.0.x\bin`
4. Restart terminal

### VS Code: Kernel not connecting

**Problem**: "Failed to start kernel"

**Solution**:
1. Open Command Palette (`Ctrl/Cmd + Shift + P`)
2. Type: "Jupyter: Select Interpreter to Start Jupyter Server"
3. Choose your Python installation
4. Restart VS Code

### IntelliJ: Can't find Jupyter plugin

**Problem**: Jupyter plugin not available

**Solution**:
- IntelliJ Community Edition doesn't support Jupyter
- Upgrade to IntelliJ IDEA Professional
- Or use VS Code (free alternative)

### Cells not executing

**Problem**: Cell runs but no output

**Solution**:
```java
// Make sure to print output
System.out.println("Your output");

// Or return a value as last expression
"result"  // This will display
```

### Import errors

**Problem**: `package X does not exist`

**Solution**:
```java
// Add imports at the top of cells
import java.util.*;
import java.io.*;
import java.nio.file.*;
```

### Windows: "python" not recognized

**Problem**: Command prompt doesn't recognize `python`

**Solution**:
```cmd
:: Try python3 instead
python3 --version

:: Or use py launcher
py --version
py -m pip install jupyter
```

---

## Resources

### Documentation
- **IJava GitHub**: https://github.com/SpencerPark/IJava
- **Jupyter Docs**: https://jupyter.org/documentation
- **Java Documentation**: https://docs.oracle.com/en/java/

### Tutorials
- **Java Basics**: https://docs.oracle.com/javase/tutorial/
- **Jupyter Tutorial**: https://jupyter-notebook.readthedocs.io/

### Community
- **Stack Overflow**: Tag your questions with `jupyter` and `java`
- **IJava Issues**: https://github.com/SpencerPark/IJava/issues

### Alternative Kernels
- **BeakerX**: Polyglot kernel with Java support
- **Rapaio Jupyter**: R-style data science in Java

---

## License

This project uses:
- **IJava** - Apache License 2.0
- **Jupyter** - BSD License

---

## Contributing

Found an issue or have suggestions? Feel free to:
1. Open an issue
2. Submit a pull request
3. Share your notebooks!

---

## Quick Start Checklist

- [ ] Java 9+ installed
- [ ] Python 3.8+ installed
- [ ] Jupyter installed (`pip install jupyter`)
- [ ] IJava kernel installed
- [ ] `jupyter kernelspec list` shows `java`
- [ ] IDE set up (VS Code or IntelliJ)
- [ ] Opened `HelloJava.ipynb` successfully
- [ ] Ran first Java cell successfully 🎉

---

**Happy coding with Java in Jupyter!** 🚀☕

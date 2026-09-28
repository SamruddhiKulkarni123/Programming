# File Packer-Unpacker

A Java Swing desktop application that packs all the files of a folder into a single file and unpacks them again. The packed data is scrambled using a simple Caesar-style encryption.

## Features

- Simple GUI built with Java Swing (`MainWindow`, `PackWindow`, `UnPackWindow`)
- **Pack:** combines every file in a folder into one pack file
- **Unpack:** restores the original files from the pack file
- **Encryption / Decryption:** a fixed key is added to every byte while packing and subtracted while unpacking
- Error messages shown in the window (for example, when the folder or pack file does not exist)

## Project Structure

| File | Purpose |
|---|---|
| `MainWindow.java` | Main menu with **Pack** and **UnPack** buttons |
| `PackWindow.java` | Takes the folder name and pack file name, then creates the encrypted pack file |
| `UnPackWindow.java` | Takes the pack file name, then decrypts it and recreates the original files |

## Requirements

- Java JDK 11 or later (needed to run source files directly)

## How to Run

Open a terminal in the project folder and run:

```
java MainWindow.java PackWindow.java UnPackWindow.java
```

Or compile first:

```
javac *.java
java MainWindow
```

## How to Use

**Packing**
1. Click **Pack** in the main window.
2. Enter the **FolderName** (for example `Data`) that contains the files.
3. Enter the **PackFileName** (for example `MyPack.txt`).
4. Click **Pack**. A success message appears when the pack file is created.

**Unpacking**
1. Click **UnPack** in the main window.
2. Enter the **PackedFileName** created earlier.
3. Click **UnPack**. The original files are created in the folder where you ran the program.

## How It Works

The pack file stores each file one after another in this format:

```
[100-byte header: file name + size, padded with spaces][file data]
[100-byte header: file name + size, padded with spaces][file data]
...
```

- While packing, the header bytes and file bytes are encrypted by adding the key `3` to each byte.
- While unpacking, the header is decrypted first to read the file name and size, then that many data bytes are read and decrypted.
- The key must be the same in `PackWindow.java` and `UnPackWindow.java`.

## Limitations

- The header is limited to 100 characters, so very long file names are not supported.
- Only files directly inside the chosen folder are packed (sub-folders are not supported).
- Caesar encryption is a learning example and is **not secure**. It should not be used to protect sensitive data.

## Author

Samruddhi Kulkarni

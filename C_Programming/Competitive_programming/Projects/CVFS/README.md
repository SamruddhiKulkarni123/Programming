# Marvellous CVFS

**Marvellous CVFS** (Customized Virtual File System) is a Unix-style, RAM-based virtual file system implemented in C. It simulates core OS file-system concepts — inodes, a super block, a boot block, a per-process open-file table (UFDT), and system-call-style operations (`creat`, `open`, `read`, `write`, `stat`, `unlink`) — entirely in memory, with an optional backup to disk on exit.

## Features

- Interactive shell (Marvellous CVFS : >) that parses and executes file-system commands
- In-memory inode list (Disk Inode List Block / DILB) implemented as a linked list
- Super Block tracking total and free inodes
- Per-process User Area (UAREA) with a User File Descriptor Table (UFDT)
- File operations: `creat`, `read`, `write`, `stat`, `unlink`, `ls`, `ls -a`
- Manual page support via `man <command>`
- Help menu via `help`
- Backup of all in-memory files to actual disk files on `exit`

## Architecture

| Component | Purpose |
|---|---|
| **BootBlock** | Holds boot-time information string |
| **SuperBlock** | Tracks `TotalInodes` and `FreeInodes` |
| **Inode** | Represents a file: name, inode number, size, type, permissions, reference count, and a pointer to its in-memory data buffer |
| **FileTable** | Represents an open file instance: read/write offsets, mode, and a pointer to its inode |
| **UAREA** | Simulates a process's user area, holding the UFDT (array of file table pointers) |

On startup, the shell initializes the UAREA, Super Block, and a fixed-size DILB (`MAXINODE` inodes) before accepting commands.

## Supported Commands

| Command | Usage | Description |
|---|---|---|
| `help` | `help` | Displays all available commands |
| `man` | `man <command>` | Displays manual/help for a specific command (entries available for `exit`, `ls`, `clear`, `creat`, `unlink`, `stat`, `open`, `close`, `read`, `write`, `man`) |
| `ls` | `ls` | Lists names of all existing files |
| `ls -a` | `ls -a` | Lists all files with inode number and size |
| `creat` | `creat <name> <permission>` | Creates a new regular file (1=Read, 2=Write, 3=Read+Write) |
| `stat` | `stat <name>` | Displays statistical info about a file |
| `unlink` | `unlink <name>` | Deletes a file and frees its inode |
| `write` | `write <fd>` | Writes data (entered interactively) into a file |
| `read` | `read <fd> <size>` | Reads `size` bytes from a file |
| `clear` | `clear` | Clears the terminal screen |
| `exit` | `exit` | Backs up all files to disk and terminates |

## Error Handling

The system returns descriptive negative error codes for invalid operations, including:
- Invalid parameters
- No free inodes available
- File already exists / does not exist
- Permission denied
- Insufficient space or data
- Maximum open files reached

## Compilation & Usage

**On Windows (MinGW/MSYS2):**
```bash
gcc CVFS.c -o myexe
./myexe
```

**On Linux:**
```bash
gcc CVFS.c -o myexe
./myexe
```

### Sample Session
```
Marvellous CVFS : >creat Demo.txt 3
File Successfully created with FD : 3

Marvellous CVFS : >write 3
Enter the data that you want to write into the file
Hello World

Marvellous CVFS : >read 3 11
Read operation is successful
Data from file is :
Hello World

Marvellous CVFS : >stat Demo.txt
...

Marvellous CVFS : >exit
Thank you for using Marvellous CVFS
```

## Known Limitations

- `open` and `close` are described in `help` and have `man` entries, but the actual file-operation commands are not yet implemented in the shell (no `OpenFile()`/`CloseFile()` logic). Currently, `creat` implicitly "opens" a file by creating its UFDT entry and returning an FD.

## Author

**Samruddhi Santosh Kulkarni**

## License

This project is for educational purposes.

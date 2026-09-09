# Multithreaded Mathematical Server

A Java client-server application that performs mathematical operations remotely. The client sends a command over a TCP socket, and a multithreaded server parses it, computes the result, and sends the answer back — with each connected client handled on its own thread.

## Concepts Used

- **Networking**: `java.net.Socket` and `java.net.ServerSocket` for TCP communication
- **Multithreading**: a new `Thread` is spawned per client connection, so multiple clients can be served concurrently
- **Streams**: `DataInputStream` / `DataOutputStream` for sending framed UTF-8 messages between client and server
- **Resource management**: `try / finally` blocks to ensure sockets and streams are closed even if an exception occurs

## Supported Commands

| Command | Description |
|---|---|
| `ADD <No1> <No2>` | Addition |
| `SUB <No1> <No2>` | Subtraction |
| `MULT <No1> <No2>` | Multiplication |
| `DIV <No1> <No2>` | Division |
| `MOD <No1> <No2>` | Modulus |
| `MAX <No1> <No2>` | Maximum of the two numbers |
| `MIN <No1> <No2>` | Minimum of the two numbers |
| `QUIT` | Disconnects the client from the server |

## How to Compile and Run

1. **Compile both files:**
   ```
   javac Server.java
   javac Client.java
   ```

2. **Start the server** (in one terminal):
   ```
   java Server
   ```

3. **Start one or more clients** (in separate terminals):
   ```
   java Client
   ```

4. Enter a command at the prompt, e.g.:
   ```
   Enter command : ADD 10 5
   Addition is : 15.0
   ```

5. Type `QUIT` to disconnect a client. The server keeps running and accepting new connections until manually stopped.

## Sample Session

```
--------------------CLIENT STARTED-----------------
Connection with server is done successfully
Connected to Mathematical server
---------------------------------------------------
--------------Mathematical commands----------------
ADD <No1> <No2>
SUB <No1> <No2>
MULT <No1> <No2>
DIV <No1> <No2>
MOD <No1> <No2>
MAX <No1> <No2>
MIN <No1> <No2>
QUIT
---------------------------------------------------
Enter command : ADD 12 8
Addition is : 20.0
Enter command : DIV 10 0
Division is : Division by zero not posible because it returns infinity
Enter command : QUIT
Thank you for using Our Mathematical server
Client gets disconnected from server
```

## Notes

- Each client connection is handled on its own thread on the server side, allowing multiple clients to connect and issue commands concurrently.
- Division and modulus by zero are handled gracefully with an error message instead of crashing.
- This project was built to practice core Java networking and multithreading concepts.

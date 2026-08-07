# Task 1 - Basic Network Scanning with Nmap

## Objective
The objective of this task is to perform basic network scanning using Nmap to identify open ports, detect running services, and identify the operating system of the target machine.

## Tools Used
- Nmap 7.99
- Windows 11
- Command Prompt

## Target Machine
- IP Address: 192.168.0.5

## Commands Used

```bash
nmap 192.168.0.5
```

```bash
nmap -sV 192.168.0.5
```

```bash
nmap -O 192.168.0.5
```

## Scan Results

### Open Ports

| Port | Service |
|------|---------|
| 135 | Microsoft RPC |
| 139 | NetBIOS Session Service |
| 445 | Microsoft-DS (SMB) |
| 3306 | MySQL |

### Operating System
Microsoft Windows 11 (24H2–25H2)

## Security Analysis

- Port 135 is used for Microsoft Remote Procedure Call.
- Port 139 is used for NetBIOS file sharing.
- Port 445 is used for SMB file sharing and should not be exposed to untrusted networks.
- Port 3306 is the default MySQL database port. It should be protected with strong authentication and firewall rules.

## Conclusion

Using Nmap, I successfully identified the open ports, detected the running services, and identified the operating system of the target machine. This task helped me understand the basics of network scanning and security assessment.

## Ethical Note

The scan was performed only on my own Windows system for educational purposes.

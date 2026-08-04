# Task 2 - Basic Firewall Configuration with UFW

## Objective

The objective of this task is to configure a basic firewall on a Linux system using UFW (Uncomplicated Firewall). The firewall is configured to allow and deny specific network traffic based on security requirements.

---

## What is UFW?

UFW (Uncomplicated Firewall) is a user-friendly interface for managing the Linux firewall. It simplifies the configuration of firewall rules and helps protect a system by controlling incoming and outgoing network traffic.

---

## What is a Firewall?

A firewall is a network security system that monitors and controls incoming and outgoing network traffic according to predefined security rules. It acts as a barrier between trusted and untrusted networks, helping to prevent unauthorized access.

---

## Tools Used

- Ubuntu 26.04 (WSL2)
- UFW (Uncomplicated Firewall)
- Linux Terminal
- GitHub

---

## Firewall Rules Configured

### Rule 1

**Command**

```bash
sudo ufw allow ssh
```

**Purpose**

Allows SSH connections on port 22 so that remote administration is possible.

---

### Rule 2

**Command**

```bash
sudo ufw deny http
```

**Purpose**

Blocks HTTP traffic on port 80 to prevent unsecured web access.

---

### Rule 3

**Command**

```bash
sudo ufw allow https
```

**Purpose**

Allows secure HTTPS traffic on port 443 for encrypted communication.

---

### Rule 4

**Command**

```bash
sudo ufw deny 23/tcp
```

**Purpose**

Blocks Telnet because it is an insecure protocol that sends data in plain text.

---

## Verification

The configured rules were verified using:

```bash
sudo ufw status verbose
```

The output confirmed that the firewall was active and all configured rules were successfully applied.

---

## Testing Method

The firewall configuration was verified by checking the active rule set using the `sudo ufw status verbose` command. The output confirmed that SSH and HTTPS traffic were allowed, while HTTP and Telnet traffic were denied according to the configured rules.

---

## Why These Rules Were Chosen

- SSH is required for secure remote administration.
- HTTP was blocked because it transmits data without encryption.
- HTTPS was allowed because it provides encrypted communication.
- Telnet was blocked because it is an outdated and insecure remote access protocol.

---

## Files Included

- README.md
- ufw_configuration.sh
- screenshots/
  - ufw_version.png
  - enable_firewall.png
  - allow_ssh.png
  - deny_http.png
  - additional_rules.png
  - status_verbose.png
  - script_execution.png

---

## Conclusion

This task demonstrated how to configure a basic firewall using UFW on Ubuntu. By creating allow and deny rules, verifying the firewall status, and documenting the configuration, the task provided practical experience in improving system security through firewall management.

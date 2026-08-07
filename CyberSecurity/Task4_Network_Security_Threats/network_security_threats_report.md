# Research Report: Common Network Security Threats

## Oasis Infobyte Cyber Security Internship

### Task 4 – Research Report: Common Network Security Threats

**Submitted By:** A. Bheeshma Shankar

**College:** Chaitanya Bharathi Institute of Technology (CBIT)

**Branch:** Computer Science and Engineering (Artificial Intelligence & Machine Learning)

**Date:** August 2026

---

# Table of Contents

1. Introduction
2. Denial of Service (DoS) Attack
3. Distributed Denial of Service (DDoS) Attack
4. Man-in-the-Middle (MITM) Attack
5. IP Spoofing
6. DNS Poisoning
7. Comparison Table
8. Conclusion
9. References

---

# Introduction

Network security is one of the most important aspects of cybersecurity. It focuses on protecting computer networks, servers, communication systems, and connected devices from unauthorized access, misuse, cyber attacks, and data breaches. As organizations increasingly depend on digital infrastructure for communication, business operations, cloud computing, and online services, maintaining strong network security has become essential.

Modern cyber attackers continuously develop sophisticated methods to exploit vulnerabilities in computer networks. These attacks may result in financial losses, theft of confidential information, interruption of business operations, legal consequences, and damage to an organization's reputation.

A secure network uses multiple layers of protection such as firewalls, intrusion detection systems, encryption, authentication mechanisms, security monitoring, and timely software updates. Organizations must also educate employees about cybersecurity because human error remains one of the leading causes of successful cyber attacks.

This report discusses some of the most common network security threats, explains how they work, examines real-world incidents, analyzes their impact, and presents practical mitigation strategies that organizations can implement to improve their cybersecurity posture.

---

# 1. Denial of Service (DoS) Attack

## Definition

A Denial of Service (DoS) attack is a cyber attack in which a single attacker attempts to make a computer system, website, or network unavailable by overwhelming it with excessive requests. The attack consumes system resources such as CPU, memory, or network bandwidth, preventing legitimate users from accessing the service.

---

## How a DoS Attack Works

In a DoS attack, the attacker repeatedly sends a large number of requests from a single device to the target server. Since every server has limited resources, continuous malicious requests eventually exhaust these resources, causing the server to slow down or stop responding altogether.

---

## Real-World Example

Many small businesses have experienced DoS attacks where attackers flooded their websites with traffic, causing temporary outages and disrupting online services.

---

## Impact

A successful DoS attack can have serious consequences, including:

- Website or application becomes unavailable.
- Customers cannot access online services.
- Business operations are interrupted.
- Financial losses due to downtime.
- Reduced customer trust.
- Damage to organizational reputation.

---

## Mitigation Strategies

Organizations can reduce the risk of DoS attacks by implementing several security measures:

- Configure firewalls to block suspicious traffic.
- Use rate limiting to restrict excessive requests.
- Deploy Intrusion Prevention Systems (IPS).
- Monitor network traffic continuously.
- Use cloud-based protection services for traffic filtering.

---

# 2. Distributed Denial of Service (DDoS) Attack

## Definition

A Distributed Denial of Service (DDoS) attack is a more advanced version of a DoS attack. Instead of using a single computer, attackers use thousands or even millions of compromised devices, called a botnet, to simultaneously flood a target with traffic.

---

## How a DDoS Attack Works

The attacker first infects multiple computers or Internet of Things (IoT) devices with malware. These infected devices become part of a botnet and are remotely controlled. When instructed, all devices send requests to the target server at the same time, making the attack extremely powerful.

---

## Real-World Example

One of the most well-known DDoS attacks occurred in 2016 against Dyn, a major DNS provider. Attackers used the Mirai botnet, which consisted of compromised IoT devices, to launch a massive attack. As a result, popular websites including Twitter, Netflix, GitHub, Reddit, and Spotify became inaccessible for several hours.

---

## Impact

The consequences of a DDoS attack include:

- Complete disruption of online services.
- Significant financial losses.
- Increased operational costs.
- Loss of customer confidence.
- Damage to business reputation.

---

## Mitigation Strategies

Organizations can defend against DDoS attacks by:

- Using Content Delivery Networks (CDNs).
- Implementing Anti-DDoS protection services.
- Deploying load balancers.
- Monitoring unusual traffic spikes.
- Filtering malicious network traffic.

---

# 3. Man-in-the-Middle (MITM) Attack

## Definition

A Man-in-the-Middle (MITM) attack occurs when an attacker secretly intercepts communication between two parties without their knowledge. The attacker positions themselves between the sender and receiver, allowing them to capture, monitor, or modify transmitted information.

---

## How a MITM Attack Works

The attacker intercepts network communication by exploiting insecure Wi-Fi networks, compromised routers, or other weaknesses. Instead of communicating directly, both parties unknowingly communicate through the attacker.

---

## Real-World Example

Public Wi-Fi hotspots are common targets for MITM attacks. If users connect to unsecured wireless networks and access banking or email services without encryption, attackers may capture usernames, passwords, and other confidential information.

---

## Impact

MITM attacks can lead to:

- Theft of usernames and passwords.
- Financial fraud.
- Identity theft.
- Unauthorized access to confidential information.
- Data manipulation during transmission.

---

## Mitigation Strategies

The following practices help prevent MITM attacks:

- Always use HTTPS websites.
- Use Virtual Private Networks (VPNs).
- Enable Multi-Factor Authentication (MFA).
- Avoid connecting to unsecured public Wi-Fi networks.
- Verify website security certificates.

---

# 4. IP Spoofing

## Definition

IP Spoofing is a technique in which attackers forge the source IP address of network packets to make them appear as though they originated from a trusted device. This helps attackers hide their identity or impersonate legitimate systems.

---

## How IP Spoofing Works

Instead of sending packets with their actual IP address, attackers modify packet headers to include a fake source address. This makes tracing the attacker more difficult and may allow them to bypass certain security controls.

---

## Real-World Example

IP Spoofing is commonly used during DDoS attacks. Attackers hide the actual source of malicious traffic by sending packets with forged IP addresses, making it difficult for security teams to identify and block the attacker.

---

## Impact

IP Spoofing may result in:

- Unauthorized access.
- Identity impersonation.
- Network service disruption.
- Difficulty in identifying attackers.
- Increased risk of large-scale cyber attacks.

---

## Mitigation Strategies

Organizations should implement the following security controls:

- Configure ingress and egress filtering.
- Use Access Control Lists (ACLs).
- Monitor abnormal network traffic.
- Enable packet filtering on routers.
- Maintain updated firewall rules.

---
# 5. DNS Poisoning (DNS Spoofing)

## Definition

DNS Poisoning, also known as DNS Cache Poisoning or DNS Spoofing, is a cyber attack in which false DNS information is inserted into a DNS server's cache. As a result, users attempting to visit a legitimate website are redirected to a malicious website without their knowledge.

---

## How DNS Poisoning Works

When a user enters a website address such as **www.bank.com**, the computer queries a DNS server to obtain the corresponding IP address. In a DNS poisoning attack, the attacker manipulates the DNS records so that the DNS server returns the IP address of a malicious website instead of the legitimate one. The victim unknowingly visits the fake website, where sensitive information such as usernames, passwords, or banking details may be stolen.

---

## Real-World Example

One of the most well-known incidents is the **Kaminsky DNS Cache Poisoning Attack (2008)**. Security researcher Dan Kaminsky discovered a major vulnerability in the DNS protocol that allowed attackers to poison DNS caches. The vulnerability affected millions of DNS servers worldwide and required urgent security patches from major vendors.

---

## Impact

A successful DNS poisoning attack can result in:

- Redirection of users to fake websites.
- Theft of usernames and passwords.
- Financial fraud.
- Malware infections.
- Loss of customer trust.
- Damage to an organization's reputation.

---

## Mitigation Strategies

Organizations can reduce the risk of DNS poisoning by implementing the following security measures:

- Deploy DNS Security Extensions (DNSSEC).
- Keep DNS servers updated with the latest security patches.
- Use secure recursive DNS resolvers.
- Monitor DNS logs for suspicious activity.
- Validate DNS responses before caching them.

---

# Comparison of Common Network Security Threats

| Threat | Attack Vector | Primary Target | Difficulty to Execute | Business Impact | Recommended Mitigation |
|---------|---------------|----------------|------------------------|-----------------|------------------------|
| DoS | Single attacker floods a server with requests | Web Servers | Easy | High | Firewall, Rate Limiting |
| DDoS | Multiple compromised systems (Botnet) | Web Servers, Cloud Services | Medium | Very High | CDN, Anti-DDoS Services, Load Balancing |
| MITM | Intercepts communication between two parties | Users, Organizations | Medium | High | HTTPS, VPN, MFA |
| IP Spoofing | Uses forged IP addresses | Network Infrastructure | Medium | Medium | Packet Filtering, ACLs |
| DNS Poisoning | Manipulates DNS records | Internet Users | Medium | High | DNSSEC, Secure DNS Servers |

---

# Key Takeaways for Network Administrators

The following recommendations help strengthen network security:

1. Keep operating systems, applications, and network devices updated with the latest security patches.

2. Configure firewalls and intrusion detection/prevention systems to monitor and block malicious traffic.

3. Implement Multi-Factor Authentication (MFA) to provide an additional layer of security.

4. Use encrypted communication protocols such as HTTPS, SSH, and VPNs whenever sensitive information is transmitted.

5. Regularly monitor network traffic and system logs to detect unusual or suspicious activities.

6. Conduct periodic security assessments and vulnerability scans to identify potential weaknesses.

7. Provide regular cybersecurity awareness training to employees to reduce the risk of human error.

---

# Conclusion

Network security has become one of the most critical aspects of modern information technology. As organizations increasingly depend on digital communication and online services, cyber threats continue to evolve in both complexity and frequency.

This report examined several common network security threats, including Denial of Service (DoS), Distributed Denial of Service (DDoS), Man-in-the-Middle (MITM) attacks, IP Spoofing, and DNS Poisoning. Each of these attacks can significantly impact organizations by disrupting services, stealing confidential information, causing financial losses, and damaging organizational reputation.

Understanding how these attacks work is the first step toward building effective security strategies. Organizations should adopt a layered security approach that combines firewalls, encryption, intrusion detection systems, regular software updates, secure authentication methods, continuous monitoring, and employee awareness training.

By implementing these best practices, organizations can significantly reduce cybersecurity risks and maintain the confidentiality, integrity, and availability of their network resources.

---

# References

The following trusted resources were used while preparing this research report:

1. National Institute of Standards and Technology (NIST)
   https://www.nist.gov

2. Cybersecurity and Infrastructure Security Agency (CISA)
   https://www.cisa.gov

3. SANS Institute
   https://www.sans.org

4. MITRE ATT&CK Framework
   https://attack.mitre.org

5. OWASP Foundation
   https://owasp.org

6. Cloudflare Learning Center
   https://www.cloudflare.com/learning/

7. Cisco Security Resources
   https://www.cisco.com

8. IBM Security Learning Academy
   https://www.ibm.com/security

---

# Summary

This report provided a comprehensive overview of common network security threats and their impact on modern organizations. It explained the working principles of DoS, DDoS, MITM, IP Spoofing, and DNS Poisoning attacks, presented real-world examples, discussed their potential consequences, and outlined practical mitigation strategies. The report emphasizes that strong network security requires a combination of technical controls, regular monitoring, timely updates, and user awareness to effectively protect digital infrastructure against evolving cyber threats.

#!/bin/bash

echo "Starting UFW Configuration..."

sudo ufw --force enable

sudo ufw allow ssh

sudo ufw deny http

sudo ufw allow https

sudo ufw deny 23/tcp

echo "Current Firewall Rules"

sudo ufw status verbose

echo "Configuration Completed"

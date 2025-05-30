# Mobile Testing - Traveloka App

Automation testing untuk aplikasi mobile Traveloka menggunakan Katalon Studio.

## Tech Stack
- **Framework**: Katalon Studio
- **Platform**: Mobile (Android)
- **App**: Traveloka Mobile (Application ID)
- **Installation**: Custom split APK script
- **Manajemen Test Case**: ClickUp

## Test Cases
- Register
- Login
- Search Flight
- Search Hotel

## Test Case & Report
https://drive.google.com/drive/folders/1C-Fe5ANwu2sWzvJqqcipF8PPPLDnTIFr?usp=sharing

## Setup
```bash
# Import project ke Katalon Studio
# Configure mobile device/emulator
# Setup Application ID: com.traveloka.android
# Run custom installation script untuk split APKs
```

## Run Tests
```bash
# Open Katalon Studio
# Select Test Suite
# Run test pada device

# Command line execution
katalon -runMode=console -testSuitePath="Test Suites/Mobile Suite"
```

Portfolio project untuk demonstrasi Mobile testing automation.

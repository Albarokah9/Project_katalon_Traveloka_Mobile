# Mobile Testing - Traveloka App

Automation testing untuk aplikasi mobile Traveloka menggunakan Katalon Studio.

## Tech Stack
- **Framework**: Katalon Studio
- **Platform**: Mobile (Android/iOS)
- **App**: Traveloka Mobile (Application ID)
- **Installation**: Custom split APK script

## Test Cases
- Register
- Login
- Search Flight
- Search Hotel

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

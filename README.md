# smart-bear-coding-challenge

## Overview

This project provides a service to convert digital time (hours and minutes) into British spoken time format.  
It is implemented in Java using Maven for build management.

## Features

- Converts time to British spoken format (e.g., "quarter past five", "ten to six").
- Validates input hours (0-12) and minutes (0-59).
- Throws clear exceptions for invalid inputs.

## Requirements

- Java 8+
- Maven 3.x
 
## How to Run

1. Clone the repository: https://github.com/rajeshb512/smart-bear-coding-challenge.git
2. Build with Maven: 'mvn clean install'
3. Run the main class: 'BritishSpokenTimeApplication'
4. Enter time in 'HH:mm' format.

## Example

Input: '07:30'
Output: 'half past seven'

Input: '13:21'
Output: 'Invalid time: 13:21'
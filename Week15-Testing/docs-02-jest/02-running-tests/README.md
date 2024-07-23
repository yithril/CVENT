# Setting Up and Running Tests with Jest

## Introduction

This guide will walk you through the steps to install Jest, configure it in your JavaScript project, and run your first test.

## Installation

To install Jest, use npm or yarn:

```bash
npm install --save-dev jest
# or
yarn add --dev jest
```

## Configuration

Add a script to your `package.json` to run Jest:

```json
{
  "scripts": {
    "test": "jest"
  }
}
```

## Example Project Setup

1. Create a new directory for your project:

```bash
mkdir jest-demo
cd jest-demo
npm init -y
npm install --save-dev jest
\```

2. Your project structure should look like this:

```plaintext
jest-demo/
├── node_modules/
├── package.json
└── package-lock.json
```

## Creating a Simple Test

1. Create a file named `sum.js` with the following content:

```javascript
function sum(a, b) {
  return a + b
}
module.exports = sum
```

2. Create a test file named `sum.test.js` with the following content:

\```javascript
const sum = require('./sum')

test('adds 1 + 2 to equal 3', () => {
  expect(sum(1, 2)).toBe(3)
})
\```

## Running Tests

To run your tests, use the following command:

```bash
npm test
```

Jest will automatically find all files with a `.test.js` or `.spec.js` extension and execute the tests.

## Conclusion

Setting up and running tests with Jest is straightforward. With minimal configuration, you can start writing and running tests for your JavaScript applications.

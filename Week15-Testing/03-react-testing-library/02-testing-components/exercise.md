# Exercise: Writing Tests with React Testing Library

## Objective

Practice writing tests for React components using React Testing Library.

## Task

1. Create a simple React component and write tests for it using RTL.

## Instructions

1. Create a new React component file named `Button.js` and implement a button component that displays a label.
2. Create a test file named `Button.test.js` and write tests for the `Button` component using RTL:
    - Test that the button renders with the correct label.
    - Test that the button is present in the document.

## Example Implementation (Button.js)

```javascript
import React from 'react'

function Button({ label }) {
  return <button>{label}</button>
}

export default Button
```

## Hints for Tests (Button.test.js)

1. Import the necessary functions from React Testing Library and Jest DOM.
2. Render the `Button` component with a sample label.
3. Use `screen.getByText` to query for the button text.
4. Use `screen.getByRole` to verify the button's presence in the document.

Run your tests using `npm test`.

Ensure that all tests pass and that you understand how to write tests using React Testing Library.

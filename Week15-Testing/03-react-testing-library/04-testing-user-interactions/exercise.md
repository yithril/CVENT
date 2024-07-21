# Exercise: Testing User Interactions with React Testing Library

## Objective

Practice testing user interactions in React components using React Testing Library.

## Task

1. Create a React component that handles user interactions and write tests for it.

## Instructions

1. Create a new React component file named `Toggle.js` that displays a toggle button and a message that changes when the button is clicked.
2. Create a test file named `Toggle.test.js` and write tests for the `Toggle` component using RTL:
    - Test that the button renders with the correct initial label.
    - Test that the message changes when the button is clicked.

## Example Implementation (Toggle.js)

```javascript
import React, { useState } from 'react'

function Toggle() {
  const [isOn, setIsOn] = useState(false)

  return (
    <div>
      <button onClick={() => setIsOn(!isOn)}>
        {isOn ? 'Turn off' : 'Turn on'}
      </button>
      <p>{isOn ? 'The light is on' : 'The light is off'}</p>
    </div>
  )
}

export default Toggle
```

## Hints for Tests (Toggle.test.js)

1. Import the necessary functions from React Testing Library and Jest DOM.
2. Render the `Toggle` component.
3. Use `screen.getByText` to check for the initial button label.
4. Use `fireEvent.click` to simulate a button click.
5. Use `screen.getByText` to verify that the message changes after the click.

Run your tests using `npm test`.

Ensure that all tests pass and that you understand how to test user interactions using React Testing Library.

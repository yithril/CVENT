# Writing Tests with React Testing Library

## Introduction

React Testing Library (RTL) provides utilities to test React components by interacting with the rendered output. This guide will show you how to write basic tests using RTL.

## Setting Up

To get started with RTL, you need to install it along with Jest (if it's not already installed):

```bash
npm install --save-dev @testing-library/react @testing-library/jest-dom
```

## Writing a Basic Test

Here’s how you can write a test for a simple React component:

### Example Component

```javascript
// Greeting.js
import React from 'react'

function Greeting({ name }) {
  return <h1>Hello, {name}!</h1>
}

export default Greeting
```

### Example Test

```javascript
// Greeting.test.js
import React from 'react'
import { render, screen } from '@testing-library/react'
import '@testing-library/jest-dom/extend-expect'
import Greeting from './Greeting'

test('renders a greeting message', () => {
  render(<Greeting name="John" />)
  expect(screen.getByText('Hello, John!')).toBeInTheDocument()
})
```

## Queries

RTL provides various queries to find elements in the rendered output:

- **getBy**: Throws an error if no element is found.
- **queryBy**: Returns null if no element is found.
- **findBy**: Returns a promise and waits for the element to appear.

### Example Queries

```javascript
test('queries in RTL', () => {
  render(<Greeting name="John" />)
  
  // getBy
  expect(screen.getByText('Hello, John!')).toBeInTheDocument()
  
  // queryBy
  expect(screen.queryByText('Goodbye, John!')).toBeNull()
  
  // findBy (for async elements)
  // const element = await screen.findByText('Hello, John!')
  // expect(element).toBeInTheDocument()
})
```

## Conclusion

Writing tests with React Testing Library focuses on testing how users interact with your components. By using RTL’s utilities, you can write tests that are more resilient to changes in the implementation.

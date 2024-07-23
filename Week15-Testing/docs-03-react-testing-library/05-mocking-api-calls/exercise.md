# Exercise: Mocking API Calls in React Testing Library

## Objective

Practice mocking API calls in React components using React Testing Library and Jest.

## Task

1. Create a React component that fetches data from an API and write tests for it, mocking the API calls.

## Instructions

1. Create a new React component file named `UserProfile.js` that fetches user data from an API and displays it.
2. Create a test file named `UserProfile.test.js` and write tests for the `UserProfile` component:
    - Mock the API call to return a sample user profile.
    - Test that the loading indicator is displayed initially.
    - Test that the user profile is displayed once the data is fetched.

## Example Implementation (UserProfile.js)

```javascript
import React, { useState, useEffect } from 'react'
import axios from 'axios'

function UserProfile() {
  const [user, setUser] = useState(null)
  const [loading, setLoading] = useState(true)

  useEffect(() => {
    async function fetchUser() {
      const response = await axios.get('/api/user')
      setUser(response.data)
      setLoading(false)
    }

    fetchUser()
  }, [])

  if (loading) return <div>Loading...</div>
  return (
    <div>
      <h1>{user.name}</h1>
      <p>{user.email}</p>
    </div>
  )
}

export default UserProfile
```

## Hints for Tests (UserProfile.test.js)

1. Import the necessary functions from React Testing Library and Jest DOM.
2. Mock the `axios` module to return a sample user profile.
3. Render the `UserProfile` component.
4. Use `screen.getByText` to check for the loading indicator.
5. Use `waitFor` to wait for the user profile to be displayed.

Run your tests using `npm test`.

Ensure that all tests pass and that you understand how to mock API calls using React Testing Library and Jest.

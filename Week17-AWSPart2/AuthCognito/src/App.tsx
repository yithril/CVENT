import { Authenticator } from '@aws-amplify/ui-react'
import './App.css'

function App() {

  return (
    <>
      <Authenticator>
        {({ signOut, user}) => (
          <>
            <p>Welcome to our React App!!</p>
            <p>{user?.userId}, you are signed in!</p>
            <button onClick={signOut}>Sign out</button>
          </>
        )}
      </Authenticator>
    </>
  )
}

export default App

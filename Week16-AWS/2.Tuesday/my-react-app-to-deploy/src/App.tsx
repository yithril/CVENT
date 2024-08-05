import './App.css'
import './styles.css';
import Navbar from './components/Navbar';
import Main from './components/Main';
import { Authenticator } from '@aws-amplify/ui-react';
import AuthProvider from './components/AuthProvider';

function App() {
  return (
    <AuthProvider>
      <div className="App">
        <Navbar />
        <main style={styles.mainContent}>
          <Main />
        </main>
      </div>
    </AuthProvider>
  );
}

const styles = {
  mainContent: {
    padding: '20px',
  },
};

export default App;

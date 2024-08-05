import { useAuthenticator } from "@aws-amplify/ui-react";
import awsconfig from "../aws-exports";

const CustomAuthButton: React.FC = () => {
  const { user, signOut } = useAuthenticator((context) => [context.user]);

  return user ? (
    <button onClick={signOut} style={styles.button}>Sign Out</button>
  ) : (
    <a href={awsconfig.oauth.redirectSignIn} style={styles.button}>Sign In</a>
  );
};

const styles = {
  button: {
    backgroundColor: '#fff',
    color: '#333',
    border: 'none',
    padding: '10px 20px',
    cursor: 'pointer',
    textDecoration: 'none',
  },
};

export default CustomAuthButton;
  
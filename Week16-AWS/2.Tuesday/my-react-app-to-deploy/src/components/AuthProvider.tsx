import { Authenticator } from "@aws-amplify/ui-react";
import { ReactNode } from "react";

const formFields = {
    signIn: {
      username: {
        label: 'Email',
        placeholder: 'Enter your email',
        type: 'email',
        isRequired: true,
      },
      password: {
        label: 'Password',
        placeholder: 'Enter your password',
        isRequired: true,
      },
    },
    signUp: {
        username: {
          label: 'Username',
          placeholder: 'Enter your username',
          type: 'text',
          isRequired: true,
        },
        email: {
          label: 'Email',
          placeholder: 'Enter your email',
          type: 'email',
          isRequired: true,
        },
        password: {
          label: 'Password',
          placeholder: 'Enter your password',
          isRequired: true,
        },
      },
  };
  
  interface AuthProviderProps {
    children: ReactNode;
  }
  
  const AuthProvider: React.FC<AuthProviderProps> = ({ children }) => {
    return (
      <Authenticator formFields={formFields}>
        {({ signOut, user }) => (
          <>
            {children}
          </>
        )}
      </Authenticator>
    );
  };
  
  export default AuthProvider;
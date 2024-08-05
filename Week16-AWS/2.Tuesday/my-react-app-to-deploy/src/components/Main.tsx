// src/Main.tsx
import React from 'react';
import { useAuthenticator, View } from '@aws-amplify/ui-react';
import TodoList from './TodoList';

const Main: React.FC = () => {
  const { user } = useAuthenticator((context) => [context.user]);

  return (
    <View>
      {user ? (
        <><h1>Welcome, {user.username}</h1><TodoList></TodoList></>
      ) : (
        <h1>Welcome to My App</h1>
      )}
    </View>
  );
};

export default Main;

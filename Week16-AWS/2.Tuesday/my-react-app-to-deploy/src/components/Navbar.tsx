import CustomAuthButton from "./CustomAuthButton";

const Navbar: React.FC = () => {
    return (
      <nav style={styles.navbar}>
        <div style={styles.navTitle}>My App</div>
        <div style={styles.navAuth}>
          <CustomAuthButton />
        </div>
      </nav>
    );
  };
  
  const styles = {
    navbar: {
      width: '100%',
      position: 'fixed' as 'fixed',
      top: 0,
      left: 0,
      display: 'flex',
      justifyContent: 'space-between',
      alignItems: 'center',
      padding: '0 20px',
      backgroundColor: '#333',
      color: '#fff',
      height: '60px',
      zIndex: 1000,
    },
    navTitle: {
      fontSize: '24px',
    },
    navAuth: {
      display: 'flex',
      alignItems: 'center',
    },
  };
  
  export default Navbar;
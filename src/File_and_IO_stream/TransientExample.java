package File_and_IO_stream;

import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private transient String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "'}";
    }
}

public class TransientExample {
    public static void main(String[] args) {
        User user = new User("john_doe", "securePassword123");

        // Serialize the user object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            out.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the user object from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) in.readObject();
            System.out.println("Deserialized User: " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

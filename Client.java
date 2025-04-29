

```java
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }
            
            var registry = LocateRegistry.getRegistry("localhost", 1099);
            var stub = (Hello) registry.lookup("Hello");
            
            if (stub != null) {
                var response = stub.sayHello();
                if (response != null) {
                    System.out.println("Response: " + response);
                } else {
                    System.out.println("Response is null");
                }
            } else {
                System.out.println("Stub is null");
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
```
package Maven.demo.src.main.java.Bean;

public class MyBean {
    private String message;
    public static void main(String[] args) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println("Your Message : " + message);
    }

    @override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }

}

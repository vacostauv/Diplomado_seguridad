package mx.uach.practicaseguridad;

import static spark.Spark.get;

/**
 *
 * @author Luis
 */
public class Login {
    
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
    
}

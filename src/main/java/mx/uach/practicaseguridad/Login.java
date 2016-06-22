package mx.uach.practicaseguridad;

import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.template.freemarker.FreeMarkerEngine;

/**
 * Clase controladora para registrar un usuario e iniciar sesión.
 *
 * @author Ing. Luis Antonio Ramirez Martinez
 */
public class Login {

    public static void main(String[] args) {

        /**
         * Ruta inicial de la app muestra el formulario de registro de la app.
         */
        get("/", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            return new ModelAndView(attributes, "registrar.ftl");
        }, new FreeMarkerEngine());

        /**
         * Ruta para procesar el registro enviado desde la ruta inicial.
         */
        post("/registrar", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();

            //TODO Guardar en Base de datos.
            return new ModelAndView(attributes, "registrar.ftl");
        }, new FreeMarkerEngine());
        
        /**
         * Ruta para verificar el inicio de sesión.
         */
        post("/login", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            
            //TODO Verificar Sesión
            return new ModelAndView(attributes, "home.ftl");
        }, new FreeMarkerEngine());
    }

}

package cl.duoc.ms_ventas_bff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
            .info(new Info()
                .title("API de ventas (ms-ventas-bff) - Perfulandia")
                .description(
                    "El BFF de Perfulandia es el punto de entrada del frontend hacia el backend.\n" +
                    "Se encarga de coordinar llamadas a microservicios que gestionan productos (perfumes),\n" +
                    "pedidos y transacciones con WebPay.\n\n" +
                    "Centraliza la lógica de negocio que es específica del frontend,\n" +
                    "optimizando el rendimiento, la seguridad y la experiencia de usuario."
                )
                .version("1.0.0"));
    }
}

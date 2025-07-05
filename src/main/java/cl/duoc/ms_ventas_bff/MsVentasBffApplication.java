package cl.duoc.ms_ventas_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "cl.duoc.ms_ventas_bff.clients")
public class MsVentasBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsVentasBffApplication.class, args);
	}
}

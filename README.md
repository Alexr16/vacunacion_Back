# Kruguer 

# Vacunacion App

> En este proyecto se ha construido una aplicacion web conectando frond y back usando Spring Boot 3 y React para contestar al Reto Kruguer Inventario de vacunación de empleados.
> En esta aplicacion se tiene un role de administrador y empleado.
> Un administrador puede crear, editar y eliminar empleados.
> Un empleado puede editar su información.

## Creado con:

- React
- TypeScript
- JavaScript
- HTML
- Chrakra
- Java
- Spring Boot
- Zod
- Postgresql

## Para iniciar el Back-End

1. Hacer una copia local del repositorio y abrirlo con Spring boot o su editor compatible favorito.
2. Crear una base de datos en su sistema con el nombre vacunas_app (puede usar el terminal o pgAdmin)
3. Abrir el archivo application.properties en el directorio src/main/resources/application.properties
4. En el siguiente código reemplazar username y password con la información de su base de datos
   
```
server.port=8080
spring.jpa.database=POSTGRESQL
spring.sql.init.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/vacunas_app
spring.datasource.username=jorgerios
spring.datasource.password=2679674
spring.jpa.show-sql=true
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
```
5. Guardar cambios
6. Ingresar el siguiente comando en el terminal o iniciar la aplicacion:
```
mvn clean spring-boot:run
```
7. Usando postman ingresar el url http://localhost:8080/usuario/create
8. Elegir el método post y en body pegar lo siguiente:
```
{
"username": "admin",
"password": "123456",
"nombres": "admin"
}
```
9. En el Front-End usar el username y password enviados para ingresar al sistema.

## Author

👤 **George**

- GitHub: [@Alexr16](https://github.com/Alexr16)
- Twitter: [@ReveloJ](https://twitter.com/ReveloJ)
- LinkedIn: [Jorge Ríos](https://www.linkedin.com/in/jorgeriosr/)

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

Feel free to check the [issues page](https://github.com/Alexr16/vacunacion_Back/issues).

## Show your support

Give a ⭐️ if you like this project!

## Acknowledgments
- Gracias a Kruguer por la oportunidad.

## 📝 License

This project is [MIT](./LICENSE) licensed.

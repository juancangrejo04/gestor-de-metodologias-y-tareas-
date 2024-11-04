package templates;

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registro de Usuario</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f9;
    margin: 0;
    padding: 0;
}
        .container {
    width: 100%;
    max-width: 400px;
    margin: 50px auto;
    background-color: white;
    padding: 20px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    border-radius: 8px;
}
h2 {
    text-align: center;
    color: #333;
}
form {
    display: flex;
    flex-direction: column;
}
label {
    margin-bottom: 5px;
    font-weight: bold;
}
input, select {
    margin-bottom: 15px;
    padding: 10px;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 16px;
}
button {
    padding: 10px;
    background-color: #8989f0;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
}
button:hover {
    background-color: #a7c4eb;
}
        .register-link {
    text-align: center;
    margin-top: 15px;
}
        .register-link a {
color: #8989f0;
text-decoration: none;
        }
    </style>
</head>
<body>
<div class="container">
<h2>Registro de Usuario</h2>
    <form action="/registro" method="POST">
        <label for="nombre_usuario">Nombre de Usuario:</label>
        <input type="text" id="nombre_usuario" name="nombre_usuario" required>

        <label for="correo">Correo Electrónico:</label>
        <input type="email" id="correo" name="correo" required>

        <label for="contrasena_usuario">Contraseña:</label>
        <input type="password" id="contrasena_usuario" name="contrasena_usuario" required>

        <button type="submit">Registrar</button>
    </form>
</div>
<div class="register-link">
    <p>¿Ya tienes una cuenta? <a href="iniciosesion.html">Inicia sesión aquí</a></p>
</div>
</body>
</html>



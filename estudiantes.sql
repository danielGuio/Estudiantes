CREATE DATABASE IF NOT EXISTS bd_estudiantes;
use bd_estudiantes;
CREATE TABLE `estudiantes` (
  `id` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `apellido` text NOT NULL,
  `fecha_nacimiento` text NOT NULL,
  `correoInstitucional` text NOT NULL,
  `correoPersonal` text NOT NULL,
  `numeroCel` text DEFAULT NULL,
  `numeroFijo` text DEFAULT NULL,
  `programaAcad` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `estudiantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

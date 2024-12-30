-- Insertar datos en la tabla Clasificacion
INSERT INTO clasificacion (grupo) VALUES
                                      ('Electrónicos'),
                                      ('Hogar'),
                                      ('Ropa');

-- Insertar datos en la tabla Competencia
INSERT INTO competencia (nombre, descripcion) VALUES
                                                  ('Ventas', 'Competencia en el área de ventas'),
                                                  ('Logística', 'Competencia en logística');

-- Insertar datos en la tabla Persona
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES
                                                                 ('Juan', 'Pérez', '12345678', '1234567890', 'juan.perez@example.com'),
                                                                 ('María', 'González', '87654321', '0987654321', 'maria.gonzalez@example.com');

-- Insertar datos en la tabla Proveedores
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES
                                                                  ('12345678901', '987654321', 'Perú', 'proveedor1@example.com', 'PEN'),
                                                                  ('98765432109', '123456789', 'Chile', 'proveedor2@example.com', 'CLP');

-- Insertar datos en la tabla Producto
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES
                                                                                               (50, 100.0, 'Unidad', 1, 1, TRUE),
                                                                                               (30, 200.0, 'Unidad', 2, 2, FALSE);

-- Insertar datos en tipo_pago
INSERT INTO tipo_pago (id_tipo_pago, tipo, descripcion) VALUES
                                                            (1, 'Efectivo', 'Pago en efectivo'),
                                                            (2, 'Tarjeta', 'Pago con tarjeta de crédito'),
                                                            (3, 'Transferencia', 'Pago por transferencia bancaria');

-- Insertar datos en factura
INSERT INTO factura (id_factura, id_persona, fecha, id_tipo_pago, descuento, total) VALUES
                                                                                        (1, 1, '2024-12-27', 1, 0.10, 100.0),
                                                                                        (2, 2, '2024-12-27', 2, 0.15, 200.0);

-- Insertar datos en la tabla ItemFactura
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES
                                                                                   (1, 1, 2, 100.0, 200.0),
                                                                                   (1, 2, 1, 200.0, 200.0),
                                                                                   (2, 1, 3, 100.0, 300.0);

-- Insertar datos en la tabla Rol
INSERT INTO rol (rol, estado) VALUES
                                  ('Administrador', TRUE),
                                  ('Usuario', TRUE);

-- Insertar datos en la tabla Usuario
INSERT INTO usuario (id_persona, user, password) VALUES
                                                     (1, 'juanperez', 'password123'),
                                                     (2, 'mariagonzalez', 'securepassword');

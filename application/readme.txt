Escenarios:
===========
se agregan cuentas tomando clientes por su id:
http://localhost:8080/api/cuenta/crear

{
    "estado":"True",
    "saldoInicial":500.00,
    "tipoCuenta":"Ahorro",
    "clienteId":3
}


Se agregan clientes
http://localhost:8080/api/cliente/crear

{
    "clienteId":4,
    "nombre":"renzo",
    "genero":"M",
    "edad":41,
    "identificacion":"0998111883",
    "direccion":"Guasmo Norte",
    "telefono":"0987825185",
    "contrasena":"12354",
    "estado":"True"
}

Se listan todos los movimientos
http://localhost:8080/api/movimiento/movimientos

Se listan los movimientos por fecha
http://localhost:8080/api/movimiento/movimientosPorFecha?fecha=18-08-2022


Insertar un movimiento
http://localhost:8080/api/movimiento/crear

{
        "idMovimiento": 5,
        "numeroCuenta": 4,
        "fecha": "19-08-2022",
        "tipoMovimiento": "Ahorro",
        "valor": 100.0,
        "saldo": 500.0,
        "movimiento": "Retiro de 200.0"
}			

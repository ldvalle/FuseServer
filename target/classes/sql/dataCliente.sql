SELECT estado_cliente, estado_facturacion
FROM cliente
WHERE numero_cliente = :#${header.numeroCliente}
AND estado_cliente = 0
and estado_facturacion = 0

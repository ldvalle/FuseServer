SELECT cod_calle codCalle,
TRIM(nom_calle) nomCalle,
TRIM(nro_dir) altura,
TRIM(piso_dir) piso,
TRIM(depto_dir) depto,
TRIM(nom_partido) partido,
TRIM(nom_comuna) localidad
FROM cliente
WHERE numero_cliente = :#${header.numeroCliente}

# Banca Individual 6.0

## Descripción

La **Banca Individual 6.0** es una aplicación que permite a los usuarios gestionar cuentas bancarias. Los usuarios pueden crear nuevas cuentas, realizar depósitos y retiros, consultar el saldo y ver el historial de transacciones. El programa interactúa con el usuario a través de un menú en la consola.

## Funcionalidades

### Funcionalidades en `MainActivity.kt`

1. **Menú Principal**:
   El programa muestra un menú con tres opciones:

     - Ingresar a una cuenta existente.
     - Crear una nueva cuenta.
     - Salir del sistema.

2. **Ingresar a una Cuenta**:
   - El usuario introduce el número de cuenta.
   - Si la cuenta existe, se puede gestionar con las siguientes opciones: ver saldo, realizar depósitos, retiros y ver el historial de transacciones.

3. **Crear una Nueva Cuenta**:
   - El usuario puede crear una nueva cuenta proporcionando su nombre.
   - La cuenta se inicializa con un número único y un saldo de #1,000.
   - Después de la creación, se puede gestionar la cuenta inmediatamente.

4. **Gestión de Cuenta**:
    Una vez dentro de una cuenta, el usuario tiene acceso a:
   
     - Mostrar el saldo disponible.
     - Realizar un depósito.
     - Realizar un retiro.
     - Ver el historial de transacciones.
     - Volver al menú principal.
     - Salir del sistema.

6. **Salir del Sistema**:
   - El programa ofrece la opción de salir del sistema, finalizando la ejecución.

### Funcionalidades en `CuentaBancaria.kt`

1. **Saldo Inicial**:
   - Cada nueva cuenta se crea con un saldo inicial de 1,000 unidades monetarias.

2. **Depósito**:
   - El usuario puede realizar depósitos en la cuenta.
   - El monto depositado se suma al saldo disponible.
   - Cada depósito se registra en el historial de transacciones con el monto depositado y el saldo actualizado.

3. **Retiro**:
   - El usuario puede retirar dinero de la cuenta, siempre que el saldo sea suficiente.
   - Si el saldo es suficiente, el monto se descuenta del saldo disponible y la transacción se registra en el historial.
   - Si no hay saldo suficiente, se registra un "retiro fallido" en el historial.

4. **Mostrar Saldo**:
   - El usuario puede consultar el saldo disponible de su cuenta en cualquier momento.

5. **Historial de Transacciones**:
   - El sistema mantiene un historial detallado de todas las transacciones (depósitos, retiros y retiros fallidos).
   - El historial muestra el tipo de transacción, el monto y el saldo disponible después de cada operación.

6. **Formato de Moneda**:
   - Los montos de las transacciones y el saldo disponible se formatean utilizando separadores de miles.

## Ejecución del Programa

1. El usuario puede ingresar a una cuenta existente o crear una nueva cuenta.
2. Dentro de la cuenta, se pueden realizar operaciones financieras básicas.
3. El historial de transacciones está disponible para consulta en cualquier momento.
4. El programa se cierra cuando el usuario selecciona la opción de salir.

## Notas

- El saldo inicial de cada nueva cuenta es $1,000.

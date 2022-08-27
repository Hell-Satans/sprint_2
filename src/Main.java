
public class Main {


    public static void main(String[] args) {
        Empresa empresa1=new Empresa("CLARO S.A.S.","Cra 12 # 34 - 56","7603015","123456789-1");
        System.out.println("El nombre de la empresa es: "+empresa1.getNombre());
        System.out.println("La direccion de la empresa es: "+empresa1.getDireccion());
        System.out.println("El telefono de la empresa es: "+empresa1.getTelefono());
        System.out.println("El nit de la empresa es: "+empresa1.getNit());
        empresa1.setNombre("COMCEL SAS");
        empresa1.setDireccion("Calle 77 # 15 - 14");
        empresa1.setTelefono("4856355");
        empresa1.setNit("55658444-2");
        System.out.println("La empresa cambio su razon social a: "+empresa1.getNombre());
        System.out.println("La empresa cambio su dirección a: "+empresa1.getDireccion());
        System.out.println("La empresa cambio su telefono a: "+empresa1.getTelefono());
        System.out.println("La empresa cambio su nit a: "+empresa1.getNit());

        Empleado empleado1=new Empleado("Julian Mesa","123456789","3203332222","Gerente","julianmesa@gmail.com");
        System.out.println("El nombre del empleado es: "+empleado1.getNombre());
        System.out.println("La identificacion del empleado es: "+empleado1.getId());
        System.out.println("El telefono del empleado es: "+empleado1.getTelefono());
        System.out.println("El correo del empleado es: "+empleado1.getCorreo());
        System.out.println("El cargo del empleado es: "+empleado1.getCargo());
        empleado1.setNombre("Juan Ruiz");
        empleado1.setId("987654321");
        empleado1.setTelefono("3204445555");
        empleado1.setCargo("Asesor comercial");
        empleado1.setCorreo("ruizjuan@gmail.com");
        System.out.println("Se cambio el nombre del empleado a: "+empleado1.getNombre());
        System.out.println("Se cambio la id del empleado a: "+empleado1.getId());
        System.out.println("Se cambio el cargo del empleado a: "+empleado1.getCargo());
        System.out.println("Se cambio el correo del empleado a: "+empleado1.getCorreo());



        MovimientoDinero micuenta = new MovimientoDinero("1223", "ahorro",150000);
        System.out.println("Saldo minimo : " +micuenta.getSaldoMinimo());
        micuenta.consignar(80000);
        System.out.println("Saldo Actual : " +micuenta.getSaldoActual());
        micuenta.retirar(50000);

        System.out.println("Saldo Actual : " +micuenta.getSaldoActual());

        MovimientoDinero sebasCuenta = new MovimientoDinero("2223","Credito",100000);
        System.out.println(sebasCuenta.toString());




    }
}

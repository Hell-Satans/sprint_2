//public class Main {

   // public static void main(String[] args) {
       // Empresa empresa1=new Empresa("CLARO S.A.S.","Cra 12 # 34 - 56","7603015","123456789-1");
       // System.out.println("El nombre de la empresa es: "+empresa1.getNombre());
      //  System.out.println("La direccion de la empresa es: "+empresa1.getDireccion());
      //  System.out.println("El telefono de la empresa es: "+empresa1.getTelefono());
      //  System.out.println("El nit de la empresa es: "+empresa1.getNit());
      //  empresa1.setNombre("COMCEL SAS");
       // empresa1.setDireccion("Calle 77 # 15 - 14");
     //   empresa1.setTelefono("4856355");
       // empresa1.setNit("55658444-2");
       // System.out.println("La empresa cambio su razon social a: "+empresa1.getNombre());
      //  System.out.println("La empresa cambio su dirección a: "+empresa1.getDireccion());
      //  System.out.println("La empresa cambio su telefono a: "+empresa1.getTelefono());
      //  System.out.println("La empresa cambio su nit a: "+empresa1.getNit());
   // }
    public static void main(String[] args) {

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

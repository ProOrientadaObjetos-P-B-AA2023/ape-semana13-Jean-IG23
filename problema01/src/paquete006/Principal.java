public class Principal {
        public static void main(String[] args) {
            BilleteraPagos billetera = new BilleteraPagos();
            ArrayList<PagoAguaPotable> pagoAgua = new ArrayList<>();
            ArrayList<PagoLuzElectrica> pagoLuz = new ArrayList<>();
            ArrayList<PagoPredial> predio = new ArrayList<>();
            ArrayList<PagoTelefonoConvencional> telefono = new ArrayList<>();

            double[][] AguaCasa = new DatosAgua().datosCasas();
            for (int i = 0; i < AguaCasa.length; i++) {
                pagoAgua.add(new PagoAguaPotable("Casa", AguaCasa[i][0],AguaCasa[i][1],AguaCasa[i][2]));
            }
            double[][] AguaComercial = new DatosAgua().datosComerciales();
            for (int i = 0; i < AguaComercial.length; i++) {
                pagoAgua.add(new PagoAguaPotable("Comercial", AguaComercial[i][0],AguaComercial[i][1],AguaComercial[i][2]));
            }
            double[][] LuzCasa = new DatosLuz().datosLoja();
            Ciudad ci = new Ciudad("Loja");
            for (int i = 0; i < LuzCasa.length; i++) {
                pagoLuz.add(new PagoLuzElectrica(ci, LuzCasa[i][0],LuzCasa[i][1],LuzCasa[i][2]));
            }
            double[][] LuzComercio = new DatosLuz().datosGeneral();
            Ciudad ci1 = new Ciudad("Quito");
            for (int i = 0; i < LuzComercio.length; i++) {
                pagoLuz.add(new PagoLuzElectrica(ci1, LuzComercio[i][0],LuzComercio[i][1], LuzComercio[i][2]));
            }
            double[][] Propiedades = new DatosPropiedades().datos();
            for (int i = 0; i < Propiedades.length; i++) {
                predio.add(new PagoPredial(Propiedades[i][0],Propiedades[i][1]));
            }
            double[][] Telefono = new DatosTelefono().datos();
            for (int i = 0; i < Telefono.length; i++) {
                telefono.add(new PagoTelefonoConvencional(Telefono[i][0],Telefono[i][1],Telefono[i][2]));
            }
            for (Pagos pago : pagoAgua) {
                pago.calcularPagos();
            }
            for (Pagos pago : pagoLuz) {
                pago.calcularPagos();
            }
            for (Pagos pago : predio) {
                pago.calcularPagos();
            }
            for (Pagos pago : telefono) {
                pago.calcularPagos();
            }

            CalcularAPagar1 cal = new CalcularAPagar1(pagoAgua,pagoLuz,predio,telefono);
            Persona per = new Persona("Jean", "Iñiguez", 19,"1105727992",ci);
            billetera = new BilleteraPagos(per,"Julio",pagoAgua,pagoLuz,predio,telefono,cal.calcularAPagar1());
            System.out.println(billetera);
        }
}

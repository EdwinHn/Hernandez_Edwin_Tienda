/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_tienda;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_Tienda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        int menu = 1;
        String opcion;
        int abrir = 0;

        String descuento = "";

        double dineroCaja = 0;
        int comprasRealizadas = 0;
        double comprasTotal = 0;
        double promedioCompras = 0;
        int ventasRealizadas = 0;
        double ventasTotal = 0;
        double promedioVentas = 0;
        double retirar = 0;

        double ventaMayor = 0;
        double compraMayor = 0;

        String ventaMayorString = "";
        String compraMayorString = "";

        int stockAvena=0;
        int stockAzucar=0;
        int stockMaiz=0;
        int stockTrigo=0;
        
        String avena = "Avena";
        String azucar = "Azucar";
        String maiz = "Maiz";
        String trigo = "Trigo";

        String rank1String = "";
        String rank2String = "";
        String rank3String = "";
        String rank4String = "";

        int rankAvena = 0;
        int rankAzucar = 0;
        int rankMaiz = 0;
        int rankTrigo = 0;

        int rank1 = 0;
        int rank2 = 0;
        int rank3 = 0;
        int rank4 = 0;

        
        
        
        
        //Menú Principal
        while (menu > 0) {

            System.out.println("----- TIENDA -----\n"
                    + "  Menú Prinicipal\n");
            System.out.println("1- Abrir caja");
            System.out.println("2- Ventas");
            System.out.println("3- Compras");
            System.out.println("4- Reportes");
            System.out.println("5- Cerrar caja");
            System.out.println("6- Salir\n");

            //Ingreso de opción
            System.out.print("Ingrese su opción: ");
            opcion = scan.next();
            System.out.println("");

            //Ingreso de opción inválida
            if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4") && !opcion.equals("5") && !opcion.equals("6")) {
                System.out.println("Ingrese una opción válida\n");

                //Opción 1 - Abrir Caja
            } else if (opcion.equals("1")) {
                System.out.println("*** Abrir Caja ***\n");

                if (abrir == 0) {
                    System.out.print("Ingrese la cantidad de efectivo que desea guardar en caja: LPS.");
                    double deposito = scan.nextDouble();

                    dineroCaja += deposito;
                }

                abrir = 0;

                System.out.println("La caja está abierta\n");

                
                
                
                
                //Opción 2- Ventas  
            } else if (opcion.equals("2") && abrir == 0) {
                System.out.println("*** Ventas ***\n");

                double precioVenta = 0;
                double ventaAzucar = 30;
                double ventaAvena = 25;
                double ventaTrigo = 32;
                double ventaMaiz = 20;

                double ISV = 0;
                double subTotalVenta = 0;
                double totalVenta = 0;
                double finalVenta = 0;
                double descuentoVenta = 0;
                String facturaVenta = "";
                String productoVendido = "";

                String tipoCliente;
                int cicloTipoCliente = 1;

                int cicloProducto = 1;
                int codigoProducto;

                int contadorProducto = 0;
                int cantidadProducto;
                int stockProducto=0;
                int cicloCantidad = 1;

                int cicloVenta = 1;

                System.out.print("Ingrese su tipo de cliente (A/B/C): ");
                tipoCliente = scan.next().toLowerCase();

                do {

                    if (!tipoCliente.equals("a") && !tipoCliente.equals("b") && !tipoCliente.equals("c")) {
                        System.out.print("Ingrese una opción válida: ");
                        tipoCliente = scan.next().toLowerCase();

                    } else {
                        cicloTipoCliente = 0;

                    }

                } while (cicloTipoCliente > 0);

                do {
                    
                    subTotalVenta = 0;
                    String otraVenta;
                    int cicloOtraVenta = 1;

                    if (tipoCliente.equals("a")) {

                        System.out.println("\nCódigo   |   Producto   |     Precio (Kg)\n"
                                + "1        |    Azúcar    |     Lps.30\n"
                                + "2        |    Avena     |     Lps.25\n"
                                + "3        |    Trigo     |     Lps.32\n"
                                + "4        |    Maíz      |     Lps.20\n");


                    } else if (tipoCliente.equals("b")) {
                        System.out.println("\nCódigo   |   Producto   |     Precio(Kg)\n"
                                + "1        |    Azúcar    |     Lps.30\n"
                                + "2        |    Avena     |     Lps.25\n"
                                + "3        |    Trigo     |     Lps.32\n");


                    } else if (tipoCliente.equals("c")) {
                        System.out.println("\nCódigo   |   Producto   |     Precio(Kg)\n"
                                + "4        |    Maíz      |     Lps.20\n");

                    }

                    System.out.print("Ingrese el código del producto a vender: ");
                    codigoProducto = scan.nextInt();

                    do {

                        if (codigoProducto != 1 && codigoProducto != 2 && codigoProducto != 3 && codigoProducto != 4) {
                            System.out.print("Ingrese un código válido: ");
                            codigoProducto = scan.nextInt();

                        } else if (tipoCliente.equals("b") && codigoProducto == 4) {
                            System.out.println("No puede vender este producto a este cliente");
                            System.out.print("Ingrese un código válido: ");
                            codigoProducto = scan.nextInt();

                        } else if (tipoCliente.equals("c") && (codigoProducto == 1 || codigoProducto == 2 || codigoProducto == 3)) {
                            System.out.println("No puede vender este producto a este cliente");
                            System.out.print("Ingrese un código válido: ");
                            codigoProducto = scan.nextInt();

                        } else if (tipoCliente.equals("a")) {
                            cicloProducto = 0;

                        } else if (tipoCliente.equals("b") && (codigoProducto == 1 || codigoProducto == 2 || codigoProducto == 3)) {
                            cicloProducto = 0;

                        } else if (tipoCliente.equals("c") && codigoProducto == 4) {
                            cicloProducto = 0;

                        }

                        if (codigoProducto == 1) {
                            productoVendido = "Azúcar";
                            precioVenta = ventaAzucar;
                            stockProducto=stockAzucar;

                        } else if (codigoProducto == 2) {
                            productoVendido = "Avena ";
                            precioVenta = ventaAvena;
                            stockProducto=stockAvena;

                        } else if (codigoProducto == 3) {
                            productoVendido = "Trigo ";
                            precioVenta = ventaTrigo;
                            stockProducto=stockTrigo;

                        } else if (codigoProducto == 4) {
                            productoVendido = "Maíz  ";
                            precioVenta = ventaMaiz;
                            stockProducto=stockMaiz;

                        }

                    } while (cicloProducto > 0);

                    System.out.print("Ingrese la cantidad a vender (Kg): ");
                    cantidadProducto = scan.nextInt();

                    do {

                        if (cantidadProducto <= 0) {
                            System.out.print("Ingrese una cantidad válida: ");
                            cantidadProducto = scan.nextInt();

                        } else if (stockProducto<cantidadProducto){
                            System.out.println("\nNo hay suficiente producto para realizar la compra");
                            System.out.println("Ingrese una cantidad menor o intente con otro producto");
                            cicloCantidad = 0;
                            
                        } else {
                            subTotalVenta = precioVenta * cantidadProducto;
                            System.out.println("Lps."+subTotalVenta);
                            
                            cicloCantidad = 0;
                        }

                    } while (cicloCantidad > 0);

                    System.out.print("\n¿Desea procesar otra venta? (si/no): ");
                    otraVenta = scan.next().toLowerCase();

                    do {
                        if (!otraVenta.equals("si") && !otraVenta.equals("no")) {
                            System.out.print("Igrese una respuesta válida: ");
                            otraVenta = scan.next().toLowerCase();

                        } else if (otraVenta.equals("si") && (stockProducto<cantidadProducto)) {
                            cicloOtraVenta = 0;
                            
                        } else if (otraVenta.equals("si")) {
                            if (productoVendido.equals("Avena ")) {
                                stockAvena -= cantidadProducto;
                                rankAvena += cantidadProducto;

                            } else if (productoVendido.equals("Azúcar")) {
                                stockAzucar -= cantidadProducto;
                                rankAzucar += cantidadProducto;

                            } else if (productoVendido.equals("Maíz  ")) {
                                stockMaiz -= cantidadProducto;
                                rankMaiz += cantidadProducto;

                            } else if (productoVendido.equals("Trigo ")) {
                                stockTrigo -= cantidadProducto;
                                rankTrigo += cantidadProducto;

                            }
                            contadorProducto++;
                            facturaVenta += contadorProducto + "- " + productoVendido + "      " + cantidadProducto + "Kg        Lps." + subTotalVenta + "\n";
                            cicloOtraVenta = 0;
                        
                        } else if (otraVenta.equals("no") && (stockProducto<cantidadProducto) && (facturaVenta.equals(""))) {
                            cicloOtraVenta=0;
                            cicloVenta=0;
                            
                        } else if (otraVenta.equals("no") && (stockProducto<cantidadProducto)){
                            cicloOtraVenta=0;

                        } else if (otraVenta.equals("no")) {
                            if (productoVendido.equals("Avena ")) {
                                stockAvena -= cantidadProducto;
                                rankAvena += cantidadProducto;

                            } else if (productoVendido.equals("Azúcar")) {
                                stockAzucar -= cantidadProducto;
                                rankAzucar += cantidadProducto;

                            } else if (productoVendido.equals("Maíz  ")) {
                                stockMaiz -= cantidadProducto;
                                rankMaiz += cantidadProducto;

                            } else if (productoVendido.equals("Trigo ")) {
                                stockTrigo -= cantidadProducto;
                                rankTrigo += cantidadProducto;

                            }
                            
                            contadorProducto++;
                            facturaVenta += contadorProducto + "- " + productoVendido + "      " + cantidadProducto + "Kg        Lps." + subTotalVenta + "\n";

                            cicloOtraVenta=0;
                            cicloVenta=0;
                            
                        }

                    } while (cicloOtraVenta > 0);

                    totalVenta += subTotalVenta;
                    
                    if (!facturaVenta.equals("") && !otraVenta.equals("si")) {

                        ISV = (totalVenta * 0.07);
                        double ISVrounded = (Math.round(ISV * 100.0) / 100.0);

                        if (totalVenta > 1000 && totalVenta <= 5000) {
                            descuento = "5%";
                            descuentoVenta = totalVenta * 0.05;
                            finalVenta = (totalVenta - descuentoVenta) + ISV;

                        } else if (totalVenta > 5000) {
                            descuento = "10%";
                            descuentoVenta = totalVenta * 0.1;
                            descuentoVenta = (Math.round(descuentoVenta * 100.0) / 100.0);
                            finalVenta = (totalVenta - descuentoVenta) + ISV;

                        } else {
                            descuento = "0%";
                            finalVenta = totalVenta + ISV;
                        }

                        finalVenta = (Math.round(finalVenta * 100.0) / 100.0);

                        System.out.println("\n*** Factura ***\n");
                        System.out.println("   Producto    Cantidad    Subtotal");
                        System.out.println(facturaVenta);
                        System.out.println("ISV 7%: Lps." + ISVrounded);
                        System.out.println("Descuento: " + descuento + " -Lps." + descuentoVenta);
                        System.out.println("Total: Lps." + finalVenta + "\n");

                        dineroCaja += finalVenta;
                        ventasTotal += finalVenta;
                        descuentoVenta = 0;
                        cicloOtraVenta = 0;
                        cicloVenta = 0;

                        if (finalVenta > ventaMayor) {
                            ventaMayor = finalVenta;
                            ventaMayorString = facturaVenta;
                        }

                        //Ranking
                        //Comparando productos 1 y 2
                        if (rankMaiz >= rankAzucar) {
                            rank1String = maiz;
                            rank2String = azucar;

                            rank1 = rankTrigo;
                            rank2 = rankAvena;

                        } else {
                            rank1String = azucar;
                            rank2String = maiz;

                            rank1 = rankAzucar;
                            rank2 = rankMaiz;

                        }

                        //Comparando producto 3
                        if (rankTrigo >= rank1) {
                            rank3String = rank2String;
                            rank2String = rank1String;
                            rank1String = trigo;

                            rank3 = rank2;
                            rank2 = rank1;
                            rank1 = rankTrigo;

                        } else if (rankTrigo >= rank2) {
                            rank3String = rank2String;
                            rank2String = trigo;

                            rank3 = rank2;
                            rank2 = rankTrigo;

                        } else {
                            rank3String = trigo;
                            rank3 = rankTrigo;

                        }

                        //Comparando producto 4
                        if (rankAvena >= rank1) {
                            rank4String = rank3String;
                            rank3String = rank2String;
                            rank2String = rank1String;
                            rank1String = avena;

                            rank4 = rank3;
                            rank3 = rank2;
                            rank2 = rank1;
                            rank1 = rankAvena;

                        } else if (rankAvena >= rank2) {
                            rank4String = rank3String;
                            rank3String = rank2String;
                            rank2String = avena;

                            rank4 = rank3;
                            rank3 = rank2;
                            rank2 = rankAvena;

                        } else if (rankAvena >= rank3) {
                            rank4String = rank3String;
                            rank3String = avena;

                            rank4 = rank3;
                            rank3 = rankAvena;

                        } else {
                            rank4String = avena;
                            rank4 = rankAvena;
                        }

                        ventasRealizadas++;
                        
                        } else {
                            System.out.println("");
                            
                        }

                } while (cicloVenta > 0);


                
                                
                
                //Opción 3 - Compras
            } else if (opcion.equals("3") && abrir == 0) {
                System.out.println("*** Compras ***\n");

                double precioCompra = 0;
                double compraAzucar = 25;
                double compraAvenaB = 20;
                double compraAvenaC = 22;
                double compraTrigo = 30;
                double compraMaiz = 18;

                double ISV = 0;
                double subTotalCompra = 0;
                double totalCompra = 0;
                double finalCompra = 0;
                String facturaCompra = "";
                String productoComprado = "";

                String tipoProveedor;
                int cicloTipoProveedor = 1;

                int cicloProducto = 1;
                int codigoProducto;

                int contadorProducto = 0;
                int cantidadProducto;
                int cicloCantidad = 1;

                int cicloCompra = 1;

                System.out.print("Ingrese su tipo de proveedor (A/B/C): ");
                tipoProveedor = scan.next().toLowerCase();

                do {

                    if (!tipoProveedor.equals("a") && !tipoProveedor.equals("b") && !tipoProveedor.equals("c")) {
                        System.out.print("Ingrese una opción válida: ");
                        tipoProveedor = scan.next().toLowerCase();

                    } else {
                        cicloTipoProveedor = 0;

                    }

                } while (cicloTipoProveedor > 0);

                do {

                    if (tipoProveedor.equals("a")) {

                        System.out.println("\nCódigo   |   Producto   |     Precio/(Kg)\n"
                                + "1        |    Azúcar    |     Lps.25\n"
                                + "4        |    Maíz      |     Lps.18\n");


                    } else if (tipoProveedor.equals("b")) {
                        System.out.println("\nCódigo   |   Producto   |     Precio/(Kg)\n"
                                + "2        |    Avena     |     Lps.25\n"
                                + "3        |    Trigo     |     Lps.20\n");


                    } else if (tipoProveedor.equals("c")) {
                        System.out.println("\nCódigo   |   Producto   |     Precio/(Kg)\n"
                                + "2        |    Avena      |     Lps.22\n");

                    }

                    System.out.print("Ingrese el código del producto a comprar: ");
                    codigoProducto = scan.nextInt();

                    do {

                        if (codigoProducto != 1 && codigoProducto != 2 && codigoProducto != 3 && codigoProducto != 4) {
                            System.out.print("Ingrese un código válido: ");
                            codigoProducto = scan.nextInt();

                        } else if (tipoProveedor.equals("a") && (codigoProducto == 2 || codigoProducto == 3)) {
                            System.out.println("No puede comprar este producto a este proveedor");
                            System.out.print("Ingrese un código válido: ");
                            codigoProducto = scan.nextInt();

                        } else if (tipoProveedor.equals("b") && (codigoProducto == 1 || codigoProducto == 4)) {
                            System.out.println("No puede comprar este producto a este proveedor");
                            System.out.print("Ingrese un código válido: ");
                            codigoProducto = scan.nextInt();

                        } else if (tipoProveedor.equals("c") && (codigoProducto == 1 || codigoProducto == 3 || codigoProducto == 4)) {
                            System.out.println("No puede comprar este producto a este proveedor");
                            System.out.print("Ingrese un código válido: ");
                            codigoProducto = scan.nextInt();

                        } else if (tipoProveedor.equals("a") && (codigoProducto == 1 || codigoProducto == 4)) {
                            cicloProducto = 0;

                        } else if (tipoProveedor.equals("b") && (codigoProducto == 2 || codigoProducto == 3)) {
                            cicloProducto = 0;

                        } else if (tipoProveedor.equals("c") && codigoProducto == 2) {
                            cicloProducto = 0;

                        }

                        if (codigoProducto == 1) {
                            productoComprado = "Azúcar";
                            precioCompra = compraAzucar;

                        } else if (codigoProducto == 2 && tipoProveedor.equals("b")) {
                            productoComprado = "Avena ";
                            precioCompra = compraAvenaB;

                        } else if (codigoProducto == 2 && tipoProveedor.equals("c")) {
                            productoComprado = "Avena ";
                            precioCompra = compraAvenaC;

                        } else if (codigoProducto == 3) {
                            productoComprado = "Trigo ";
                            precioCompra = compraTrigo;

                        } else if (codigoProducto == 4) {
                            productoComprado = "Maíz  ";
                            precioCompra = compraMaiz;

                        }

                    } while (cicloProducto > 0);

                    System.out.print("Ingrese la cantidad a comprar (Kg): ");
                    cantidadProducto = scan.nextInt();

                    do {

                        if (cantidadProducto <= 0) {
                            System.out.print("Ingrese una cantidad válida: ");
                            cantidadProducto = scan.nextInt();

                        } else {
                            cicloCantidad = 0;
                        }

                    } while (cicloCantidad > 0);

                    subTotalCompra = precioCompra * cantidadProducto;
                    totalCompra += subTotalCompra;
                    
                    if (totalCompra>dineroCaja){
                        System.out.println("\nNO SE PUEDE PAGAR LA COMPRA\n");
                        cicloCompra=0;
                        
                    } else {
                        System.out.println("\n*** Factura ***\n");
                        System.out.println("Producto    Cantidad");
                        System.out.println(productoComprado+"      "+cantidadProducto+"Kg");
                        System.out.println("\nTotal: Lps." + totalCompra + "\n");
                        
                        if (productoComprado.equals("Avena ")) {
                            stockAvena += cantidadProducto;

                        } else if (productoComprado.equals("Azúcar")) {
                            stockAzucar += cantidadProducto;

                        } else if (productoComprado.equals("Maíz  ")) {
                            stockMaiz += cantidadProducto;

                        } else if (productoComprado.equals("Trigo ")) {
                            stockTrigo += cantidadProducto;

                        }
                        dineroCaja -= totalCompra;
                        comprasRealizadas++;
                        cicloCompra = 0;

                        if (totalCompra > compraMayor) {
                            compraMayor = totalCompra;
                            compraMayorString = (productoComprado + "    " + cantidadProducto + "kg\n");
                        }

                    }
                    
                    comprasTotal += totalCompra;

                } while (cicloCompra > 0);


                
                
                //Opción 4 - Reportes
            } else if (opcion.equals("4")) {

                dineroCaja = (Math.round(dineroCaja * 100.0) / 100.0);
                promedioVentas = (ventasTotal / ventasRealizadas);
                promedioVentas = (Math.round(promedioVentas * 100.0) / 100.0);
                promedioCompras = (comprasTotal / comprasRealizadas);
                promedioCompras = (Math.round(promedioCompras * 100.0) / 100.0);

                System.out.println("*** Reportes ***\n");
                System.out.println("-Dinero en caja: LPS." + dineroCaja+"\n");
                System.out.println("-Ventas realizadas: " + ventasRealizadas);
                System.out.println("-Venta con más ganancias: Lps." + ventaMayor + "\n" + ventaMayorString);
                System.out.println("-Compras realizadas: " + comprasRealizadas);
                System.out.println("-Compra con más gasto: Lps." + compraMayor + "\n" + compraMayorString + "");
                System.out.println("-Volumen de Ventas: Lps."+ventasTotal);
                System.out.println("-Volumen de Compras: Lps."+comprasTotal);
                System.out.println(" Margen de ganancia: Lps."+(ventasTotal-comprasTotal)+"\n");
                System.out.println("-Valor medio de Venta: Lps."+(promedioVentas+0));
                System.out.println("-Valor medio de Compra: Lps."+(promedioCompras+0)+"\n");
                System.out.println("-Producto Estrella: " + rank1String + " " + rank1 + "kg\n");
                System.out.println("-Ranking:");
                System.out.println("1- " + rank1String + ": " + rank1 + "kg");
                System.out.println("2- " + rank2String + ": " + rank2 + "kg");
                System.out.println("3- " + rank3String + ": " + rank3 + "kg");
                System.out.println("4- " + rank4String + ": " + rank4 + "kg\n");

                
                
                
                
                //Opción 5 - Cerrar Caja
            } else if (opcion.equals("5") && abrir == 0) {

                int cicloRetirar = 1;

                System.out.println("*** Cerrar Caja ***\n");

                System.out.print("Ingrese la cantidad que desea depositar en el banco (max. Lps." + ((Math.round(dineroCaja * 0.6) * 100.0) / 100.0) + "): Lps.");

                do {
                    retirar = scan.nextDouble();

                    if (retirar < 0 || retirar > (dineroCaja * 0.6)) {
                        System.out.print("Ingrese una cantidad válida (max. Lps." + ((Math.round(dineroCaja * 0.6) * 100.0) / 100.0) + "): Lps.");

                    } else {
                        dineroCaja -= retirar;
                        cicloRetirar = 0;

                    }

                    rank1String = "";
                    rank2String = "";
                    rank3String = "";
                    rank4String = "";

                    rankMaiz = 0;
                    rankAzucar = 0;
                    rankTrigo = 0;
                    rankAvena = 0;

                    rank1 = 0;
                    rank2 = 0;
                    rank3 = 0;
                    rank4 = 0;

                    comprasRealizadas = 0;
                    ventasRealizadas = 0;

                    ventaMayor = 0;
                    ventasTotal = 0;
                    compraMayor = 0;
                    comprasTotal = 0;
                    ventaMayorString = "";
                    compraMayorString = "";

                    abrir = 1;

                    System.out.println("La caja se ha cerrado\n");

                } while (cicloRetirar > 0);


                
                //Opción 6 - Salir
            } else if (opcion.equals("6")) {
                System.out.println("adios :)");
                menu = 0;

            } else if (abrir == 1) {
                System.out.println("La caja está cerrada\n");
            }
        }
    }
}

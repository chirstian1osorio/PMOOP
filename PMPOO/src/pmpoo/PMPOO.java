package pmpoo;
/**
 *
 * @author alfre
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PMPOO {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        int elegir;
      
        do{
        System.out.println("Bienvenido a la tienda de musica");
        System.out.println("1-Cliente");
        System.out.println("2-Gerente");
        System.out.println("3-Vendedor");
        System.out.println("4-Empacador");
        System.out.println("5-Salir");
        System.out.println("Por favor ingrese el numero segun corresponda");
        elegir=teclado.nextInt();
        
        int a;
        String correo, contraseña,p,o;//para ingresar, registrar,todos
        String nombre;int edad,decision;// para mostrar datos del usuario,todos
        int numA;//Para cliente
        int albumV=0,clientesV=0;//para vendedor
        
        Producto p1=new Producto(234.50,"Antonio Guzman",7,22.6);
        Producto p2=new Producto(345.10,"Pepe Aguilar",10,30.6);
        Producto p3=new Producto(123.45,"Tayler Scott",6,18.2);
        Producto p4=new Producto(453.23,"Solera",6,19.6);
        Producto p5=new Producto(200.00,"Avicci",8,26.2);
        Producto p6=new Producto(645.23,"Gun´s roses",14,41.2);
        Producto p7=new Producto(123.34,"Patria alta",5,16.9);
        Producto p8=new Producto(784.32,"Black",11,34.7);
        Producto p9=new Producto(432.12,"Noche alternas",9,28.1);
        Producto p10=new Producto(324.30,"Selena",9,29.8);
        
        switch(elegir){
            case 1: 
                System.out.println("\tBienvenido Cliente");
                System.out.println("¿Tiene una cuenta?");
                System.out.println("1- Si");
                System.out.println("2- No");
                a=teclado.nextInt();
                if(a==1){
                    System.out.println("Ingrese su correo: ");
                    p=teclado.nextLine();
                    correo=teclado.nextLine();
                    System.out.println("Ingrese su contraseña: ");
                    contraseña=teclado.nextLine();
                    ingresar(correo,contraseña);                 
                }else{
                    System.out.println("Ingrese un correo: ");
                    o=teclado.nextLine();
                    correo=teclado.nextLine();
                    System.out.println("Ingrese una contraseña: ");
                    contraseña=teclado.nextLine();
                    crear(correo,contraseña);
                }
                System.out.println("\nIngrese su nombre completo: ");
                nombre=teclado.nextLine();
                System.out.println("Ingrese su edad: ");
                edad=teclado.nextInt();
                System.out.println("\n");
                Cliente cliente=new Cliente(nombre,edad,correo);
                
                do{
                System.out.println("¿Que desea hacer?");
                System.out.println("1-Comprar");
                System.out.println("2-Eliminar cuenta");
                System.out.println("3-Consultar cuenta");
                System.out.println("4-Salir");
                decision=teclado.nextInt();
                
                switch(decision){
                    case 1:
                        System.out.println("\tComprar");
                        System.out.println("\n");
                        try{
                            System.out.println("1-Album Antonio Guzman");
                            System.out.println("2-Album Pepe Aguilar");
                            System.out.println("3-Tayler Scott");
                            System.out.println("4-Solera");
                            System.out.println("5-Avicci");
                            System.out.println("6-Gun´s roses");
                            System.out.println("7-Patria alta");
                            System.out.println("8-Black");
                            System.out.println("9-Noche alternas");
                            System.out.println("10-Selena");
                            System.out.println("Ingrese el numero del album a comprar");
                            numA=teclado.nextInt();
                            FileWriter fw= new FileWriter("ticket.txt");    
                            BufferedWriter bw=new BufferedWriter(fw);
                            PrintWriter salida=new PrintWriter(bw);
                            salida.println(cliente);
                        if(numA==1){
                            salida.println(p1);
                            salida.close();
                        }else if(numA==2){
                            salida.println(p2);
                            salida.close();
                        }else if(numA==3){
                            salida.println(p3);
                            salida.close();
                        }else if(numA==4){
                            salida.println(p4);
                            salida.close();
                        }else if(numA==5){
                           salida.println(p5);
                           salida.close();
                        }else if(numA==6){
                           salida.println(p6);
                           salida.close();
                        }else if(numA==7){
                            salida.println(p7);
                            salida.close();
                        }else if(numA==8){
                            salida.println(p8);
                            salida.close();
                        }else if(numA==9){
                            salida.println(p9);
                            salida.close();
                        }else if(numA==10){
                            salida.println(p10);
                            salida.close();
                        }
                        System.out.println("\tTicket Generado");
                        }catch(IOException e){}
                        
                        FileReader fr;
                        BufferedReader br;
                        try{
                        fr= new FileReader("ticket.txt");
                        br=new BufferedReader(fr);
                        System.out.println("el contenido del archivo es:");
                        String linea=br.readLine();
                        while(linea != null){
                        System.out.println(linea);
                        linea=br.readLine();
                        }
                        br.close();
                        }catch(IOException e){}
                        break;
                    case 2:
                        System.out.println("\tEliminar cuenta");
                        cliente=null;
                        System.out.println("Cliente eliminado");
                        break;
                    case 3:
                        System.out.println("\tConsultar Cuenta");
                        System.out.println(cliente);
                        break;
                    case 4:
                        System.out.println("Hasta luego "+nombre);
                        break;
                    default:
                        System.out.println("\t**Opcion invalida**");
                }
                }while(decision!=4);
                break;
            case 2: 
                System.out.println("\tBienvenido Gerente");
                System.out.println("¿Tiene una cuenta?");
                System.out.println("1- Si");
                System.out.println("2- No");
                a=teclado.nextInt();
                if(a==1){
                    System.out.println("Ingrese su correo: ");
                    p=teclado.nextLine();
                    correo=teclado.nextLine();
                    System.out.println("Ingrese su contraseña: ");
                    contraseña=teclado.nextLine();
                    ingresar(correo,contraseña);
                }else{
                    System.out.println("Ingrese un correo: ");
                    o=teclado.nextLine();
                    correo=teclado.nextLine();
                    System.out.println("Ingrese una contraseña: ");
                    contraseña=teclado.nextLine();
                    crear(correo,contraseña);
                }
                System.out.println("\nIngrese su nombre completo: ");
                nombre=teclado.nextLine();
                System.out.println("Ingrese su edad: ");
                edad=teclado.nextInt();
                Empleado gerente=new Empleado(nombre,edad,correo);
                
                do{
                System.out.println("¿Que desea hacer Gerente?");
                System.out.println("1-Ver inventario");
                System.out.println("2-Ver ventas");
                System.out.println("3-Ver ticket");
                System.out.println("4-Eliminar cuenta");
                System.out.println("5-Ver cuenta");
                System.out.println("6-Salir");
                decision=teclado.nextInt();
                int i=1;
                switch(decision){
                    case 1:
                        System.out.println("\tVer inventario");
                        System.out.println("Lista de productos");
                        System.out.println("1- "+p1);
                        System.out.println("2- "+p2);
                        System.out.println("3- "+p3);
                        System.out.println("4- "+p4);
                        System.out.println("5- "+p5);
                        System.out.println("6- "+p6);
                        System.out.println("7- "+p7);
                        System.out.println("8- "+p8);
                        System.out.println("9- "+p9);
                        System.out.println("10- "+p10);
                        break;
                    case 2:
                        System.out.println("\tVer ventas");
                        albumV=albumV+i; clientesV=clientesV+i;
                        ventas(albumV,clientesV);
                        break;
                    case 3:
                        System.out.println("\tVer compras");
                        FileReader fr;
                        BufferedReader br;
                        try{
                        fr= new FileReader("ticket.txt");
                        br=new BufferedReader(fr);
                        System.out.println("el contenido del archivo es:");
                        String linea=br.readLine();
                        while(linea != null){
                        System.out.println(linea);
                        linea=br.readLine();
                        }
                        br.close();
                        }catch(IOException e){}
                        break;
                    case 4: 
                        System.out.println("\tEliminar cuenta");
                        gerente= null;
                        System.out.println("Gerente eliminado");
                        break;
                    case 5:
                        System.out.println("\tConsultar cuenta");
                        System.out.println(gerente);
                        break;
                    case 6:
                        System.out.println("\tHasta luego Gerente "+nombre);
                        break;
                    default:
                        System.out.println("**\tOpcion invalida**");
                        
                }
                }while(decision!=6);
                
                break;
            case 3: 
                System.out.println("\tBienvenido Vendedor");
                System.out.println("¿Tiene una cuenta?");
                System.out.println("1- Si");
                System.out.println("2- No");
                a=teclado.nextInt();
                if(a==1){
                    System.out.println("Ingrese su correo: ");
                    p=teclado.nextLine();
                    correo=teclado.nextLine();
                    System.out.println("Ingrese su contraseña: ");
                    contraseña=teclado.nextLine();
                    ingresar(correo,contraseña);
                }else{
                    System.out.println("Ingrese un correo: ");
                    o=teclado.nextLine();
                    correo=teclado.nextLine();
                    System.out.println("Ingrese una contraseña: ");
                    contraseña=teclado.nextLine();
                    crear(correo,contraseña);
                }
                
                System.out.println("\nIngrese su nombre completo: ");
                nombre=teclado.nextLine();
                System.out.println("Ingrese su edad: ");
                edad=teclado.nextInt();
                Empleado vendedor= new Empleado(nombre,edad,correo);
                
                do{
                System.out.println("¿Que desea hacer Vendedor?");
                System.out.println("1-Ver inventario");
                System.out.println("2-Inroducir numero de ventas");
                System.out.println("3-Eliminar cuenta");
                System.out.println("4-Ver cuenta");
                System.out.println("5-Salir");
                decision=teclado.nextInt();
                
                switch(decision){
                    case 1:
                        System.out.println("\tVer inventario");
                        System.out.println("Lista de productos");
                        System.out.println("1- "+p1);
                        System.out.println("2- "+p2);
                        System.out.println("3- "+p3);
                        System.out.println("4- "+p4);
                        System.out.println("5- "+p5);
                        System.out.println("6- "+p6);
                        System.out.println("7- "+p7);
                        System.out.println("8- "+p8);
                        System.out.println("9- "+p9);
                        System.out.println("10- "+p10);
                        break;
                    case 2:
                        System.out.println("\tIntroducir numero de ventas");
                        System.out.println("¿Cuantos album has vendido?");
                        albumV=teclado.nextInt();
                        System.out.println("¿A cuentos clientes le has vendido?");
                        clientesV=teclado.nextInt();
                        ventas(albumV,clientesV);
                        break;
                    case 3:
                        System.out.println("\tEliminar cuenta");
                        vendedor=null;
                        System.out.println("Vendedor elmininado");
                        break;
                    case 4:
                        System.out.println("\tConsultar cuenta");
                        System.out.println(vendedor);
                        break;
                    case 5:
                        System.out.println("\tHata luego Vendedor "+nombre);
                        break;
                    default:    
                        System.out.println("\t**Opcion invalida**");
                }
                }while(decision!=5);
                break;
            case 4: 
                System.out.println("\tBienvenido Empacador");
                System.out.println("¿Tiene una cuenta?");
                System.out.println("1- Si");
                System.out.println("2- No");
                a=teclado.nextInt();
                if(a==1){
                    System.out.println("Ingrese su correo: ");
                    p=teclado.nextLine();
                    correo=teclado.nextLine();
                    System.out.println("Ingrese su contraseña: ");
                    contraseña=teclado.nextLine();
                    ingresar(correo,contraseña);
                }else{
                    System.out.println("Ingrese un correo: ");
                    o=teclado.nextLine();
                    correo=teclado.nextLine();
                    System.out.println("Ingrese una contraseña: ");
                    contraseña=teclado.nextLine();
                    crear(correo,contraseña);
                }
                
                System.out.println("\nIngrese su nombre completo: ");
                nombre=teclado.nextLine();
                System.out.println("Ingrese su edad: ");
                edad=teclado.nextInt();
                Empleado empacador= new Empleado(nombre,edad,correo);
                
                do{
                System.out.println("¿Que desea hacer Empacador?");
                System.out.println("1-Ver productos");
                System.out.println("2-Eliminar cuenta");
                System.out.println("3-Consultar cuenta");
                System.out.println("4-Salir");
                decision=teclado.nextInt();
                
                switch(decision){
                    case 1:
                        System.out.println("\tVer productos");
                        System.out.println("Lista de productos");
                        System.out.println("1- "+p1);
                        System.out.println("2- "+p2);
                        System.out.println("3- "+p3);
                        System.out.println("4- "+p4);
                        System.out.println("5- "+p5);
                        System.out.println("6- "+p6);
                        System.out.println("7- "+p7);
                        System.out.println("8- "+p8);
                        System.out.println("9- "+p9);
                        System.out.println("10- "+p10);
                        break;
                    case 2:
                        System.out.println("Eliminar cuenta");
                        empacador=null;
                        break;
                    case 3:
                        System.out.println("\tConsultar cuenta");
                        System.out.println(empacador);
                    case 4:
                        System.out.println("\tHasta luego Empacador "+nombre);
                        break;
                    default:
                        System.out.println("\t**Opcion invalida**");
                }
                }while(decision!=4);
                break;
            case 5: 
                System.out.println("\tVuelva pronto!");
                break;
            default: 
                System.out.println("**\tOpcion invalida**");
        }
        }while(elegir!=5);
        
    }//acaba main  
    
    public static void ingresar(String correo,String contraseña){
        Scanner teclado= new Scanner(System.in);
        String co,ca;
        System.out.println("Ingrese de nuevo el correo");
        co=teclado.nextLine();
        System.out.println("Ingrese de nuevo la contraseña");
        ca=teclado.nextLine();
        if(co.equals(correo)){
            System.out.println("Correo: correcto");
        }else{
            System.out.println("Correo incorreto");
        }
        if(ca.equals(contraseña)){
             System.out.println("Contraseña: correcta");
        }else{
            System.out.println("Contraseña: incorrecta");
        }
    }
    public static void crear(String correo,String contraseña){
        String co,ca;
        co=correo;
        ca=contraseña;
        System.out.println("Tu correo de ingreso es: "+co);
        System.out.println("Tu contraseña de ingreso es: "+ca);
    }
    
    public static void ventas(int albumV, int clientesV){
        System.out.println("Se han vendido: "+albumV+" album(s)");
        System.out.println("Se han vendido a: "+clientesV+" clientes");
    }
}//acaba clase


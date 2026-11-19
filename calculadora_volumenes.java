import java.util.Scanner;
public class calculadora_volumenes {
    //Funciones de calculo
    static double volumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    static double volumenPrisma(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    static double volumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    static double volumenEsfera(double radio) {
        return 4.0/3.0 * Math.PI * Math.pow(radio, 3);
    }

    static double volumenCono(double radio, double altura) {
        return  (Math.PI * Math.pow(radio, 2) * altura)/3.0;
    }

    
    //Funciones de error y resultados
    static void mostrarResultados(String nombre, double volumen) {
        System.out.println("El volumen de " + nombre + "es: " + volumen);
    }

    static void errorMedidas(){
        System.out.println("Error: Las medidas no pueden ser negativas");
    }

    //programa principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        //menu de opciones
            do {
                System.out.println("calculadora de volumenes");
                System.out.println("1. Cubo");
                System.out.println("2. Prisma rectangular");
                System.out.println("3. Cilindro");
                System.out.println("4. Esfera");
                System.out.println("5. Cono");
                System.out.println("0. Salir");
                System.out.println("Elige una opcion: ");
                opcion = sc.nextInt();
               
                //Resultado de la opcion elegida
                switch (opcion) {
                    case 1:
                        {
                            System.out.println("Ingrese el lado: ");
                                double l = sc.nextDouble();
                                    if (l < 0) errorMedidas();
                                    else  mostrarResultados("Cubo ", volumenCubo(l));
                        }
                        break;

                    case 2:
                        {
                            System.out.println("Ingrese el largo: ");
                                double l = sc.nextDouble();
                            System.out.println("Ingrese el ancho: ");
                                double w = sc.nextDouble();
                            System.out.println("Ingrese el alto: ");
                                double h = sc.nextDouble();
                                    if (l < 0 || w < 0 || h < 0) errorMedidas();
                                    else  mostrarResultados("Prisma: ", volumenPrisma(l, w, h));
                        }
                        break;
                        case 3:
                        {
                            System.out.println("Ingrese la radio: ");
                                double r = sc.nextDouble();
                            System.out.println("Ingrese la altura: ");
                                double h = sc.nextDouble();
                                    if (r < 0 || h < 0) errorMedidas();
                                    else  mostrarResultados("Cilindro: ", volumenCilindro(r, h));
                        }
                        break;
                        case 4:
                        {
                            System.out.println("Ingrese el radio: ");
                                double r = sc.nextDouble();
                                    if (r < 0) errorMedidas();
                                    else  mostrarResultados("Esfera:", volumenEsfera(r));
                        }
                        break;
                        case 5:
                        {
                            System.out.println("Ingrese el radio: ");
                                double r = sc.nextDouble();
                            System.out.println("Ingrese la altura: ");
                                double h = sc.nextDouble();
                                    if (r < 0 || h < 0) errorMedidas();
                                    else  mostrarResultados("Cono: ", volumenCono(r, h));
                        }
                        break;
                        case 0:
                        System.out.println("Hasta luego!");
                        break;

                    default:
                        System.out.println("Opcion no valida \n");
                        
                }
            } while (opcion != 0);
            sc.close();
    }

}
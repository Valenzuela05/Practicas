package Main;
import javax.swing.JOptionPane;
import persona.Claseprincipal.Herencia.EmpleadoAdministrativo;
import persona.Claseprincipal.Herencia.EmpleadoOperativo;

public class PersonaPrueba {
    public static void main(String[] args) {
        //Declaración de variables
        int opcion;
        String nombre, domicilio, telefono, curp, rfc;
        float sueldobase, sueldoneto, precioporhora, imp;
        int edad, horastrabajadas;
        //Creación de objetos
        EmpleadoAdministrativo EA1 = new EmpleadoAdministrativo();
        EmpleadoOperativo EO1 = new EmpleadoOperativo();
        //Ciclo while para mostrar el menú de opciones
        while (true) {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú de Opciones \n"
           + "1.- Alta Empleado Adminstrativo\n"
           +"2.- Cálculo de Sueldo Empleado Adminstrativo\n"
           +"3.- Listar datos Empleados Operativo\n"
           +"4.- Salir" ));
           switch (opcion) {
            //Case 1, get the employee's data and calculate the net salary
            case 1:
                nombre=JOptionPane.showInputDialog("Nombre del Empleado: ");
                edad=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
                domicilio=JOptionPane.showInputDialog("Domicilio: ");
                telefono=JOptionPane.showInputDialog("Teléfono: ");
                horastrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas: "));
                precioporhora=Float.parseFloat(JOptionPane.showInputDialog("Precio por Hora:"));
                sueldobase=Float.parseFloat(JOptionPane.showInputDialog("Sueldo Base: "));
                curp=JOptionPane.showInputDialog("CURP: ");
                rfc=JOptionPane.showInputDialog("RFC: ");
                //Calculos of the net salary
                sueldoneto=horastrabajadas*precioporhora;
                //Method to save the employee's data
                EO1.altaTrabajador(nombre, domicilio, telefono, curp, rfc, edad, sueldobase, sueldoneto, precioporhora, horastrabajadas);
                break;
                //Caso 2, get the employee's data and calculate the net salary
                case 2:
                sueldobase=Float.parseFloat(JOptionPane.showInputDialog("Sueldo base: "));
                imp=sueldobase*.32f;
                JOptionPane.showMessageDialog(null, "El sueldo Neto del Empleado es : "
                //Method to calculate the net salary
                +EA1.CalculodeSueldoNeto(sueldobase, imp));
                break;
                //Lista los datos del empleado operativo
                case 3:
                EO1.listarDatos();
                break;
                //Case 4, exit the program
                case 4:
                System.exit(0);
                //Mesaage if the user selects an invalid option
            default:
            System.out.println("Selecciona una opcion correcta (1-4)");
                break;
           }
            
        }    
        
    }

}

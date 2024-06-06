package persona.Claseprincipal.Herencia;

import javax.swing.JOptionPane;

public class EmpleadoOperativo extends persona.Claseprincipal.Persona{
    float sueldobase;
    int horastrabajadas;
    float precioporhora;
    public void altaTrabajador(String nombre, String domicilio, String telefono, 
    String curp, String rfc, int edad, float sueldobase, float sueldoneto, float precioporhora, int horastrabajadas){
    super.edad=edad;
    super.nombre=nombre;
    super.domicilio=domicilio;
    super.telefono=telefono;
    super.curp=curp;
    super.rfc=rfc;
    this.sueldobase=sueldobase;
    super.sueldoneto=sueldoneto;
    this.precioporhora=precioporhora;
    this.horastrabajadas=horastrabajadas;
    }
    public void listarDatos(){
JOptionPane.showMessageDialog(null,"Datos del Empleado \n" 
+"Nombre: "+nombre
+"\n Domicilio: "+ domicilio
+"\nCurp: " + curp
+"\nEdad: " + edad  
+"\n Sueldo base: "+sueldobase 
+"\n Horas Trabajadas: "+horastrabajadas
+"\n Precio por Hora: "+precioporhora);
    }
    
}

import java.util.Scanner;
 
public class Alumno {
    Alumno[] vectorAlumno = new Alumno[10];
    String carne,nombre,correo,numero,direccion;

    Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Alumno(String carne, String nombre, String correo, String numero, String direccion) {
        this.carne = carne;
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
        this.direccion = direccion;
    }
    
    
    
    
    
    
    public void main(String[] args){
        Scanner dr=new Scanner(System.in);
       
        int contenedorCarne[] = new int [10]; 
        for (int i = 0; i < contenedorCarne.length; i++) {
            
           contenedorCarne[i]=dr.nextInt();
            
            
            
        }
    }
       /* for (int i = 0; i <vectorAlumno.length; i++) {
             System.out.println("Ingrese su Carné:");
            contenedorAlumno[i]=dr.nextInt();
        }*/
        
        
        
        /*int contenedorCarne[] = new int [vectorAlumno];
        String contenedorNombre[] = new String [4];
        for (int i = 0; i <contenedorCarne.length; i++) {
            System.out.println("Ingrese su Carné:");
            contenedorCarne[i]=dr.nextInt();
             System.out.println("Ingrese su Nombre:");
            contenedorNombre[i]=dr.toString();
            
        }
        setCarne(contenedorCarne);
        setNombre(contenedorNombre);*/
            
      
    
    
    

   }
    
    
    
    

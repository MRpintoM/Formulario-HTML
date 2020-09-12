import java.util.Scanner;
 
public class Alumno {
    int n;
    Alumno[]vectorAlumno=new Alumno[10];
    int [] carne = new int[4] ;
    String nombre;
    String correo;
    int numero;
    String direcc;
    double dato=0;

    public Alumno[] getVectorAlumno() {
        return vectorAlumno;
        
    }

    public void setVectorAlumno(Alumno[] vectorAlumno) {
        this.vectorAlumno = vectorAlumno;
        
    }

    public int[] getCarne() {
        return carne;
    }

    public void setCarne(int[] carne) {
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }
    
    
    
    
    
    public void main(String[] args){
        Scanner dr=new Scanner(System.in);
       
        
        for (int i = 0; i < vectorAlumno.length; i++) {
            carne[4] = dr.nextInt(i);
           
            
            
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
    
    
    
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAlgoritmos;
import java.util.Scanner; 
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 *
 * @author AngelUwU
 */
public class ProyectoAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
      
          String OP2, OP3 , OP5 = null, OP6 = null, OP7 = null, OP8 = null, OP9 = null, OP10 = null;
           int OP1= 0 ;
        ObjectOutputStream AlumnosD = null;
        ObjectInputStream LeerAlumnos = null;
        Scanner leer1= new Scanner (System.in);
        Scanner leer2= new Scanner (System.in);
        Scanner leer3= new Scanner (System.in);
       
       
     try {
         if (Files.exists(Paths.get("Alumnos.prj"))){
             AlumnosD = new AppendingObjectOutputStream (Files.newOutputStream(Paths.get("Alumnos.prj"),StandardOpenOption.APPEND));
         }
         else {
             AlumnosD = new ObjectOutputStream(Files.newOutputStream(Paths.get("Alumnos.prj")));
             
         }
         
  
        
            OP3 = null;
        do {
            OP1 = 0;
       System.out.println(("\n" + "\n" + "--------------------------------------"));
       System.out.println((              "     Analisis de Datos de Estudiantes"));
       System.out.println((              "--------------------------------------")); 
       System.out.println(("\n" + "\n" + "1. Ingreso de Datos")); 
       System.out.println(("2. Analisis de datos")); 
       System.out.println(("3. Salir" + "\n" ));
       System.out.print(("Elija una de las opciones:" ));
       OP1=leer1.nextInt();
      
       
       
       if (3 == OP1) {
      System.out.println();    
      System.out.println("Muchas gracias por usar la aplicación");            
      System.exit(0);     
        }
      do{
       Alumno Alumno = new Alumno();  
      if (1 == OP1){
       System.out.println(("\n" + "\n" + "\n" + "\n" + "--------------------------------------"));
       System.out.println((              "    Analisis de Datos de Estudiantes"));
       System.out.println((              "            Ingreso de datos"       ));
       System.out.println((              "--------------------------------------")); 
       System.out.println(("\n" + "\n" + "1. Ingrese los datos del Alumno:" + "\n")); 
       OP2=leer2.nextLine();
       
       String [] Dat = OP2.split("\\,");
       
       Alumno.setNombres(Dat[1]);
       Alumno.setApellidos(Dat[3]);
       Alumno.setCarne(Dat[5]);
       Alumno.setEdad(Dat[7]);
       Alumno.setSexo(Dat[9]);
       Alumno.setCarrera(Dat[11]);
       Alumno.setTotalC(Dat[13]);
       Alumno.setCCA(Dat[15]);
       
       AlumnosD.writeObject(Alumno);
       
       System.out.println(("\n" + "\n" + "\n" + "\n" + "--------------------------------------"));
       System.out.println((              "    Analisis de Datos de Estudiantes"));
       System.out.println((              "            Ingreso de datos"       ));
       System.out.println((              "--------------------------------------")); 
       System.out.println((OP2)); 
       System.out.println(("\n" + "\n"+ "\"¿Desea ingresar a un nuevo Alumno? (s/n):" )); 
       OP3=leer3.nextLine();
      
  }
    
    } while ("s".equals(OP3));
          
      AlumnosD.close();
      
      
       if (2 == OP1) {
         do{
         try {
     LeerAlumnos = new ObjectInputStream(Files.newInputStream(Paths.get("Alumnos.prj")));     
         System.out.println(("\n" + "\n" + "\n" + "\n" + "--------------------------------------"));
       System.out.println((              "    Analisis de Datos de Estudiantes"));
       System.out.println((              "            Analisis de datos"       ));
       System.out.println((              "--------------------------------------")); 
   
      
     while(true){
             
         Alumno Alumno = (Alumno) LeerAlumnos.readObject();
         System.out.printf("%s %10s %10s\n" , Alumno.getNombres(), Alumno.getCarne(), Alumno.getApellidos()  );
  
        }          
              } 
    catch(EOFException endOfFileException){
      System.out.printf("%s%n", "No existen más estudiantes" );
       } 
      catch(ClassNotFoundException classNOtFoundException){
       System.err.println("Objeto no válido");
         }
     catch (IOException ioException){
        System.err.println("No se pudo leer el archivo" + ioException.getMessage());     
             }finally {
          
           LeerAlumnos.close();
           }
        }while (" ".equals(OP5) || "".equals(OP5) || "".equals(OP6) || "".equals(OP7) || "".equals(OP8) || "".equals(OP9) || "".equals(OP10)); 
         
       }
    }while ("n".equals(OP3) );      
    
        
         
                } catch (IOException ioException){
                   System.err.println("No se ingresaron alumnos satisfactoriamente" + ioException.toString()); 
             }
       
         
    
      }
     }

        
    
    


package FPDualEveris_TomasMota;

import java.io.*;

import javax.swing.JOptionPane;

import VehiculoDualEveris_TomasMota.MiObjectOutputStream;
import VehiculoDualEveris_TomasMota.Vehiculo;

public class FPDualEveris_TomasMota {

	public static void main(String[] args) {
		File fichero=new File("D:\\vehiculos.ddr");
		
		System.out.println("PDA POLICIAL DE TOMAS MOTA");
		String matricula=JOptionPane.showInputDialog("Introduce la matricula");
        String marca=JOptionPane.showInputDialog("Introduce la marca");
        String texto=JOptionPane.showInputDialog("Introduce el tamaño del deposito");
        double tamañoDeposito=Double.parseDouble(texto);
        String modelo=JOptionPane.showInputDialog("Introduce el modelo");
       
        try{
        	Vehiculo vehiculo=new Vehiculo(matricula, marca, tamañoDeposito ,modelo);
        	if(fichero.exists()){
                MiObjectOutputStream moos=new MiObjectOutputStream(new FileOutputStream(fichero, true));
                moos.writeObject(vehiculo);
                moos.close();
            }else{
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(vehiculo);
                oos.close();
            }
            
        	 ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fichero));
             muestraDatos(ois);
  
         }catch(ClassNotFoundException e){
  
         }catch(EOFException e){
             System.out.println("fin");
         }catch(IOException e){
             JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
	
	public static void muestraDatos(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        while(true){
            Vehiculo ref=(Vehiculo)ois.readObject();
 
            JOptionPane.showMessageDialog(null, "El vehiculo que se quiere identificar tiene una matricula "+ref.getMatricula()+
            ", su marca es "+ref.getMarca()+" y su modelo es "+ref.getModelo());
        }
    }
 
}





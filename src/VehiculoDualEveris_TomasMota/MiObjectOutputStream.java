package VehiculoDualEveris_TomasMota;

import java.io.*;

public class MiObjectOutputStream extends ObjectOutputStream{
	//Constructores
    public MiObjectOutputStream () throws IOException{
        super();
    }
    public MiObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }
    
  //Se sobrescribe el método que crea la cabecera
    protected void writeStreamHeader() throws IOException
    {
        // No hacer nada.
    }

}

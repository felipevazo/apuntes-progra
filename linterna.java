import java.util.Scanner;
public class linterna
{
    // instance variables - replace the example below with your own
    static Scanner entrada=new Scanner(System.in);
    private int nivelPotencia;
    private boolean estado;
    private String tamaño;
    private String color;
    private int nivelBateria;
    public linterna()
    {
        nivelPotencia=1;
        estado=true;
        tamaño="grande";
        color="red";
        nivelBateria=50;
  
    }

    public void setEstado(String str)
    {
        boolean conf=true;
        String msj="apagar o encender, segun corresponda";
        String aux="encender";
        String aux2="apagar";
        while(conf)
        {
        if(str=="encender")
        {
            estado=true;
            conf=false;
        }   
        else if(str=="apagar")
        {
           estado=false;
            conf=false;
        }
        else
        { 
         System.out.println("Dato invalido, intente nuevamente.");
         str=defString(msj);
         System.out.println(str);
        }
    
      
    }
    
   }
   
   public void setPotencia(int nivel)
   { boolean conf=true;
       String msj="Nivel de potencia, sea 1 o 2";
       while(conf)
       {
       if(nivelPotencia==1)
        { 
          nivelPotencia=1;        
        }
        else if (nivel==2)
        {
            nivelPotencia=2;
        }
        else
        {
            datoInvalido();
            defInt(msj);
        }
    }
    }
          private String defString(String str)
  { 
      System.out.println("Ingrese "+str);
      String aux=entrada.next();
      return aux;
      
   }    
   private int defInt(String str)
   {
       int aux;
       System.out.println("Ingrese "+str);
       aux=entrada.nextInt();
       return aux;
       } 
  
   private void datoInvalido()
   {
       System.out.println("Dato invalido, intente nuevamente");
       } 
        }

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
    public int getnivelPotencia()
    {
        return nivelPotencia;
      
         }
    public boolean getEstado()
    {
        return estado;
        
    }
    public String getTamaño()
    {
        return tamaño;
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
   public void descargarBateria()throws InterruptedException
   {
       estado=true;
       while(nivelBateria>0)
       {
            Thread.sleep(1000);
            nivelBateria=nivelBateria-5;
            System.out.println(nivelBateria+5);
           
        }
       estado=false;
       System.out.println("El estado de la linterna ahora es"+estado);
    }
   
   public void setPotencia(int nivel)
   { boolean conf=true;
       String msj="Nivel de potencia, sea 1 o 2";
       while(conf)
       {
       if(nivelPotencia==1)
        { 
          nivelPotencia=1;   
          conf=false;
        }
        else if (nivel==2)
        {
            nivelPotencia=2;
            conf=false;
        }
        else if(nivel==0)
        {
            nivelPotencia=0;
            conf=false;
        }
        else
        {
            datoInvalido();
            defInt(msj);
        }
    }
    }
    public void apagarLinterna()
    {
        setEstado("apagar");
        setPotencia(0);
        
    }
    public void encenderLinterna()
    {
        setEstado("encender");
        setPotencia(1);
        
    }
    
    public void setBateria(int b)
{
    nivelBateria=b;
}
public void setColor(String str)
{
    color=str;
}
public void setTamaño(String str)
{
    tamaño=str;
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
       
       
       public String toString()
       {
           String mensaje="La linterna es de un tamaño "+tamaño+", de color "+color+", esta en un nivel de potencia "+nivelPotencia+", su estado es "+estado+" y su nivel de bateria es "+nivelBateria;
           
           return mensaje;
       }
       public void mostrar()
       {
           System.out.println(toString());
       }
       
        }

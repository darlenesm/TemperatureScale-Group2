public class Temperature {
    public static void main(String[] args) {
      System.out.println(temperature(5.8f, TemperatureScale("Kelvin")));
    }
    
    public static String TemperatureScale(String Scale){
       
      if(Scale == "Celsius") 
        return "Celsius";
      
       
      else if (Scale == "Fahrenheit")
        return "Fahrenheit";
      

      else if (Scale == "Kelvin")
         return "Kelvin";
      
      else 
        return "No hay na"; 
      
    }     

    public static String temperature(float temp, String scale){
         
      String temp2 =  Float.toString(temp);
      String escala = scale;

      return temp2 + " " + escala;

    }

    public static String Add(float temp, Float temp){
       Float temperatura = Float.parseFloat(temp);

      
      if(scale == "Kelvin"){
         return temperatura
      }
    }
  }

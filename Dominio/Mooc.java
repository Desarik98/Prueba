package Dominio;
 
//No olvide documentar
public class Mooc{
    private String nombre;
    private String area;   
    private String objetivo;
    private String distribuidor;
    private int semanas;  

 
    public Mooc(String nombre, String area,  String objetivo, String  distribuidor, int semanas){
        this.nombre = nombre.trim();
        this.area = area.trim();
        this.objetivo = objetivo.trim();
        this.distribuidor = distribuidor.trim();
        this.semanas = semanas;        
    }
    
    /**
     * @return 
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @return 
     */
    public String getArea(){
        return area;
    }

    /**
     * @return 
     */
    public String getObjetivo(){
        return objetivo;
    }
    
    /**
     * @return 
     */
    public String getDistribuidor(){
        return distribuidor;
    }    
    
    /**
     * @return 
     */
    public int getSemanas(){
        return semanas;
    }
    


    /**
     * @return 
     */
    public String toString(){
        return nombre + "\n" + area + "\n"+ distribuidor + "\nSemanas:" + semanas+"\n" +objetivo ;
    }

}

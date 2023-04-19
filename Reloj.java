/**
 * Un ejemplo que modela un Reloj simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Reloj 
{
    //COMPLETE   
    int segundos;
    int minutos;
    int horas;
    /**Debe inicializar a la media noche o medio dia 12:00:00*/
    public Reloj(){
        horas = 12;
        minutos = 0;
        segundos = 0;
    }

    /**Inicializa de acuerdo con los parametros*/
    public Reloj(int segundos, int minutos, int horas){  
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    /*De aqui en adelante Ud. debe completar los algoritmos para que el programa funcione*/
    public int getSegundos(){
        return this.segundos;
    }
    
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    
    public int getMinutos(){
        return this.minutos;
    }
    
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    
    public int getHoras(){
        return this.horas;
    }
    
    public void setHoras(int horas){
        this.horas = horas;
    }

    /**Metodo para avanzar el segundero*/ 
    public void avanzarSegundero(){
        segundos = (segundos+1)%60;
        if(segundos == 0){
            this.avanzarMinutero();
        }
    }

    /**Metodo para retroceder el segundero*/ 
    public void retrocederSegundero(){
        segundos = (segundos - 1 + 60)%60;
        if(segundos == 59){
            this.retrocederMinutero();
        }
    }

    /**Metodo para avanzar el minutero*/ 
    public void avanzarMinutero(){
        minutos = (minutos + 1)%60;
        if(minutos == 0){
            this.avanzarHorario();
        }  
    }

    /**Metodo para avanzar el minutero*/ 
    public void retrocederMinutero(){
        minutos = (minutos - 1 + 60)%60;
        if(minutos == 59){
            this.retrocederHorario();
        }
    }

    /**Metodo para avanzar el horario*/ 
    public void avanzarHorario(){
        horas++;
        if(horas > 12){
            horas = 1;
        }   
    }

    /**Metodo para avanzar el horario*/ 
    public void retrocederHorario(){
        horas--;
        if(this.horas < 1){
            horas = 12;
        }
    }

}
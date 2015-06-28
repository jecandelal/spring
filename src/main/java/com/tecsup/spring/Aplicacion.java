package com.tecsup.spring;

import com.tecsup.spring.model.Instrumento;
import com.tecsup.spring.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplicacion {
    
    public static void main(String[] args) {
        
        System.out.println("Hola");
        
        ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
         Aplicacion.ejemplo6(cntx);
        
    }
    
    public static void ejemplo1(ApplicationContext cntx){
        Musico musico=(Musico)cntx.getBean("musico");
        musico.who();
        
     }
    
    
    public static void ejemplo2(ApplicationContext cntx){
        Musico musico=(Musico)cntx.getBean("musico2");
        musico.who();
        System.out.println(musico.getCanciones());
     }
    
    public static void ejemplo3(ApplicationContext cntx){
        Musico musico=(Musico)cntx.getBean("musico3");
        System.out.println(musico.getCanciones());
        musico.getInstrumento().sonido();
        
     }
    
     public static void ejemplo5(ApplicationContext cntx){
        Musico musico=(Musico)cntx.getBean("musico5");
         System.out.println(musico.getCanciones());
        
     }
     
     public static void ejemplo6(ApplicationContext cntx){
        Musico musico=(Musico)cntx.getBean("musico6");
        musico.getInstrumento().sonido();
        System.out.println(musico.getInstrumento().getNombre());
             
        
     }
     
     public static void ejemplo7(ApplicationContext cntx){
        Musico musico=(Musico)cntx.getBean("musico7");
        
         
        
     }
     
     
    
    public static void mensaje() {
        System.out.println("Este es el cambio");
    }
}

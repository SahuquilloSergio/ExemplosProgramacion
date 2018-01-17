
package exemploarraysbasicos;

import javax.swing.JOptionPane;


public class Temperatura {
    public void amosar(float []temp){
    for(int i=0;i<temp.length;i++){
            System.out.println("temperatura"+(i+1) + "--->"+temp[i]);
    }
    }
    
    public void tempDeterminada(float []tem, int posicion){
        while(posicion<1||posicion>tem.length){
            posicion = Integer.parseInt(JOptionPane.showInputDialog("posicion"));
        }
    }
        
        
        public void atopar(float[]tem, float temAtopar){
            boolean atopado = false;
            for(int i=0;i<tem.length;i++)
                if(temAtopar == tem[i]){
                    System.out.println("posicion "+(i+1));
                    atopado = true;
                }
            if(atopado == false)
                System.out.println(temAtopar + "no esta");
        }
    }
   // public void buscarElemento(float obxBus, float [i]temp){
    /*
        atopado es false
        insertamos obxbus y temp[i]
        for(int i=0;i<tem.length;i++)
        if(obxbus==tem[i]
        sout(temp[i] esta en (i+1)
        atopado ahora es true
        si atopado es false
        sout(no esta)
        
        
    */

    
    
    

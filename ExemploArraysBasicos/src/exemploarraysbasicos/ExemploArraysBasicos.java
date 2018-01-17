package exemploarraysbasicos;

import javax.swing.JOptionPane;

public class ExemploArraysBasicos {

    public static void main(String[] args) {
//        
//        float[]temperaturas = new float[7];
//        damos valores elemento a elemento
//        temperaturas[0]=1.2f;
//        temperaturas[1]=2.2f;
//        temperaturas[2]=3.2f;
//        temperaturas[3]=5.2f;
//        temperaturas[4]=6.2f;
//        temperaturas[5]=7.2f;
//        temperaturas[6]=8.2f;
        
        Temperatura obxTem = new Temperatura();
//        float[]temperaturas = {3f,2f,5f,7f};//inicializando
        //pedindo datos
        float[]temperaturas = new float[7];
        for(int i=0; i<temperaturas.length;i++){
            temperaturas[i]= Float.parseFloat(JOptionPane.showInputDialog("temperaturas"));
    }
     ;
        
        
        obxTem.amosar(temperaturas);
        
    }
    
}

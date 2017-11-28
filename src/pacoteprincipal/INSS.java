package pacoteprincipal;

public class INSS extends Atributos {

    Atributos at = new Atributos();
    
    INSS(){
        if(at.getSal() <= 1107.52){
            at.setInss(at.getSal()*0.08);
        }
        if(at.getSal() >= 1107.53 && at.getSal() <= 1845.87){
            at.setInss(at.getSal()*0.09);
        }
        if(at.getSal() >= 1845.88 && at.getSal() <= 3691.74){
            at.setInss(at.getSal()*0.11);
        }else{
            at.setInss(0);
        }
    }
    
}

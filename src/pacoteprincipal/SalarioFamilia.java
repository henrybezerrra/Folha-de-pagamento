package pacoteprincipal;


public class SalarioFamilia extends Atributos{

    Atributos at = new Atributos();
    
    private double valorA= 29.43;
    private double valorB= 20.74;
    
    SalarioFamilia(){
     if(at.getSal()<573.91) {
         at.setSalFamilia(valorA*at.getQf());
        } if(at.getSal()>573.92 && at.getSal()<862.60) {
            at.setSalFamilia(valorB*at.getQf());
        }else{
            at.setSalFamilia(0);
        }
{
        
    }
    }
   
    
}

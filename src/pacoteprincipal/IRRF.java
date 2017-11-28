package pacoteprincipal;

public class IRRF extends Atributos {
    
    Atributos at = new Atributos();
    
    IRRF() {
        if (at.getSal() >= 1566.62 && at.getSal() <= 2347.85) {
            at.setIrrf(at.getSal() * 0.075);
        }
        if (at.getSal() >= 2347.86 && at.getSal() <= 3130.51) {
            at.setIrrf(at.getSal() * 0.15);
        }
        if (at.getSal() >= 3130.52 && at.getSal() <= 3911.63) {
            at.setIrrf(at.getSal() * 0.225);
        }
        if (at.getSal() > 3911.64) {
            at.setIrrf(at.getSal() * 0.275);
        } else {
            at.setIrrf(0);
        }
        
    }
}

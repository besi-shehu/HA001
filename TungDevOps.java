import.org.joda.time.LoccalTime;

package tung;

public class TungDevOps{
    
    public static void main(String [] arg){
        LocalTime kohaAktuale = new LocalTime();
        System.out.println("Koha aktuale eshte: "+kohaAktuale);
        
        Pershendetje pershendet = new Pershendetje();
        System.out.println(pershendet.thuajTung());
        
    }
    
}
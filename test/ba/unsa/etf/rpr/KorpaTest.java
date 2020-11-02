package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("biciklo", 1000, "1234");
        for(int i = 0 ;i < 500 ; i++){
            korpa.dodajArtikl(artikl);
        }
        boolean t = korpa.dodajArtikl(artikl);
        assertFalse(t);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa ();
        Artikl artikl = new Artikl("biciklo", 1000, "2");
        korpa.dodajArtikl(artikl);
        assertNull(korpa.izbaciArtiklSaKodom("1"));
    }

    @Test
    void dajUkupnuCijenuArtikala(){
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("biciklo",100,"1");
        Artikl b = new Artikl("biciklo", 1000, "2");
        korpa.dodajArtikl(a);
        korpa.dodajArtikl(b);
        assertEquals(1100,korpa.dajUkupnuCijenuArtikala());
    }
}
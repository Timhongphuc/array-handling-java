
/**
 * Beschreiben Sie hier die Klasse Prac1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Prac1{
    
    private int[] a = new int[5];
    private int[] b = new int[5];
    private int number = 1;
    private int[] a100 = new int[100];
    private int[] b100 = new int[100];
    private int[] aMax = {1,4,5,6,3,6,7,5};
    private int tempGroessteZahl;
    private int[] notenliste = new int[30];
    private float durchschnitt;
    //private int zwischenSchritt;
    private int[] lustigesArray = new int[100];
    
    public Prac1(){}
    
    public void arrayAFuellen(){
        for(int i = 0; i<a.length; i++){
            a[i] = number;
            number++;
        }
    }

    public void tauschenDerArrays(){
        for(int i = 0; i<a.length; i++){
            b[i] = a.length + 1 - a[i];
        }
    }
    
    public void arrayA100Fuellen(){
        for (int i = 0; i<a100.length; i++) {
            a100[i] = number;
            number++;
        }
    }
    
    public void arrayB100Fuellen(){
        for (int i = 0; i<b100.length; i++) {
            if (a100[i] % 3 == 0){
                b100[i] = -1; 
            } else {
                b100[i] = a100[i];
            }
        }
    }
    
    public int findeGroesstenWert(){
        for(int i = 0; i<aMax.length; i++){
            if(aMax[i] > tempGroessteZahl){
                tempGroessteZahl = aMax[i];
            }
        }
        
        return tempGroessteZahl;
    }
    
    public float notenliste(){
        float zwischenSchritt = 0;
        for(int i = 0; i<notenliste.length; i++){
            notenliste[i] = (int)((Math.random()*6)+1);
            System.out.println("The random number generated is: " + notenliste[i]);
        }
        
        for(int i = 0; i<notenliste.length; i++){
            zwischenSchritt = zwischenSchritt + notenliste[i];
            System.out.println("Das Zwischenergebniss lautet: " + zwischenSchritt);
        }
        
        durchschnitt = zwischenSchritt / (float)notenliste.length;
        
        return durchschnitt;
    }
    
    public int arraySuche(){
        int ortGefundeneZahl = 0;
        int zuSuchendeZahl = 29; //3
        
        for(int i = 0; i<lustigesArray.length; i++){
            lustigesArray[i] = i+1;
        }
        
        for(int i = 0; i<lustigesArray.length; i++){
            if(lustigesArray[i] == zuSuchendeZahl){
                ortGefundeneZahl = i;
                System.out.println("Das erste Element im Array (am Index 0) ist: " + lustigesArray[0]);
                break; //Interessant!!!
            } else {
                System.out.println("Die gesuchte Zahl wurde im Array nicht gefunden");
            }
        }
        
        return ortGefundeneZahl;
    }
}
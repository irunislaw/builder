package zadanie;

public class Main{
 public static void main(String[] args){
    Wyliczenie.Typ dom = Wyliczenie.Typ.DOM;
    Wyliczenie.Typ mieszkanie = Wyliczenie.Typ.MIESZKANIE;
    Home home = new Home(mieszkanie,false,true,true,false,200,5000000,2);

    System.out.println(home.opis());
 }
}
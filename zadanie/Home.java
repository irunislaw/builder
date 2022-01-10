package zadanie;
public class Home{
    private boolean WithPool= false;
    private int FloorNumber=1;
     private double Price=0;
    private double Surface=1;
    private boolean WithGarden= false;
    private boolean WithGarage= false;
    private boolean WithBasement= false;
    private Wyliczenie.Typ typ = Wyliczenie.Typ.DOM;

    public Home(Wyliczenie.Typ typ1 ,boolean Basen,boolean ogrod,boolean garaz,boolean piwnica,double powierzchnia,double cena, int pietra){
        this.WithBasement=piwnica;
        this.WithGarage=garaz;
        this.WithGarden=ogrod;
        this.Surface=powierzchnia;
        this.Price=cena;
        this.FloorNumber=pietra;
        this.WithPool=Basen;
        this.typ = typ1;
      
    }

public String opis(){
    String dom="";
    if(this.typ.equals(Wyliczenie.Typ.DOM)) {
     dom = "dom ";
    }else if(this.typ.equals(Wyliczenie.Typ.MIESZKANIE)) {
        dom = "Mieszkanie ";
    }
    dom += ""+this.FloorNumber+" pietrami o powierzchni "+this.Surface+" m^2 ";

    if(this.WithBasement==true) dom+="z piwnica ";
    if(this.WithGarage==true) dom+="z garazem ";
     if(this.WithGarden==true) dom+="z ogrodem ";
     if(this.WithPool==true) dom+="z basenem ";
 dom+="za "+this.Price+"zl";
 return dom;    
}

}
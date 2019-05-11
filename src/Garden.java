public class Garden {
  /*  Plant plant1;
    Plant plant2;
    Plant plant3;
*/
  //opis ogrodu, czyli informacje o wszystkich roślinach i ich zapotrzebowaniu na wodę,
    String opis (Plant p1, Plant p2, Plant p3){
        return "W ogrodzie są trzy rośliny: " +p1.name +", " +p2.name +" i " +p3.name +", potrzebują one dziennie adekwatnie " + p1.waterNecessity
                +" ml wody " +p2.waterNecessity +" ml wody oraz " +p3.waterNecessity +" ml wody.";
    }
    double monthlyNecessityOfGarden (Plant p1, Plant p2, Plant p3){
        return ((p1.waterNecessity + p2.waterNecessity + p3.waterNecessity)*30)/1000;

    }
    double yearlyNecessityOfGarden (Plant p1, Plant p2, Plant p3){
        return ((p1.waterNecessity + p2.waterNecessity + p3.waterNecessity)*30)*12/1000;

    }


    void showmonthlyNecessityOfGarden(){
        System.out.println();
    }
}

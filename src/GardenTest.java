public class GardenTest {
    public static void main(String[] args) {

        Plant plant1 = new Plant("kwiatek", 25);
        Plant plant2 = new Plant("krzaczek", 250);
        Plant plant3 = new Plant("drzewko", 2500);
        Garden garden = new Garden();

        System.out.println(garden.opis(plant1, plant2, plant3));

        System.out.println("Ogród potrzebuje "+garden.monthlyNecessityOfGarden(plant1, plant2, plant3)
        +" litrów wody miesięcznie.");

        System.out.println("Ogród potrzebuje " +garden.yearlyNecessityOfGarden(plant1, plant2, plant3)
        +" litrów wody rocznie.");

    }
}

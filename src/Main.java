void main() {

    Garage garage = new Garage("Min garage");

    garage.tilføjBil(new Benzinbil(12345, "Ford", "Fiesta", 1990, 2, 95, 20));
    garage.tilføjBil(new Dieselbil(54321, "Skoda", "Octavia", 2002, 4, true, 10));
    garage.tilføjBil(new Elbil(13542, "Tesla", "Model Y", 2020, 4, 100, 200, 100));

    System.out.println(garage);

    System.out.println(STR."\{garage.navn}s samlede grøn ejerafgift er: \{garage.beregnGrønEjerafgift()}");
}
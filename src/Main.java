public class Main {
    public static void main(String[] args) {
        Student it = new Student();
        it.name = "Begimay";
        it.age = 15;
        it.speciality = "Java developer";
        Student it1 = new Student();
        it1.name = "Nurbek";
        it1.age = 16;
        it1.speciality = "Java script";
        Student it2 = new Student();
        it2.name = "Beknur";
        it2.age = 15;
        it2.speciality = "povar";
        System.out.println("name: " + it.name + "\n" + "age: " + it.age + "\n" + "specialty: " + it.speciality + "\n"
                + "name: " + it1.name + "\n" + "age: " + it1.age + "\n" + "specialty: " + it1.speciality + "\n" + "name: " + it2.name + "\n" + "age: " + it2.age + "\n" + "specialty: " + it2.speciality);
        it.speak();

    }


}
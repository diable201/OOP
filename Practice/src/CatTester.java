public class CatTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Chokola", 3, "brown", "whiskas");
        System.out.println(cat);
        System.out.println(cat.voice());
        System.out.println(cat.voice(5));
    }
}

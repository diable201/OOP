public class Cat extends Animal {
    private String feed;

    public Cat() {
        super();
    }

    public Cat(String name, int age, String color, String feed) {
        super(name, age, color);
        this.feed = feed;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }	

    @Override
    public String voice() {
        return "Meow!";
    }
    
    public String voice(int number) {
        String numberOfVoice = "";
        for (int i = 0; i < number; i++)
            numberOfVoice += voice();
        return numberOfVoice;
    }

    public String toString() {
        return super.toString() + " Feed: " + feed;
    }
}

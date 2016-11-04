public class Painting {
    protected int value;
    protected String name;
    protected String artist;

    public Painting(String n, String a){
        name = n;
        artist = a;
        value = 400;
    }

    public void display(){
        System.out.println("Artist Name: "+artist);
        System.out.println("Painting Title: "+name);
        System.out.println("Price: $"+value);
    }
}

 


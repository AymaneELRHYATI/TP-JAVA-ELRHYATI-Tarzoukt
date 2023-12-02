class data {
    static void draw(String s){
        System.out.println("ceci est une chaine: "+s);
    }
    static void draw(int i){
        System.out.println("ceci est un nombre: "+i);
    }
    static void draw(double d){
        System.out.println("ceci est un nombre: "+d);
    }
    static void draw(int i, double d){
        System.out.format("int %d et un double %f %n",i ,d);
    }
    public static void main(String[] args){
        data.draw("Picasso");
        data.draw(10);
        data.draw(10.5);
        data.draw(2, 1.68);
    }
}



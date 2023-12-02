public class Pile{
    static final int MAX = 8;
    char t[];
    int top;

    public Pile(){
        t=new char[MAX];
        top=-1;
    }
    public void empiler (char c){
        if(!estPleine())
            t[++top]=c;
        else
            System.out.println("Pile pleine");
    }
    public char sommet(){
        if(!estVide())
            return t[top];
        else
            return '\0';
    }
    public void depiler(){
        if(!estVide())
            top--;
        else
            System.out.println("Pile vide");
    }
    public boolean estVide(){
        return (top == -1);
    }
    public boolean estPleine(){
        return (top == MAX - 1);
    }
}

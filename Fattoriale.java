package es3Thread;
public class Fattoriale extends Thread{
    private int val;

    public Fattoriale(String nome, int val) {
        super(nome);
        this.val = val;
    }
    
    public int getVal() {
        return val;
    }
    
    public int fattoriale(int num) throws Error{
        if(num == 0)
            val = 1;        
        else if(num > 0)
            val = num * fattoriale(num - 1);
        else
            throw new Error();
        return val;
    }
    
    public void run() {
        try{
            System.out.println("----Risultato Thread " + getName() + " : " + fattoriale(val) + " -----");
        }catch(Error e){
            System.out.println("----Impossibile effettuare il fattoriale di un numero negativo!" + "(" + getName() + ")----");
        }
    }
}
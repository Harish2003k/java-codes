class Animal{
    public void eat(){
        System.out.println("\n I am Eating.");
    }
    public static void main(String args[]){
        System.out.println("\n Any thing that you write.");
        Animal buzo=new Animal();
        buzo.eat();
        buzo.run();
    }
    public void run(){
        System.out.println("I am Running.");
    }
}
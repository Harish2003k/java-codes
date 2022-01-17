class box{
    double height;
    double width;
    double depth;
}
class BoxDemo{
    public static void main(String args[]){
        box mybox1=new box();
        box mybox2=new box();
       double vol;
     mybox1.width=12;
     mybox1.height=12;
     mybox1.depth=12;
     mybox2.width=15;
     mybox2.height=15;
     mybox2.depth=15;
     vol=mybox1.width*mybox1.height*mybox1.depth;
     System.out.println("VOLUME is :"+vol);
     vol=mybox2.width*mybox2.height*mybox2.depth;
     System.out.println("VOLUME is :"+vol);
        
    }
}
class SwitchStatement{
    public static void main(String args[]){
        char color='p';
        switch(color)
        {
            case 'b':
                System.out.println("Blue");
                case 'p':
                    System.out.println("Purple");
                    case 'r':
                    System.out.println("Red");
                    default:
                    System.out.println("No Color");
        }
    }
}
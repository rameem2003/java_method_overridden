package overridden_method;


class super_class{
    String name;
    super_class(){
        name = "Rameem";
    }
    
    public void Data(){
        System.out.println("Form Super Class");
        System.out.println("Name is: " + name);
    }
}


class sub_class extends super_class{
    int roll = 451638;
    public void Data(){
        System.out.println("Form Sub Class");
        System.out.println("Roll is: " + roll);
    }
    
}

public class Overridden_method {

    public static void main(String[] args) {
        // TODO code application logic here
        
        super_class sup = new super_class();
        sup.Data();
        sub_class sub = new sub_class();
        sub.Data();
    }
    
}

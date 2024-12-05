class mgr{
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
    System.out.println("Id : " + this.id + " name : " +this.name);
    }
    
}



public class code27 {
    public static void main(String[] args) {
       
        mgr m1=new mgr();
        m1.setId(101);
        m1.setName("abhishek");

        m1.getId();
        m1.getName();

        m1.show();
    }
}

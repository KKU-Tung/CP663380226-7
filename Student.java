class Student{
    private String name;
    private String Address;
    
    public Student(){
        //add a default constructor of Student
    }

    public Student(String name, String Address){
        this.name = name;
        this.Address = Address;
    }

    public String getName(){
        return name;
    }

    public void  setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return Address;
    }
}

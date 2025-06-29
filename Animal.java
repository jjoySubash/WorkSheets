class Animal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("fly");
    }
}

class Human extends Bird{
    public void study(){
        System.out.println("study");
    }
}

class IfLoop{
    static main(args) {
        Person p = new Person()
        p.setFirstName("Chandra")
        p.setLastName("Sekhar")
        p.setAge(20)

        if(p.getAge() > 30){
            println p.getFullName() + " is a old man now"
        }else{
            println p.getFullName() + " is a not a old man"
        }

        // wow !! passing by key value pair xd
        def persons = [p, new Person(firstName:"John", lastName:"Doe", age:40)]

        for(def x : persons){
            println x.getFullName() + " is " + x.getAge() + " years old" 
        } 
    }
}
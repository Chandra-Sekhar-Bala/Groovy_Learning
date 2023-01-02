class Closures{
    static main(args) {
        Person cs = new Person()
        cs.setFirstName("Chandra")
        cs.setLastName("Sekhar")
        cs.setAge(20)

        //1
        def clo = {def p-> println "Hello ${p.getFullName()}"}
        clo(new Person(firstName:"John", lastName:"Doe"))

        //2
        namePrint(clo, new Person(firstName:"Mohim", lastName:"Khan"))

    }

    static namePrint(Closure c, Person p){
        if(p == null){
            throw new RuntimeException("Person canno be null")
        }
        c(p)
    }

}
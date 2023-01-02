class Classes{
    static main(args) {
            
        def p = new Person()
        p.setFirstName("Chandra")
        p.setLastName("Sekhar")
        p.setAge(20)
        println p.getFullName()
        println p.age
        def x = new Person("Goku", "Akraman", 34)
        println p
        println x
    }
}
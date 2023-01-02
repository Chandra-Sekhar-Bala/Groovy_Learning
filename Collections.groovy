class Collectionss{
    static main(args) {
        Person csb = new Person("Chandra", "Sekhar", 20)
        Person mhm = new Person("Mohim", "Khan", 21)
        Person snh = new Person("Sneha","Kumari", 19)

        // New list of perons
        def persons = [csb, mhm, snh]

        // Quering colections
        assert persons instanceof List
        assert persons.size() == 3
        // assert persons.size() == 2 // fals
        assert persons[2] == snh

        // iteration over elements
        persons.each{ x ->
            println x
        }
        persons.eachWithIndex{ p, i ->
            println i + ": " + p 
        }

        // filtering a specific element

        assert persons.find{ it.lastName = "Kumari"} == csb

        // transforming elements into something else

        assert persons.collect{ it.age >= 20} == [true, true, false]

        // soerting element based on criteria
        
        println persons.sort{
            it.age
        }
    }
}
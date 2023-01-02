/*
• Groovy enabled effortless file management
• Manages underlying file handle
• Automatically closes file resources even in error conditions
*/

class Files{
    static main(args) {

        Person p = new Person()
        // open file
        def file = new File("res/name.txt")

        // read from file

        println file.getText("UTF-8")

        // iterte over each line
        // file.each{
        //     println it
        // }

        file.eachLine{ txt, no ->
            if(no == 1){
                p.setFirstName(txt)
            }else if(no == 2){
                p.setLastName(txt)
            }else if(no == 3){
                p.setAge(txt.toInteger())
            }else{
                throw new RuntimeException("A name file should contains only three details")
            }
        }

        println p
        
        // Writing to file 
        def f = new File("res/name2.txt")
        f.withWriter("UTF-8"){ w ->
            w.writeLine("Goku")
            w.writeLine("Yeger")
            w.writeLine("40")
        }

        f << "Hello" // append with a new line
        f.append(": last") // appends at the end without new ine

    }
}


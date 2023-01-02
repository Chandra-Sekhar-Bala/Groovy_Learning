class Main{
    static main(args) {
        Calculator cal = new Calculator()

        println cal.add(1,2,3,4,5)
        
        println cal.multiply(1,2,3,4,5)
        
        println cal.division(4,0)
        
        println cal.subtract(1,1) 

        // Testing
        assert 2+3 == 5
        // Gives pretty nie error output in console 
    }
}
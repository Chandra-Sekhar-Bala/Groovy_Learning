import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.Canonical
@ToString
@TupleConstructor // make constructor Person(firstName, Lstname, age)
// @Canonical : All for one
class Person{
    String firstName
    String lastName
    int age
    def getFullName(){
        return firstName + " " + lastName 
    }
}
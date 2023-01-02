/*
def dir = new File("./res")
// def files = dir.listFiles()
// or  files.eac 
def list = []
dir.eachFile{
    it.each{ line ->
        if(line.isInteger()){
            list.add(line.toInteger())
        }
    }
}
println list

def maxi = -1

for(def i in list){
    if (maxi < i) {
        maxi = i
    }
}

println "Maximun is : $maxi"
def sum = 0
list.each{
    sum += it
}
println "Sum is $sum"

*/

def getNumbers(){
    def dir = new File("./res")
    def list = []
    dir.eachFile{
        it.each{ line ->
            if(line.isInteger()){
                list << line.toInteger()
            }
        }
    }
    return list
} 

List<Integer> list = getNumbers()

println list

println "Max is : ${list.max()}"
println "Sum is : ${list.sum()}"
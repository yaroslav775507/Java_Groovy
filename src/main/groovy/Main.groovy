def countElements(list) {
    def map = [:]
    list.each {
        if (map.containsKey(it)) {
            map[it]++
        } else {
            map[it] = 1
        }
    }
    return map
}
def list = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(list)
println(result)


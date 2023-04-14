var list1 = [1, 3, 4, 5];
var list2 = [2, 6, 7, 8];

console.log(mergeList(list1, list2));


function mergeList(list1, list2) {
        
    let listlength = list1.length + list2.length;
    var result = [listlength]
    var list1Counter = 0;
    var list2Counter = 0;
    var resultCounter = 0;

    while (list1Counter < list1.length && list2Counter < list2.length) {
        if (list1[list1Counter] > list2Counter) {
            result[resultCounter++] = list1[list1Counter++];
        } else {
            result[resultCounter++] = list2[list2Counter];
        }
    }

    while (list1Counter < list1.length) {
        result[resultCounter++] = list1[list1Counter];
    }
    while (list2Counter < list2.length) {
        result[resultCounter++] = list2[list2Counter];
    }
    return result;

} 

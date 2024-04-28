/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function (fn) {
    let keys = Object.values(this)
    let newKey = {}

    for (let i = 0; i < keys.length; i++) {
        let element = keys[i];
        let nkey = fn(element)
        if (newKey[nkey]) {
            newKey[nkey].push(element)
        } else {
            newKey[nkey] = []
            newKey[nkey].push(element)
        }
    };

    return newKey
}
/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */
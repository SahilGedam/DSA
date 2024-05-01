/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function (obj) {
    if (Array.isArray(obj)) {
        return removeFalsy(obj)
    } else {
        return removeFalseObj(obj)
    }
};
function removeFalseObj(obj) {
    let keys = Object.keys(obj);
    let values = {}
    for (let k of keys) {
        if (obj[k]) {
            if (Array.isArray(obj[k])) {
                obj[k] = removeFalsy(obj[k])
            }
            else if (typeof obj[k] == 'object') {
                obj[k] = removeFalseObj(obj[k])
            }
            values[k] = obj[k]
        }
    }
    return values
}
function removeFalsy(arr) {
    let val = []
    for (let i = 0; i < arr.length; i++) {

        let elem = arr[i]
        if (elem) {
            if (Array.isArray(elem)) {
                val.push(removeFalsy(elem))
            } 
                else if(typeof elem == 'object'){
                val.push(removeFalseObj(elem))
            }
            else {
                val.push(elem)
            }
        }
    }
    return val
}

//////////////////////////// better solution////////////////

var compactObject = function (obj) {
    if (obj === null || typeof obj !== 'object') {
        return obj;
    }

    if (Array.isArray(obj)) {
        return obj.filter(Boolean).map(compactObject);
    }

    const result = {};
    for (const key in obj) {
        const value = compactObject(obj[key]);
        if (Boolean(value)) {
            result[key] = value;
        }
    }
    return result;
};
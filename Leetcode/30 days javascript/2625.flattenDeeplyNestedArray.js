/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    let ans = []
    for (let item of arr) {
        if (Array.isArray(item) && n > 0) {
            ans.push(...flat(item, n - 1))
        } else {
            ans.push(item)
        }
    }
    return ans;
};
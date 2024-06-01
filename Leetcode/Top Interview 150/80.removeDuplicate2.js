/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    let obj = {}
    for (let i = nums.length - 1; i >= 0; i--) {
        let elem = nums[i]
        if (obj[elem] == undefined) {
            obj[elem] = 0;
        } else {
            obj[elem]++
        }
        if (obj[elem] > 1) {
            nums.splice(i, 1)
        }
    }
    return nums.length
};
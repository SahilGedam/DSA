var removeDuplicates = function (nums) {
    let prev = Infinity;
    for (let i = nums.length - 1; i >= 0; i--) {

        if (prev == nums[i]) {
            nums.splice(i, 1);
        }
        prev = nums[i]
    }
    return nums.length
};
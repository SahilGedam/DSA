/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function (arr, fn) {
  const output = [];
  for (let i = 0; i < arr.length; i++) {
    output.push(fn(arr[i], i));
  }
  return output;
};

function plusone(n) {
  return n + 1;
}
function plusI(n, i) {
  return n + i;
}
function constant(n, i) {
  return 42;
}

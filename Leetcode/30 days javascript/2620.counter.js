/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function (n) {
  var count = n;
  return function () {
    count = count + 1;
    return count - 1;
  };
};

const counter = createCounter(10);
counter(); // 10
counter(); // 11
counter(); // 12

/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function () {
  let val;

  if (this.length == 0) {
    return -1;
  }
  for (let i = this.length - 1; i >= 0; i--) {
    val = this[i];
    break;
  }
  return val;
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */

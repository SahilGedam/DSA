/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {
  // return Promise.all([promise1, promise2]).then((values) => {
  //     return values[0] + values[1]
  // })
  //or
  const [val1, val2] = await Promise.all([promise1, promise2]);
  return val1 + val2;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */

/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function (functions) {
  return new Promise((resolve, reject) => {
    let results = new Array(functions.length);
    let counter = 0;

    if (0 == functions.length) {
      resolve(results);
    }
    functions.forEach((prom, index) => {
      return prom()
        .then((res) => {
          results[index] = res;
          counter++;

          if (counter == functions.length) {
            resolve(results);
          }
        })
        .catch((error) => {
          reject(error);
        });
    });
  });
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */

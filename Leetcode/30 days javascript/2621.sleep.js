/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
  const prom = new Promise((resolve) => setTimeout(resolve, millis));
  return prom;
}

/**
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */

/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */

// var join = function (arr1, arr2) {
//   const ob = {};
//   for (const i of arr1) {
//     ob[i.id] = i;
//   }
//   for (const i of arr2) {
//     ob[i.id] = ob[i.id] ? { ...ob[i.id], ...i } : i;
//   }
//   return Object.values(ob);
// };

var join = function (arr1, arr2) {
  let entries = {};
  for (a of arr1.concat(arr2)) {
    let exsisting = entries[a.id] ? entries[a.id] : {};
    entries[a.id] = { ...exsisting, ...a };
  }
  return Object.values(entries);
};

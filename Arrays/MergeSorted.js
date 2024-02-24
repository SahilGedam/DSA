function mergeSortedArrays(array1, array2) {
  const mergedArrays = [];
  let arrayItem1 = array1[0];
  let arrayItem2 = array2[0];
  let i = 1;
  let j = 1;

  // check input
  if (array1.length === 0) {
    return array2;
  }
  if (array2.length === 0) {
    return array1;
  }
  while (arrayItem1 || arrayItem2) {
    if (!arrayItem2 || arrayItem1 < arrayItem2) {
      mergedArrays.push(arrayItem1);
      arrayItem1 = array1[i];
      i++;
    } else {
      mergedArrays.push(arrayItem2);
      arrayItem2 = array2[j];
      j++;
    }
  }
  console.log(mergedArrays);
}
mergeSortedArrays([1, 2, 3, 4, 5], [3, 4, 5, 6]);
